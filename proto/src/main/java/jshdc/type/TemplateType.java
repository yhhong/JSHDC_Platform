package jshdc.type;

/**
 * 模板ID
 * Created by yinghuihong on 16/2/23.
 */
public interface TemplateType {
    /**
     * 通用轮播模板
     */
    String COMMON_CAROUSEL = "COMMON_CAROUSEL";

    /**
     * OTT模块 - 数量模糊的模板(搜索场景)
     */
    String OTT_BLUR = "OTT_BLUR";
    /**
     * OTT模块 - 一行两列的模板
     */
    String OTT_ONE_TWO = "OTT_ONE_TWO";
    /**
     * OTT模块 - 一行三列的模板
     */
    String OTT_ONE_THREE = "OTT_ONE_THREE";
    /**
     * OTT模块 - 一行四列的模板
     */
    String OTT_ONE_FOUR = "OTT_ONE_FOUR";
    /**
     * 应用模块 - 数量模糊的模板(搜索场景)
     */
    String APP_BLUR = "APP_BLUR";
    /**
     * 应用模块 - 两行三列的模板
     */
    String APP_TWO_THREE = "APP_TWO_THREE";
    /**
     * 应用模块 - 三行一列的模板
     */
    String APP_THREE_ONE = "APP_THREE_ONE";
}
