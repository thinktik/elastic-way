package cc.omoz.facade.omoz.envs;

/**
 * 当前程序所在的环境
 * <p>
 * 注意: Stage并不是AWS的标准环境变量，是OMOZ的定义，标记多个不同的开发阶段. 比如feature/dev/test/pre/prod
 *
 * @author ThinkTik
 */
public interface OmozCurrentStage {
    /**
     * 获取当前程序所在的环境
     *
     * @return 运行环境, 默认为feature
     */
    String getStage();
}
