package cc.omoz.facade.omoz.envs.impl;

import cc.omoz.facade.omoz.envs.OmozCurrentStage;

import java.util.Optional;

public class OmozCurrentStageImpl implements OmozCurrentStage {

    @Override
    public String getStage() {
        /*
         *
         * 优先级:
         *  1. Environment Variables
         *  2. Java System Properties
         *  3. default value: dev
         */
        return Optional.ofNullable(System.getenv("stage")).orElseGet(() -> System.getProperty("stage", "dev"));
    }
}
