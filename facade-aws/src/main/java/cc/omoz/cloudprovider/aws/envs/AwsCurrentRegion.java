package cc.omoz.cloudprovider.aws.envs;

import software.amazon.awssdk.regions.Region;

/**
 * 当前的所在的AWS Region
 *
 * @author ThinkTik
 */
public interface AwsCurrentRegion {
    /**
     * 获取当前程序所在的AWS Region name
     *
     * @return region name
     */
    Region getRegion();
}
