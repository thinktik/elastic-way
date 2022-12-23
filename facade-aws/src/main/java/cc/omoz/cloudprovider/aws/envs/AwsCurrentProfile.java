package cc.omoz.cloudprovider.aws.envs;

/**
 * 当前的所使用的AWS Profile
 *
 * @author ThinkTik
 */
public interface AwsCurrentProfile {
    /**
     * 获取当前程序使用的profile name
     *
     * @return profile name
     */
    String getProfileName();
}
