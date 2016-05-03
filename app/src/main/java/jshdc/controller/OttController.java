package jshdc.controller;

import jshdc.bean.*;
import jshdc.bean.response.ott.*;
import jshdc.content.ContentUrl;
import jshdc.type.ContentType;
import jshdc.type.TemplateType;
import jshdc.type.ViewType;
import jshdc.util.DateUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * OTT视频
 * Created by yinghuihong on 16/1/8.
 */
@RestController
public class OttController {

    @RequestMapping(value = "/getColumns")
    public GetColumnsResp getColumns(@RequestParam String userToken,
                                     @RequestParam long lastModifyTime) {
        GetColumnsResp resp = new GetColumnsResp();

        if (lastModifyTime > (System.currentTimeMillis() - 60 * 1000)) {
            resp.result = 1;
            resp.message = "没有更新的数据了..";
            return resp;
        }
        List<Column> columns = new ArrayList<>();

        columns.add(new Column("2", "精选"));
        columns.add(new Column("3", "欧美"));
        columns.add(new Column("4", "电视剧"));
        columns.add(new Column("5", "娱乐"));
        columns.add(new Column("6", "健康"));
        columns.add(new Column("7", "教育"));
        columns.add(new Column("8", "韩剧"));
        columns.add(new Column("9", "综艺"));

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
            case "0":
                List<Content> contents1 = new ArrayList<>();
                contents1.add(new Content("1", "飞屋环游记", ContentUrl.Pic.PIC_BIG_1, ContentType.VIDEO, "视频ID", ContentUrl.MOVE1, null, null));
                contents1.add(new Content("2", "叛逆的鲁路修第110话", ContentUrl.Pic.PIC_BIG_2, ContentType.VIDEO, "视频ID", ContentUrl.MOVE2, null, null));
                contents1.add(new Content("3", "少年派的奇幻漂流", ContentUrl.Pic.PIC_BIG_3, ContentType.VIDEO, "视频ID", ContentUrl.MOVE3, null, null));
                contents1.add(new Content("4", "海贼王第710话", ContentUrl.Pic.PIC_BIG_4, ContentType.VIDEO, "视频ID", ContentUrl.MOVE4, null, null));
                floors.add(new Floor("0", null, "排序", TemplateType.CAROUSEL, null, null, null, null, contents1, null));

                List<Content> contents2 = new ArrayList<>();
                contents2.add(new Content("5", "[CCTV5]世界杯战况", ContentUrl.Pic.PIC_PROGRAM_1, ContentType.PROGRAM, "1", ContentUrl.CCTV1_LOOK_BACK_PROGRAM1, "9.6", "10000次"));
                contents2.add(new Content("6", "[江苏卫视]舌尖上的中国", ContentUrl.Pic.PIC_PROGRAM_3, ContentType.PROGRAM, "2", ContentUrl.CCTV1_LOOK_BACK_PROGRAM2, "9.6", "2000次"));
                floors.add(new Floor("0", "直播", "排序", TemplateType.COUNT_TWO, ViewType.LIVE_MAIN, null, "CCTV5/江苏卫视", null, contents2, null));

                List<Content> contents3 = new ArrayList<>();
                contents3.add(new Content("7", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, ContentType.VIDEO, "视频ID", ContentUrl.MOVE5, "9.6", null));
                contents3.add(new Content("8", "全职猎人", ContentUrl.Pic.PIC_SMALL_2, ContentType.VIDEO, "视频ID", ContentUrl.MOVE6, "9.6", null));
                floors.add(new Floor("0", "点播", "排序", TemplateType.COUNT_TWO, ViewType.VOD_MAIN, null, "精选/欧美/电视剧/娱乐", null, contents3, null));
                break;
            case "1":
                List<Content> liveContents1 = new ArrayList<>();
                liveContents1.add(new Content("1", "飞屋环游记", ContentUrl.Pic.PIC_BIG_1, ContentType.PROGRAM, "节目ID", ContentUrl.CCTV1_LOOK_BACK_PROGRAM1, null, null));
                liveContents1.add(new Content("2", "叛逆的鲁路修第110话", ContentUrl.Pic.PIC_BIG_2, ContentType.PROGRAM, "节目ID", ContentUrl.CCTV1_LOOK_BACK_PROGRAM2, null, null));
                liveContents1.add(new Content("3", "少年派的奇幻漂流", ContentUrl.Pic.PIC_BIG_3, ContentType.PROGRAM, "节目ID", ContentUrl.CCTV1_LOOK_BACK_PROGRAM1, null, null));
                liveContents1.add(new Content("4", "海贼王第710话", ContentUrl.Pic.PIC_BIG_4, ContentType.PROGRAM, "节目ID", ContentUrl.CCTV1_LOOK_BACK_PROGRAM1, null, null));
                floors.add(new Floor("0", null, "排序", TemplateType.CAROUSEL, null, null, null, null, liveContents1, null));

                List<Content> liveContents2 = new ArrayList<>();
                liveContents2.add(new Content("9", "巴西世界杯", ContentUrl.Pic.PIC_PROGRAM_1, ContentType.PROGRAM, "节目ID", ContentUrl.CCTV1_LOOK_BACK_PROGRAM1, "9.6", null));
                liveContents2.add(new Content("10", "新闻30分", ContentUrl.Pic.PIC_PROGRAM_2, ContentType.PROGRAM, "节目ID", ContentUrl.CCTV1_LOOK_BACK_PROGRAM2, "9.6", null));
                floors.add(new Floor("0", "精彩回看", "排序", TemplateType.COUNT_TWO, ViewType.LIVE_PROGRAMME, null, "所有回看", null, liveContents2, null));

                List<Content> liveContents3 = new ArrayList<>();
                liveContents3.add(new Content("11", "湖南卫视", ContentUrl.Pic.PIC_TV_1, ContentType.CHANNEL, "频道ID", ContentUrl.CCTV1, "9.6", "10000次"));
                liveContents3.add(new Content("12", "湖北卫视", ContentUrl.Pic.PIC_TV_2, ContentType.CHANNEL, "频道ID", ContentUrl.CCTV2, "9.6", "2000次"));
                liveContents3.add(new Content("13", "江苏卫视", ContentUrl.Pic.PIC_TV_3, ContentType.CHANNEL, "频道ID", ContentUrl.CCTV3, "9.6", "3000次"));
                liveContents3.add(new Content("14", "东方卫视", ContentUrl.Pic.PIC_TV_4, ContentType.CHANNEL, "频道ID", ContentUrl.CCTV4, "9.6", "5000次"));
                floors.add(new Floor("0", "热门电视", "排序", TemplateType.COUNT_FOUR, ViewType.LIVE_PROGRAMME, null, "所有电视", null, liveContents3, null));
                break;
            default:
                List<Content> vodContents1 = new ArrayList<>();
                vodContents1.add(new Content("1", "飞屋环游记", ContentUrl.Pic.PIC_BIG_1, ContentType.VIDEO, "视频ID", ContentUrl.MOVE1, null, null));
                vodContents1.add(new Content("2", "叛逆的鲁路修第110话", ContentUrl.Pic.PIC_BIG_2, ContentType.VIDEO, "视频ID", ContentUrl.MOVE2, null, null));
                vodContents1.add(new Content("3", "少年派的奇幻漂流", ContentUrl.Pic.PIC_BIG_3, ContentType.VIDEO, "视频ID", ContentUrl.MOVE3, null, null));
                vodContents1.add(new Content("4", "海贼王第710话", ContentUrl.Pic.PIC_BIG_4, ContentType.VIDEO, "视频ID", ContentUrl.MOVE4, null, null));
                floors.add(new Floor("0", null, "排序", TemplateType.CAROUSEL, null, null, null, null, vodContents1, null));

                List<Content> vodContents2 = new ArrayList<>();
                vodContents2.add(new Content("21", "霍比特人意外之旅", ContentUrl.Pic.PIC_SMALL_6, ContentType.VIDEO, "视频ID", ContentUrl.MOVE5, "9.6", "10000次"));
                vodContents2.add(new Content("22", "指环王", ContentUrl.Pic.PIC_SMALL_7, ContentType.VIDEO, "视频ID", ContentUrl.MOVE6, "9.6", "2000次"));
                floors.add(new Floor("0", "电影", "排序", TemplateType.COUNT_TWO, null, null, null, null, vodContents2, null));

                List<Content> vodContents3 = new ArrayList<>();
                vodContents3.add(new Content("31", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, ContentType.TELEPLAY, "电视剧ID", "电视剧内容ID", null, null));
                vodContents3.add(new Content("32", "全职猎人", ContentUrl.Pic.PIC_SMALL_2, ContentType.TELEPLAY, "电视剧ID", "电视剧内容ID", null, null));
                vodContents3.add(new Content("33", "乌龙派出所", ContentUrl.Pic.PIC_SMALL_3, ContentType.TELEPLAY, "电视剧ID", "电视剧内容ID", null, null));
                floors.add(new Floor("0", "电视剧", "排序", TemplateType.COUNT_THREE, null, null, null, null, vodContents3, null));

                List<Content> vodContents4 = new ArrayList<>();
                vodContents4.add(new Content("23", "幽游白书", ContentUrl.Pic.PIC_SMALL_4, ContentType.VIDEO, "视频ID", ContentUrl.MOVE7, "9.6", null));
                vodContents4.add(new Content("24", "神奇宝贝", ContentUrl.Pic.PIC_SMALL_5, ContentType.VIDEO, "视频ID", ContentUrl.MOVE8, "9.6", null));
                floors.add(new Floor("0", "动漫", "排序", TemplateType.COUNT_TWO, null, null, null, null, vodContents4, null));
                break;
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
        contents.add(new Content("23", "幽游白书", ContentUrl.Pic.PIC_SMALL_4, ContentType.VIDEO, "视频ID", ContentUrl.MOVE1, "9.6", null));
        contents.add(new Content("24", "神奇宝贝", ContentUrl.Pic.PIC_SMALL_5, ContentType.VIDEO, "视频ID", ContentUrl.MOVE2, "9.6", null));

        GetContentsResp resp = new GetContentsResp();
        resp.contents = contents;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getChannelDetail")
    public GetChannelDetailResp getChannelDetail(@RequestParam String userToken,
                                                 @RequestParam String channelId) {
        GetChannelDetailResp resp = new GetChannelDetailResp();
        Channel channel;
        switch (channelId) {
            case "1":
                channel = new Channel("1", "CCTV1", ContentUrl.CCTV1, null);
                break;
            case "2":
                channel = new Channel("2", "CCTV2", ContentUrl.CCTV2, null);
                break;
            case "3":
                channel = new Channel("3", "CCTV3", ContentUrl.CCTV3, null);
                break;
            case "4":
                channel = new Channel("4", "CCTV4", ContentUrl.CCTV4, null);
                break;
            case "5":
                channel = new Channel("5", "CCTV5", ContentUrl.CCTV5, null);
                break;
            case "6":
                channel = new Channel("6", "CCTV6", ContentUrl.CCTV6, null);
                break;
            case "7":
                channel = new Channel("7", "CCTV7", ContentUrl.CCTV7, null);
                break;
            case "8":
                channel = new Channel("8", "CCTV8", ContentUrl.CCTV8, null);
                break;
            case "9":
                channel = new Channel("9", "CCTV9", ContentUrl.CCTV9, null);
                break;
            case "10":
                channel = new Channel("10", "CCTV10", ContentUrl.CCTV10, null);
                break;
            default:
                channel = new Channel("1", "CCTV1", ContentUrl.CCTV1, null);
                break;
        }
        resp.channel = channel;
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getProgramDetail")
    public GetProgramDetailResp getProgramDetail(@RequestParam String userToken,
                                                 @RequestParam String programId) {
        GetProgramDetailResp resp = new GetProgramDetailResp();
        Program program;
        switch (programId) {
            case "1":
                program = new Program("1", "世界杯战况", ContentUrl.CCTV1_LOOK_BACK + "?PlaySeek=" + "20160420180000" + "-" + "20160420190000", "18:00", 60 * 60 * 1000, "回看", "2014年世界杯", "1");
                break;
            case "2":
                program = new Program("2", "新闻30分", ContentUrl.CCTV1_LOOK_BACK + "?PlaySeek=" + "20160420190000" + "-" + "20160420193500", "20160420190000", 35 * 60 * 1000, "回看", "CCTV9新闻台正午播放", "1");
                break;
            default:
                program = new Program("1", "世界杯战况", ContentUrl.CCTV1_LOOK_BACK + "?PlaySeek=" + "20160420180000" + "-" + "20160420190000", "18:00", 60 * 60 * 1000, "回看", "2014年世界杯", "1");
                break;
        }
        resp.program = program;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }


    @RequestMapping(value = "/getTeleplayDetail")
    public GetTeleplayDetailResp getTeleplayDetail(@RequestParam String userToken,
                                                   @RequestParam String teleplayId) {
        GetTeleplayDetailResp resp = new GetTeleplayDetailResp();
        Teleplay teleplay;
        switch (teleplayId) {
            case "1":
                teleplay = new Teleplay("1", "名侦探柯南", null, "导演", "柯南/新一/小兰", "真相只有一个", "9.1", "2001", "21亿", "400集", "256集", makeTeleplayVideos(256));
                break;
            case "2":
                teleplay = new Teleplay("2", "全职猎人", null, "导演", "小杰/西索", "惊险刺激的游戏世界,小杰与西索幻影旅团的精彩对决", "9.3", "2001", "500万", "80集", "80集", makeTeleplayVideos(80));
                break;
            case "3":
                teleplay = new Teleplay("3", "乌龙派出所", null, "导演", "两津勘吉/中山/本田", "龟有公园前派出所,爆笑登场", "9.9", "2001", "2000万", "320集", "320集", makeTeleplayVideos(320));
                break;
            default:
                teleplay = new Teleplay("1", "名侦探柯南", null, "导演", "柯南/新一/小兰", "真相只有一个", "9.1", "2001", "21亿", "400集", "156集", makeTeleplayVideos(156));
                break;
        }
        resp.teleplay = teleplay;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    /**
     * 配置视频列表
     *
     * @param updateCount 已更新集数
     * @return
     */
    private List<Video> makeTeleplayVideos(int updateCount) {
        List<Video> videos = new ArrayList<>();
        videos.add(new Video("1", ContentUrl.MOVE1, "生化危机", null, null, null, null, "8.9", null, "12345次", "95分钟", false));
        videos.add(new Video("2", ContentUrl.MOVE2, "古墓丽影", null, null, null, null, "8.0", null, "31345次", "105分钟", false));
        videos.add(new Video("3", ContentUrl.MOVE3, "像素大战", null, null, null, null, "9.0", null, "33345次", "112分钟", false));
        videos.add(new Video("4", ContentUrl.MOVE4, "地牢围攻", null, null, null, null, "8.8", null, "12331次", "95分钟", false));
        videos.add(new Video("5", ContentUrl.MOVE5, "超能特工队", null, null, null, null, "8.7", null, "55335次", "90分钟", false));
        videos.add(new Video("6", ContentUrl.MOVE6, "头脑特工队", null, null, null, null, "9.9", null, "14242次", "93分钟", false));
        videos.add(new Video("7", ContentUrl.MOVE7, "熊出没之雪岭熊风", null, null, null, null, "7.0", null, "12245次", "98分钟", false));
        videos.add(new Video("8", ContentUrl.MOVE8, "63_芈月传", null, null, null, null, "7.7", null, "42545次", "97分钟", false));
        videos.add(new Video("9", ContentUrl.MOVE9, "十七岁", null, null, null, null, "8.9", null, "1345次", "125分钟", false));
        videos.add(new Video("10", ContentUrl.MOVE10, "解救吾先生", null, null, null, null, "9.1", null, "26445次", "153分钟", false));

        List<Video> vs = new ArrayList<>();
        for (int i = 0; i < updateCount; i++) {
            vs.add(videos.get(new Random().nextInt(videos.size())));
        }
        return vs;
    }

    @RequestMapping(value = "/getVideoDetail")
    public GetVideoDetailResp getVideoDetail(@RequestParam String userToken,
                                             @RequestParam String videoId) {
        GetVideoDetailResp resp = new GetVideoDetailResp();
        Video video;
        switch (videoId) {
            case "1":
                video = new Video("1", ContentUrl.MOVE1, "生化危机", null, null, null, null, "8.9", null, "12345次", "95分钟", false);
                break;
            case "2":
                video = new Video("2", ContentUrl.MOVE2, "古墓丽影", null, null, null, null, "8.0", null, "31345次", "105分钟", false);
                break;
            case "3":
                video = new Video("3", ContentUrl.MOVE3, "像素大战", null, null, null, null, "9.0", null, "33345次", "112分钟", false);
                break;
            case "4":
                video = new Video("4", ContentUrl.MOVE4, "地牢围攻", null, null, null, null, "8.8", null, "12331次", "95分钟", false);
                break;
            case "5":
                video = new Video("5", ContentUrl.MOVE5, "超能特工队", null, null, null, null, "8.7", null, "55335次", "90分钟", false);
                break;
            case "6":
                video = new Video("6", ContentUrl.MOVE6, "头脑特工队", null, null, null, null, "9.9", null, "14242次", "93分钟", false);
                break;
            case "7":
                video = new Video("7", ContentUrl.MOVE7, "熊出没之雪岭熊风", null, null, null, null, "7.0", null, "12245次", "98分钟", false);
                break;
            case "8":
                video = new Video("8", ContentUrl.MOVE8, "63_芈月传", null, null, null, null, "7.7", null, "42545次", "97分钟", false);
                break;
            case "9":
                video = new Video("9", ContentUrl.MOVE9, "十七岁", null, null, null, null, "8.9", null, "1345次", "125分钟", false);
                break;
            case "10":
                video = new Video("10", ContentUrl.MOVE10, "解救吾先生", null, null, null, null, "9.1", null, "26445次", "153分钟", false);
                break;
            default:
                video = new Video("1", ContentUrl.MOVE1, "生化危机", null, null, null, null, "8.9", null, "12345次", "95分钟", false);
                break;
        }
        resp.video = video;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getChannelTags")
    public GetChannelTagsResp getChannelTags(@RequestParam String userToken) {
        GetChannelTagsResp resp = new GetChannelTagsResp();
        List<ChannelTag> tags = new ArrayList<>();
        tags.add(new ChannelTag("1", "所有"));
        tags.add(new ChannelTag("2", "央视"));
        tags.add(new ChannelTag("3", "地方"));
        tags.add(new ChannelTag("4", "体育"));
        tags.add(new ChannelTag("5", "教育"));
        tags.add(new ChannelTag("6", "健康"));
        tags.add(new ChannelTag("7", "少儿"));
        tags.add(new ChannelTag("8", "购物"));
        tags.add(new ChannelTag("9", "旅游"));
        resp.channelTags = tags;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getChannels")
    public GetChannelsResp getChannels(@RequestParam String userToken,
                                       @RequestParam String channelTagId) {
        GetChannelsResp resp = new GetChannelsResp();
        List<Channel> channels = new ArrayList<>();
        switch (channelTagId) {
            case "1":// 所有
                channels.add(new Channel("1", "CCTV1", ContentUrl.CCTV1, null));
                channels.add(new Channel("2", "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel("3", "CCTV3", ContentUrl.CCTV3, null));
                channels.add(new Channel("4", "CCTV4", ContentUrl.CCTV4, null));
                channels.add(new Channel("5", "CCTV5", ContentUrl.CCTV5, null));
                channels.add(new Channel("6", "CCTV6", ContentUrl.CCTV6, null));
                channels.add(new Channel("7", "CCTV7", ContentUrl.CCTV7, null));
                channels.add(new Channel("8", "CCTV8", ContentUrl.CCTV8, null));
                channels.add(new Channel("9", "CCTV9", ContentUrl.CCTV9, null));
                channels.add(new Channel("10", "CCTV10", ContentUrl.CCTV10, null));
                break;
            case "2"://央视
                channels.add(new Channel("2", "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel("5", "CCTV5", ContentUrl.CCTV5, null));
                break;
            case "3"://地方
                channels.add(new Channel("2", "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel("3", "CCTV3", ContentUrl.CCTV3, null));
                channels.add(new Channel("6", "CCTV6", ContentUrl.CCTV6, null));
                break;
            case "4"://体育
                channels.add(new Channel("4", "CCTV4", ContentUrl.CCTV4, null));
                break;
            case "5"://教育
                channels.add(new Channel("2", "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel("5", "CCTV5", ContentUrl.CCTV5, null));
                break;
            case "6"://健康
                channels.add(new Channel("6", "CCTV6", ContentUrl.CCTV6, null));
                break;
            case "7"://少儿
                channels.add(new Channel("9", "CCTV9", ContentUrl.CCTV9, null));
                channels.add(new Channel("10", "CCTV10", ContentUrl.CCTV10, null));
                break;
            case "8"://购物
                channels.add(new Channel("8", "CCTV8", ContentUrl.CCTV8, null));
                channels.add(new Channel("9", "CCTV9", ContentUrl.CCTV9, null));
                channels.add(new Channel("10", "CCTV10", ContentUrl.CCTV10, null));
                break;
            case "9"://旅游
                channels.add(new Channel("8", "CCTV8", ContentUrl.CCTV8, null));
                break;
            default:
                channels.add(new Channel("1", "CCTV1", ContentUrl.CCTV1, null));
                channels.add(new Channel("2", "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel("3", "CCTV3", ContentUrl.CCTV3, null));
                channels.add(new Channel("4", "CCTV4", ContentUrl.CCTV4, null));
                channels.add(new Channel("5", "CCTV5", ContentUrl.CCTV5, null));
                channels.add(new Channel("6", "CCTV6", ContentUrl.CCTV6, null));
                channels.add(new Channel("7", "CCTV7", ContentUrl.CCTV7, null));
                channels.add(new Channel("8", "CCTV8", ContentUrl.CCTV8, null));
                channels.add(new Channel("9", "CCTV9", ContentUrl.CCTV9, null));
                channels.add(new Channel("10", "CCTV10", ContentUrl.CCTV10, null));
                break;
        }
        resp.channels = channels;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    /**
     * 每个小时作为一个节目,生成节目列表
     *
     * @param channelUrl 频道地址
     * @param startTime
     * @param endTime
     * @return
     */
    private List<Program> providePrograms(String channelUrl, long startTime, long endTime, String channelId) {
        List<Program> programs = new ArrayList<>();

        Calendar calEnd = Calendar.getInstance();
        calEnd.setTime(new Date(endTime));

        Calendar calStart = Calendar.getInstance();
        calStart.setTime(new Date(startTime));

        while (calStart.getTimeInMillis() < calEnd.getTimeInMillis()) {
            long start = calStart.getTimeInMillis();
            calStart.add(Calendar.HOUR_OF_DAY, 1);
            long end = calStart.getTimeInMillis();
            String playType;
            if (end < System.currentTimeMillis()) {
                playType = "1";// 回看
            } else if (start < System.currentTimeMillis()) {
                playType = "2";// 直播
            } else {
                playType = "3";// 预告
            }
            Program program = new Program(UUID.randomUUID().toString(), "节目-" + DateUtil.longToString3(end),
                    channelUrl + "?PlaySeek=" + DateUtil.longToString(start) + "-" + DateUtil.longToString(end),
                    DateUtil.longToString2(start), end - start, playType, null, channelId);
            System.out.println("START " + calStart.getTimeInMillis() + ", END " + calEnd.getTimeInMillis());
            programs.add(program);
        }
        return programs;
    }

    @RequestMapping(value = "/getChannelPrograms")
    public GetProgramsResp getChannelPrograms(@RequestParam String userToken,
                                              @RequestParam String channelId,
                                              @RequestParam long startTime,
                                              @RequestParam long endTime) {
        System.out.println(userToken + "," + channelId + "," + startTime + "," + endTime);
        GetProgramsResp resp = new GetProgramsResp();
        List<Program> programs = new ArrayList<>();
        switch (channelId) {
            case "1":
                programs.addAll(providePrograms(ContentUrl.CCTV1_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "2":
                programs.addAll(providePrograms(ContentUrl.CCTV2_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "3":
                programs.addAll(providePrograms(ContentUrl.CCTV3_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "4":
                programs.addAll(providePrograms(ContentUrl.CCTV4_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "5":
                programs.addAll(providePrograms(ContentUrl.CCTV5_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "6":
                programs.addAll(providePrograms(ContentUrl.CCTV6_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "7":
                programs.addAll(providePrograms(ContentUrl.CCTV7_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "8":
                programs.addAll(providePrograms(ContentUrl.CCTV8_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "9":
                programs.addAll(providePrograms(ContentUrl.CCTV9_LOOK_BACK, startTime, endTime, channelId));
                break;
            case "10":
                programs.addAll(providePrograms(ContentUrl.CCTV10_LOOK_BACK, startTime, endTime, channelId));
                break;
            default:
                programs.addAll(providePrograms(ContentUrl.CCTV1_LOOK_BACK, startTime, endTime, channelId));
                break;
        }
        resp.programs = programs;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getRecommendContents")
    public GetRecommendContentsResp getRecommendContents(@RequestParam String userToken,
                                                         @RequestParam String contentType,
                                                         @RequestParam String contentTableId) {
        GetRecommendContentsResp resp = new GetRecommendContentsResp();
        List<Content> contents = new ArrayList<>();
        switch (contentType) {// 推荐相同内容类型的内容
            case ContentType.CHANNEL:
            case ContentType.PROGRAM:
            case ContentType.TELEPLAY:
            case ContentType.VIDEO:
            default:
                // TODO 再根据contentTableId进行相关内容列表推荐;或者通过EPG;如分析contentTableId对应的标签,推荐相同标签的内容
                contents.add(new Content("23", "幽游白书", ContentUrl.Pic.PIC_SMALL_4, ContentType.VIDEO, "视频ID", ContentUrl.MOVE1, "9.6", null));
                contents.add(new Content("24", "神奇宝贝", ContentUrl.Pic.PIC_SMALL_5, ContentType.VIDEO, "视频ID", ContentUrl.MOVE2, "9.6", null));
                break;
        }
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
        contents.add(new Content("23", "幽游白书", ContentUrl.Pic.PIC_SMALL_4, ContentType.VIDEO, "视频ID", ContentUrl.MOVE3, "9.6", null));
        contents.add(new Content("24", "神奇宝贝", ContentUrl.Pic.PIC_SMALL_5, ContentType.VIDEO, "视频ID", ContentUrl.MOVE4, "9.6", null));

        SearchResp resp = new SearchResp();
        resp.contents = contents;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/postCollect")
    public PostCollectResp postCollect(@RequestParam String userToken,
                                       @RequestParam String contentType,
                                       @RequestParam String contentTableId) {
        PostCollectResp resp = new PostCollectResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/deleteCollect")
    public DeleteCollectResp deleteCollect(@RequestParam String userToken,
                                           @RequestParam String contentType,
                                           @RequestParam String contentTableId) {
        DeleteCollectResp resp = new DeleteCollectResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getCollects")
    public GetCollectsResp getCollects(@RequestParam String userToken,
                                       @RequestParam String contentType,
                                       @RequestParam(required = false, defaultValue = "0") int start,
                                       @RequestParam(required = false, defaultValue = "20") int limit) {
        GetCollectsResp resp = new GetCollectsResp();
        List<Collect> collects = new ArrayList<>();
        switch (contentType) {
            case ContentType.TELEPLAY:
                collects.add(new Collect("1", ContentType.TELEPLAY, "31", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, null, null, null, null));
                collects.add(new Collect("2", ContentType.TELEPLAY, "32", "全职猎人", ContentUrl.Pic.PIC_SMALL_2, null, null, null, null));
                collects.add(new Collect("3", ContentType.TELEPLAY, "33", "乌龙派出所", ContentUrl.Pic.PIC_SMALL_3, null, null, null, null));
                break;
            case ContentType.VIDEO:
                collects.add(new Collect("1", ContentType.VIDEO, "21", "霍比特人意外之旅", ContentUrl.Pic.PIC_SMALL_6, null, null, null, null));
                collects.add(new Collect("2", ContentType.VIDEO, "22", "指环王", ContentUrl.Pic.PIC_SMALL_7, null, null, null, null));
                collects.add(new Collect("3", ContentType.VIDEO, "23", "幽游白书", ContentUrl.Pic.PIC_SMALL_4, null, null, null, null));
                break;
            default:
                break;
        }
        resp.collects = collects;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/postRecord")
    public PostRecordResp postRecord(@RequestParam String userToken,
                                     @RequestParam String contentType,
                                     @RequestParam String contentTableId,
                                     @RequestParam String record) {
        // save a record into Record Table
        PostRecordResp resp = new PostRecordResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getRecords")
    public GetRecordsResp getRecords(@RequestParam String userToken,
                                     @RequestParam String contentType,
                                     @RequestParam(required = false, defaultValue = "0") int start,
                                     @RequestParam(required = false, defaultValue = "20") int limit) {
        GetRecordsResp resp = new GetRecordsResp();
        List<Record> records = new ArrayList<>();
        switch (contentType) {
            case ContentType.TELEPLAY:
                records.add(new Record("1", ContentType.TELEPLAY, "31", "6", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, null, null, null, null));
                records.add(new Record("2", ContentType.TELEPLAY, "32", "2", "全职猎人", ContentUrl.Pic.PIC_SMALL_2, null, null, null, null));
                records.add(new Record("3", ContentType.TELEPLAY, "33", "7", "乌龙派出所", ContentUrl.Pic.PIC_SMALL_3, null, null, null, null));
                break;
            case ContentType.VIDEO:
                records.add(new Record("1", ContentType.VIDEO, "21", "" + (25 * 60 + 17) * 1000, "霍比特人意外之旅", ContentUrl.Pic.PIC_SMALL_6, null, null, null, null));
                records.add(new Record("2", ContentType.VIDEO, "22", "" + (25 * 60 + 17) * 1000, "指环王", ContentUrl.Pic.PIC_SMALL_7, null, null, null, null));
                records.add(new Record("3", ContentType.VIDEO, "23", "" + (10 * 60 + 43) * 1000, "幽游白书", ContentUrl.Pic.PIC_SMALL_4, null, null, null, null));
                break;
            default:
                break;
        }
        resp.records = records;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

}
