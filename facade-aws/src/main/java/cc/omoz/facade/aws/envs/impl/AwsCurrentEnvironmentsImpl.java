package cc.omoz.facade.aws.envs.impl;

import cc.omoz.facade.aws.envs.AwsCurrentEnvironments;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.profiles.Profile;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.regions.providers.AwsRegionProviderChain;
import software.amazon.awssdk.regions.providers.DefaultAwsRegionProviderChain;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * AwsCurrentEnvironmets的实现类
 *
 * @author ThinkTik
 */
public class AwsCurrentEnvironmentsImpl implements AwsCurrentEnvironments {

    @Override
    public AwsCredentials getCredentials() {
        /*
         * 参考:
         *   https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/credentials.html
         *   https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/auth/credentials/DefaultCredentialsProvider.html
         *
         * 优先级:
         *  1. Environment Variables  ...
         *  2. Java System Properties ...
         *  3. Web Identity Token credentials from the environment or container
         *  4. Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI
         *  5. Credentials delivered through the Amazon EC2 container service ...
         *  6. Instance profile credentials delivered through the Amazon EC2 metadata service
         */

        // https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/credentials.html#credentials-chain
        // 获取awsCredentialsProviderChain,也就是使用默认的DefaultAWSCredentialsProviderChain
        AwsCredentials awsCredentials = null;
        try (DefaultCredentialsProvider credentialsProvider = DefaultCredentialsProvider.create()) {
            awsCredentials = credentialsProvider.resolveCredentials();
        } catch (Exception ignoredException) {
            Logger.getGlobal().log(Level.WARNING, "Warning: Can not get AWS credential !!!");
        }

        // 获取对应的credentials并返回
        return awsCredentials;
    }


    @Override
    public String getProfileName() {
        /*
         * 优先级:
         *  1. Environment Variables
         *  2. Java System Properties
         *  3. default value: DEFAULT_PROFILE_NAME
         */

        return Profile.builder().build().name();
    }

    @Override
    public Region getRegion() {
        /*
         * 参考:
         *  https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/region-selection.html
         *  https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/region-selection.html#automatically-determine-the-aws-region-from-the-environment
         *  https://stackoverflow.com/questions/51886219/how-can-we-determine-the-current-region-with-aws-fargate
         *
         * 优先级:
         *  1. Environment Variables
         *  2. Profile Settings
         */

        // 获取 AwsRegionProviderChain
        // 获取 AwsRegionProviderChain
        AwsRegionProviderChain awsRegionProviderChain = DefaultAwsRegionProviderChain.builder().build();
        return awsRegionProviderChain.getRegion();
    }

}
