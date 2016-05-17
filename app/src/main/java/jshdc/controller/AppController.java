package jshdc.controller;

import jshdc.bean.response.app.AppInfo;
import jshdc.bean.response.app.GetAppDetailResp;
import jshdc.bean.response.app.GetAppRecommendResp;
import jshdc.content.ContentUrl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinghuihong on 16/5/16.
 */
@RestController
public class AppController {

    @RequestMapping(value = "/getAppDetail")
    public GetAppDetailResp getAppDetail(@RequestParam String userToken,
                                         @RequestParam String appId) {
        GetAppDetailResp resp = new GetAppDetailResp();
        List<AppInfo> appInfos = provideAppInfos();
        for (AppInfo appInfo : appInfos) {
            if (appInfo.appId.equals(appId)) {
                resp.appInfo = appInfo;
                resp.result = 0;
                resp.message = "success";
                System.out.println(resp);
                return resp;
            }
        }
        resp.result = 1;
        resp.message = "fail";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getAppRecommends")
    public GetAppRecommendResp getAppRecommends(@RequestParam String userToken,
                                                @RequestParam String appId,
                                                @RequestParam(required = false, defaultValue = "0") int start,
                                                @RequestParam(required = false, defaultValue = "20") int limit) {
        GetAppRecommendResp resp = new GetAppRecommendResp();
        resp.appInfos = provideAppInfos();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }


    /**
     * mock data
     *
     * @return
     */
    private List<AppInfo> provideAppInfos() {
        List<AppInfo> appInfos = new ArrayList<>();

        AppInfo appInfo1 = new AppInfo();
        appInfo1.appId = "1";
        appInfo1.appTypeId = null;
        appInfo1.appCode = "";
        appInfo1.appName = "相机360";
        appInfo1.appDesc = "\uF0FC\t全球超过5亿用户都在用，受到网友热烈好评\n" +
                "\uF0FC\tAKB48特别推荐，防弹少年团等众多日韩明星都是Camera360的忠实用户\n" +
                "\uF0FC\t7个国家摄影榜长期排名第一，苹果官方13个国家首页推荐，引领全球手机摄影潮流！\n" +
                "======功能亮点======\n" +
                "【经典滤镜】";
        appInfo1.appTypeClass = "unknown";
        appInfo1.appTypePackage = "unknown";
        appInfo1.downloadTimes = "20020000";
        appInfo1.downloadUrl = "http://www.wandoujia.com/apps/vStudio.Android.Camera360/binding?source=wandoujia-web_inner_referral_binded";
        appInfo1.score = "3.8";
        appInfo1.chargeFlag = false;
        appInfo1.price = null;
        appInfo1.visibleFlag = false;
        appInfo1.appLevel = "1";
        appInfo1.appSlogo = ContentUrl.Pic.PIC_APP_1;
        appInfo1.appLogo = ContentUrl.Pic.PIC_APP_BIG_1;
        appInfo1.size = "10.7M";
        appInfos.add(appInfo1);

        AppInfo appInfo2 = new AppInfo();
        appInfo2.appId = "2";
        appInfo2.appTypeId = null;
        appInfo2.appCode = "";
        appInfo2.appName = "微博";
        appInfo2.appDesc = "随时随地发现新鲜事！微博带你欣赏世界上每一个精彩瞬间，了解每一个幕后故事。分享你想表达的，让全世界都能听到你的心声。\n" +
                "在微博：\n" +
                "-你能看到最新，最全面的资讯内容。";
        appInfo2.appTypeClass = "unknown";
        appInfo2.appTypePackage = "unknown";
        appInfo2.downloadTimes = "30050000";
        appInfo2.downloadUrl = "http://www.wandoujia.com/apps/com.sina.weibo/binding?source=wandoujia-web_inner_referral_binded";
        appInfo2.score = "3.8";
        appInfo2.chargeFlag = false;
        appInfo2.price = null;
        appInfo2.visibleFlag = false;
        appInfo2.appLevel = "1";
        appInfo2.appSlogo = ContentUrl.Pic.PIC_APP_2;
        appInfo2.appLogo = ContentUrl.Pic.PIC_APP_BIG_2;
        appInfo2.size = "18.1M";
        appInfos.add(appInfo2);

        AppInfo appInfo3 = new AppInfo();
        appInfo3.appId = "3";
        appInfo3.appTypeId = null;
        appInfo3.appCode = "";
        appInfo3.appName = "淘宝";
        appInfo3.appDesc = "517淘宝外卖饿货节，全场美食5折起，更有517元大粮票等你来抢！\n" +
                "【软件简介】 \n" +
                "手机淘宝（Android版）是阿里巴巴专为Android手机用户推出的满足其生活消费和线上购物需求的软件，具有查看附近的生活优惠信息、商品搜索、浏览、购买、支付、收藏、物流查询、旺旺沟通等在线功能，成为了用户方便快捷的生活消费入口。";
        appInfo3.appTypeClass = "unknown";
        appInfo3.appTypePackage = "unknown";
        appInfo3.downloadTimes = "50050000";
        appInfo3.downloadUrl = "http://www.wandoujia.com/apps/com.taobao.taobao/binding?source=wandoujia-web_inner_referral_binded";
        appInfo3.score = "3.8";
        appInfo3.chargeFlag = false;
        appInfo3.price = null;
        appInfo3.visibleFlag = false;
        appInfo3.appLevel = "2";
        appInfo3.appSlogo = ContentUrl.Pic.PIC_APP_3;
        appInfo3.appLogo = ContentUrl.Pic.PIC_APP_BIG_3;
        appInfo3.size = "20.3M";
        appInfos.add(appInfo3);

        AppInfo appInfo4 = new AppInfo();
        appInfo4.appId = "4";
        appInfo4.appTypeId = null;
        appInfo4.appCode = "";
        appInfo4.appName = "QQ空间";
        appInfo4.appDesc = "QQ空间，致力于帮助用户随时随地“分享生活，留住感动”。您可以使用手机查看好友动态、与好友互动，上传照片、写说说、写日志、签到、送礼；更有“玩吧”汇聚众多热门游戏，满足各种娱乐需求。QQ空间，分享生活，留住感动。";
        appInfo4.appTypeClass = "unknown";
        appInfo4.appTypePackage = "unknown";
        appInfo4.downloadTimes = "192020000";
        appInfo4.downloadUrl = "http://www.wandoujia.com/apps/com.qzone/binding?source=wandoujia-web_inner_referral_binded";
        appInfo4.score = "3.9";
        appInfo4.chargeFlag = false;
        appInfo4.price = null;
        appInfo4.visibleFlag = false;
        appInfo4.appLevel = "1";
        appInfo4.appSlogo = ContentUrl.Pic.PIC_APP_4;
        appInfo4.appLogo = ContentUrl.Pic.PIC_APP_BIG_4;
        appInfo4.size = "15.7M";
        appInfos.add(appInfo4);

        AppInfo appInfo5 = new AppInfo();
        appInfo5.appId = "5";
        appInfo5.appTypeId = null;
        appInfo5.appCode = "";
        appInfo5.appName = "搜狗输入法";
        appInfo5.appDesc = "搜狗输入法以提升用户体验为宗旨，致力于为亿万手机用户提供手机端智能、易用的输入法产品。\n" +
                "1. 拥有40万超大词库、算法智能、响应速度快、首选率高等优秀基础品质。\n" +
                "2. 支持整句输入、键盘语音、全屏手写、英文候选、智能云输入、表情输入、多媒体输入等众多特色功能。\n" +
                "3. 超级键盘支持中文、英文、数字、符号的混合输入免切换，只在中文键盘就搞定。\n" +
                "4 . 兼容PC皮肤，支持自定义键盘壁纸、键盘调节、夜间模式等特色功能，让输入法看着漂亮，用着舒心。\n" +
                "5. 搜狗工具箱多项扩展功能，二维码扫描、颜文字、祝福短信、诗词、笑话、百科全方位拓展输入内容。";
        appInfo5.appTypeClass = "unknown";
        appInfo5.appTypePackage = "unknown";
        appInfo5.downloadTimes = "12020000";
        appInfo5.downloadUrl = "http://www.wandoujia.com/apps/com.sohu.inputmethod.sogou/binding?source=wandoujia-web_inner_referral_binded";
        appInfo5.score = "3.1";
        appInfo5.chargeFlag = false;
        appInfo5.price = null;
        appInfo5.visibleFlag = false;
        appInfo5.appLevel = "1";
        appInfo5.appSlogo = ContentUrl.Pic.PIC_APP_5;
        appInfo5.appLogo = ContentUrl.Pic.PIC_APP_BIG_5;
        appInfo5.size = "12.7M";
        appInfos.add(appInfo5);

        AppInfo appInfo6 = new AppInfo();
        appInfo6.appId = "6";
        appInfo6.appTypeId = null;
        appInfo6.appCode = "";
        appInfo6.appName = "微信";
        appInfo6.appDesc = "1.可以发语音、文字消息、表情、图片、视频。30M流量可以收发上千条语音。\n" +
                "2.朋友圈，跟朋友们分享生活点滴。\n" +
                "3.摇一摇、查看附近的人，世界不再有陌生人。\n" +
                "4.扫一扫，可以扫商品条码、图书封面、CD封面，甚至扫描英文单词来翻译成中文。\n" +
                "5.公众帐号，用微信关注明星、看新闻、设提醒…";
        appInfo6.appTypeClass = "unknown";
        appInfo6.appTypePackage = "unknown";
        appInfo6.downloadTimes = "5230000";
        appInfo6.downloadUrl = "http://www.wandoujia.com/apps/com.tencent.mm/binding?source=wandoujia-web_inner_referral_binded";
        appInfo6.score = "4.8";
        appInfo6.chargeFlag = false;
        appInfo6.price = null;
        appInfo6.visibleFlag = false;
        appInfo6.appLevel = "1";
        appInfo6.appSlogo = ContentUrl.Pic.PIC_APP_6;
        appInfo6.appLogo = ContentUrl.Pic.PIC_APP_BIG_6;
        appInfo6.size = "30.7M";
        appInfos.add(appInfo6);
        return appInfos;
    }
}
