package jshdc.controller;

import jshdc.bean.response.system.*;
import jshdc.content.ContentUrl;
import jshdc.type.ContentType;
import jshdc.type.ModuleType;
import jshdc.type.TemplateType;
import jshdc.type.ViewType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yinghuihong on 16/5/16.
 */
@RestController
public class SystemController {

    @RequestMapping(value = "/getColumns")
    public GetColumnsResp getColumns(@RequestParam String userToken,
                                     @RequestParam String module,
                                     @RequestParam long lastModifyTime) {
        GetColumnsResp resp = new GetColumnsResp();

        if (lastModifyTime > (System.currentTimeMillis() - 60 * 1000)) {
            resp.result = 1;
            resp.message = "没有更新的数据了..";
            return resp;
        }

        List<Column> columns = new ArrayList<>();

        switch (module) {
            case ModuleType.FACADE:
                columns.add(new Column("1000", "运营首页模块", null));
                break;
            case ModuleType.LIVE:
                columns.add(new Column("2000", "直播模块", null));
                break;
            case ModuleType.VOD:
                columns.add(new Column("3000", "点播模块", null));
                columns.add(new Column("3001", "精选", "3000"));
                columns.add(new Column("3002", "欧美", "3000"));
                columns.add(new Column("3003", "电视剧", "3000"));
                columns.add(new Column("3004", "娱乐", "3000"));
                columns.add(new Column("3005", "健康", "3000"));
                columns.add(new Column("3006", "教育", "3000"));
                columns.add(new Column("3007", "韩剧", "3000"));
                columns.add(new Column("3008", "综艺", "3000"));
                break;
            case ModuleType.APP:
                columns.add(new Column("4000", "应用模块", null));
                columns.add(new Column("4001", "首页", "4000"));
                columns.add(new Column("4002", "教育学习", "4000"));
                columns.add(new Column("4003", "娱乐休闲", "4000"));
                columns.add(new Column("4004", "健身健美", "4000"));
                columns.add(new Column("4005", "影音视听", "4000"));
                columns.add(new Column("4006", "游戏天地", "4000"));
                break;
            default:
                resp.result = 1;
                resp.message = "Fail, the module type of" + module + " is undefined";
                System.out.println(resp);
                return resp;
        }
        resp.columns = columns;
        resp.result = 0;
        resp.message = "success";
        resp.lastModifyTime = System.currentTimeMillis();
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getFloors")
    public GetFloorsResp getFloors(@RequestParam String userToken,
                                   @RequestParam String columnId,
                                   @RequestParam long lastModifyTime) {
        GetFloorsResp resp = new GetFloorsResp();

        if (lastModifyTime > (System.currentTimeMillis() - 60 * 1000)) {
            resp.result = 1;
            resp.message = "没有更新的数据了..";
            return resp;
        }
        List<Floor> floors = new ArrayList<>();
        switch (columnId) {
            case "1000":
                List<Content> contents1 = new ArrayList<>();
                contents1.add(new Content("1", "飞屋环游记", ContentUrl.Pic.PIC_BIG_1, ContentType.VIDEO, "1", null, null));
                contents1.add(new Content("2", "叛逆的鲁路修第110话", ContentUrl.Pic.PIC_BIG_2, ContentType.VIDEO, "2", null, null));
                contents1.add(new Content("3", "少年派的奇幻漂流", ContentUrl.Pic.PIC_BIG_3, ContentType.VIDEO, "3", null, null));
                contents1.add(new Content("4", "海贼王第710话", ContentUrl.Pic.PIC_BIG_4, ContentType.VIDEO, "4", null, null));
                floors.add(new Floor("0", null, "排序", TemplateType.COMMON_CAROUSEL, null, null, null, contents1, null));

                List<Content> contents2 = new ArrayList<>();
                contents2.add(new Content("5", "[CCTV5]世界杯战况", ContentUrl.Pic.PIC_PROGRAM_1, ContentType.PROGRAM, "1", "9.6", "10000次"));
                contents2.add(new Content("6", "[江苏卫视]舌尖上的中国", ContentUrl.Pic.PIC_PROGRAM_3, ContentType.PROGRAM, "2", "9.6", "2000次"));
                floors.add(new Floor("0", "直播", "排序", TemplateType.OTT_ONE_TWO, ViewType.LIVE_MAIN, "CCTV5/江苏卫视", null, contents2, null));

                List<Content> contents3 = new ArrayList<>();
                contents3.add(new Content("7", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, ContentType.VIDEO, "5", "9.6", null));
                contents3.add(new Content("8", "全职猎人", ContentUrl.Pic.PIC_SMALL_2, ContentType.VIDEO, "6", "9.6", null));
                floors.add(new Floor("0", "点播", "排序", TemplateType.OTT_ONE_TWO, ViewType.VOD_MAIN, "精选/欧美/电视剧/娱乐", null, contents3, null));

                List<Content> contents4 = new ArrayList<>();
                contents4.add(new Content("9", "微博", ContentUrl.Pic.PIC_APP_2, ContentType.APP, "2", null, null));
                contents4.add(new Content("10", "淘宝", ContentUrl.Pic.PIC_APP_3, ContentType.APP, "3", null, null));
                contents4.add(new Content("11", "QQ空间", ContentUrl.Pic.PIC_APP_4, ContentType.APP, "4", null, null));
                contents4.add(new Content("12", "微信", ContentUrl.Pic.PIC_APP_6, ContentType.APP, "6", null, null));
                floors.add(new Floor("0", "应用", "排序", TemplateType.OTT_ONE_FOUR, ViewType.APP_MAIN, "更多", null, contents4, null));
                break;
            case "2000":
                List<Content> liveContents1 = new ArrayList<>();
                liveContents1.add(new Content("1", "飞屋环游记", ContentUrl.Pic.PIC_BIG_1, ContentType.PROGRAM, "1", null, null));
                liveContents1.add(new Content("2", "叛逆的鲁路修第110话", ContentUrl.Pic.PIC_BIG_2, ContentType.PROGRAM, "2", null, null));
                liveContents1.add(new Content("3", "少年派的奇幻漂流", ContentUrl.Pic.PIC_BIG_3, ContentType.PROGRAM, "3", null, null));
                liveContents1.add(new Content("4", "海贼王第710话", ContentUrl.Pic.PIC_BIG_4, ContentType.PROGRAM, "4", null, null));
                floors.add(new Floor("0", null, "排序", TemplateType.COMMON_CAROUSEL, null, null, null, liveContents1, null));

                List<Content> liveContents2 = new ArrayList<>();
                liveContents2.add(new Content("9", "巴西世界杯", ContentUrl.Pic.PIC_PROGRAM_1, ContentType.PROGRAM, "5", "9.6", null));
                liveContents2.add(new Content("10", "新闻30分", ContentUrl.Pic.PIC_PROGRAM_2, ContentType.PROGRAM, "6", "9.6", null));
                floors.add(new Floor("0", "精彩回看", "排序", TemplateType.OTT_ONE_TWO, ViewType.LIVE_PROGRAMME, "所有回看", null, liveContents2, null));

                List<Content> liveContents3 = new ArrayList<>();
                liveContents3.add(new Content("11", "湖南卫视", ContentUrl.Pic.PIC_TV_1, ContentType.CHANNEL, "1", "9.6", "10000次"));
                liveContents3.add(new Content("12", "昆明卫视", ContentUrl.Pic.PIC_TV_2, ContentType.CHANNEL, "2", "9.6", "2000次"));
                liveContents3.add(new Content("13", "江苏卫视", ContentUrl.Pic.PIC_TV_3, ContentType.CHANNEL, "3", "9.6", "3000次"));
                liveContents3.add(new Content("14", "东方卫视", ContentUrl.Pic.PIC_TV_4, ContentType.CHANNEL, "4", "9.6", "5000次"));
                floors.add(new Floor("0", "热门电视", "排序", TemplateType.OTT_ONE_FOUR, ViewType.LIVE_PROGRAMME, "所有电视", null, liveContents3, null));

                List<Content> liveContents4 = new ArrayList<>();
                liveContents4.add(new Content("15", "奔跑吧兄弟", ContentUrl.Pic.PIC_PROGRAM_4, ContentType.CHANNEL, "5", "9.6", null));
                liveContents4.add(new Content("16", "快乐大本营", ContentUrl.Pic.PIC_PROGRAM_5, ContentType.CHANNEL, "6", "9.6", null));
                floors.add(new Floor("0", "综艺直播", "排序", TemplateType.OTT_ONE_TWO, ViewType.LIVE_PROGRAMME, "更多", null, liveContents4, null));
                break;
            case "3001":
            case "3002":
            case "3003":
            case "3004":
            case "3005":
            case "3006":
            case "3007":
            case "3008":
                List<Content> vodContents1 = new ArrayList<>();
                vodContents1.add(new Content("1", "飞屋环游记", ContentUrl.Pic.PIC_BIG_1, ContentType.VIDEO, "1", null, null));
                vodContents1.add(new Content("2", "叛逆的鲁路修第110话", ContentUrl.Pic.PIC_BIG_2, ContentType.VIDEO, "2", null, null));
                vodContents1.add(new Content("3", "少年派的奇幻漂流", ContentUrl.Pic.PIC_BIG_3, ContentType.VIDEO, "3", null, null));
                vodContents1.add(new Content("4", "海贼王第710话", ContentUrl.Pic.PIC_BIG_4, ContentType.VIDEO, "4", null, null));
                floors.add(new Floor("0", null, "排序", TemplateType.COMMON_CAROUSEL, null, null, null, vodContents1, null));

                List<Content> vodContents2 = new ArrayList<>();
                vodContents2.add(new Content("21", "霍比特人意外之旅", ContentUrl.Pic.PIC_SMALL_6, ContentType.VIDEO, "5", "9.6", "10000次"));
                vodContents2.add(new Content("22", "指环王", ContentUrl.Pic.PIC_SMALL_7, ContentType.VIDEO, "6", "9.6", "2000次"));
                floors.add(new Floor("0", "电影", "排序", TemplateType.OTT_ONE_TWO, null, null, null, vodContents2, null));

                List<Content> vodContents3 = new ArrayList<>();
                vodContents3.add(new Content("31", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, ContentType.TELEPLAY, "1", null, null));
                vodContents3.add(new Content("32", "全职猎人", ContentUrl.Pic.PIC_SMALL_2, ContentType.TELEPLAY, "2", null, null));
                vodContents3.add(new Content("33", "乌龙派出所", ContentUrl.Pic.PIC_SMALL_3, ContentType.TELEPLAY, "3", null, null));
                floors.add(new Floor("0", "电视剧", "排序", TemplateType.OTT_ONE_THREE, null, null, null, vodContents3, null));

                List<Content> vodContents4 = new ArrayList<>();
                vodContents4.add(new Content("23", "幽游白书", ContentUrl.Pic.PIC_SMALL_4, ContentType.VIDEO, "8", "9.6", null));
                vodContents4.add(new Content("24", "神奇宝贝", ContentUrl.Pic.PIC_SMALL_5, ContentType.VIDEO, "9", "9.6", null));
                floors.add(new Floor("0", "动漫", "排序", TemplateType.OTT_ONE_TWO, null, null, null, vodContents4, null));
                break;
            case "4001":
            case "4002":
            case "4003":
            case "4004":
            case "4005":
            case "4006":
                List<Content> appContents1 = new ArrayList<>();
                appContents1.add(new Content("2", "微博", ContentUrl.Pic.PIC_BIG_4, ContentType.APP, null, null, null));
                appContents1.add(new Content("3", "淘宝", ContentUrl.Pic.PIC_BIG_3, ContentType.APP, null, null, null));
                appContents1.add(new Content("5", "搜狗输入法", ContentUrl.Pic.PIC_BIG_2, ContentType.APP, null, null, null));
                floors.add(new Floor("0", "轮播类型..", "排序", TemplateType.COMMON_CAROUSEL, null, null, null, appContents1, null));

                List<Content> appContents2 = new ArrayList<>();
                appContents2.add(new Content("2", "微博", ContentUrl.Pic.PIC_APP_BIG_2, ContentType.APP, null, null, null));
                appContents2.add(new Content("3", "淘宝", ContentUrl.Pic.PIC_APP_BIG_3, ContentType.APP, null, null, null));
                appContents2.add(new Content("6", "微信", ContentUrl.Pic.PIC_APP_BIG_6, ContentType.APP, null, null, null));
                floors.add(new Floor("0", "教育学习", "排序", TemplateType.APP_THREE_ONE, null, null, null, appContents2, null));

                List<Content> appContents3 = new ArrayList<>();
                appContents3.add(new Content("1", "相机360", ContentUrl.Pic.PIC_APP_BIG_1, ContentType.APP, null, null, null));
                appContents3.add(new Content("2", "微博", ContentUrl.Pic.PIC_APP_BIG_2, ContentType.APP, null, null, null));
                appContents3.add(new Content("3", "淘宝", ContentUrl.Pic.PIC_APP_BIG_3, ContentType.APP, null, null, null));
                appContents3.add(new Content("4", "QQ空间", ContentUrl.Pic.PIC_APP_BIG_4, ContentType.APP, null, null, null));
                appContents3.add(new Content("5", "搜狗输入法", ContentUrl.Pic.PIC_APP_BIG_5, ContentType.APP, null, null, null));
                appContents3.add(new Content("6", "微信", ContentUrl.Pic.PIC_APP_BIG_6, ContentType.APP, null, null, null));
                floors.add(new Floor("0", "热门排行", "排序", TemplateType.APP_TWO_THREE, null, null, null, appContents3, null));
                break;
            default:
                resp.result = 1;
                resp.message = "Fail, the columnId of " + columnId + " is undefined";
                System.out.println(resp);
                return resp;
        }

        resp.floors = floors;
        resp.result = 0;
        resp.message = "success";
        resp.lastModifyTime = System.currentTimeMillis();
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getContents")
    public GetContentsResp getContents(@RequestParam String userToken,
                                       @RequestParam String floorId,
                                       @RequestParam(required = false, defaultValue = "0") int start,
                                       @RequestParam(required = false, defaultValue = "20") int limit) {
        List<Content> contents = new ArrayList<>();
        contents.add(new Content("23", "幽游白书", ContentUrl.Pic.PIC_SMALL_4, ContentType.VIDEO, "8", "9.6", null));
        contents.add(new Content("24", "神奇宝贝", ContentUrl.Pic.PIC_SMALL_5, ContentType.VIDEO, "9", "9.6", null));

        GetContentsResp resp = new GetContentsResp();
        resp.contents = contents;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/search")
    public SearchResp search(@RequestParam String userToken,
                             @RequestParam String text,
                             @RequestParam(required = false, defaultValue = "0") int start,
                             @RequestParam(required = false, defaultValue = "20") int limit) {
        List<Content> contents = new ArrayList<>();
        contents.add(new Content("23", "幽游白书", ContentUrl.Pic.PIC_SMALL_4, ContentType.VIDEO, "8", null, null));
        contents.add(new Content("24", "神奇宝贝", ContentUrl.Pic.PIC_SMALL_5, ContentType.VIDEO, "9", null, null));
        contents.add(new Content("3", "少年派的奇幻漂流", ContentUrl.Pic.PIC_SMALL_6, ContentType.VIDEO, "3", null, null));

        contents.add(new Content("1", "相机360", ContentUrl.Pic.PIC_APP_1, ContentType.APP, "1", null, null));
        contents.add(new Content("2", "微博", ContentUrl.Pic.PIC_APP_2, ContentType.APP, "2", null, null));
        contents.add(new Content("3", "淘宝", ContentUrl.Pic.PIC_APP_3, ContentType.APP, "3", null, null));

        SearchResp resp = new SearchResp();
        resp.contents = contents;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }
}
