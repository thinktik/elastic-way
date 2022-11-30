package cc.omoz.facade.aws.envs;

import software.amazon.awssdk.auth.credentials.AwsCredentials;

/**
 * 当前的所使用的AWS Credentials
 *
 * @author ThinkTik
 */
public interface AwsCurrentCredentials {
    /**
     * 获取当前程序使用的aws credentials
     *
     * @return aws credentials
     */
    AwsCredentials getCredentials();

}
