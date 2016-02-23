package jshdc.controller;

import jshdc.bean.*;
import jshdc.bean.response.ott.*;
import jshdc.util.ContentType;
import jshdc.util.ContentUrl;
import jshdc.util.TemplateType;
import jshdc.util.ViewType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * OTT视频
 * Created by yinghuihong on 16/1/8.
 */
@RestController
public class OttController {

    @RequestMapping(value = "/getColumns")
    public GetColumnsResp getColumns(@RequestParam String userToken, @RequestParam long lastModifyTime) {
        GetColumnsResp resp = new GetColumnsResp();

        if (lastModifyTime > (System.currentTimeMillis() - 1 * 60 * 1000)) {
            resp.result = 1;
            resp.message = "没有更新的数据了..";
            return resp;
        }
        List<Column> columns = new ArrayList<>();

        columns.add(new Column(2, "精选"));
        columns.add(new Column(3, "欧美"));
        columns.add(new Column(4, "电视剧"));
        columns.add(new Column(5, "娱乐"));
        columns.add(new Column(6, "健康"));
        columns.add(new Column(7, "教育"));
        columns.add(new Column(8, "韩剧"));
        columns.add(new Column(9, "综艺"));

        resp.columns = columns;
        resp.result = 0;
        resp.message = "success";
        resp.lastModifyTime = System.currentTimeMillis();
        return resp;
    }

    @RequestMapping(value = "/getFloors")
    public GetFloorsResp getFloors(@RequestParam String userToken, @RequestParam String columnId, @RequestParam long lastModifyTime) {
        GetFloorsResp resp = new GetFloorsResp();

        if (lastModifyTime > (System.currentTimeMillis() - 1 * 60 * 1000)) {
            resp.result = 1;
            resp.message = "没有更新的数据了..";
            return resp;
        }
        List<Floor> floors = new ArrayList<>();
        switch (columnId) {
            case "0":
                List<Content> contents1 = new ArrayList<>();
                contents1.add(new Content(1, "飞屋环游记", Pic.PIC_BIG_1, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", null, null));
                contents1.add(new Content(2, "叛逆的鲁路修第110话", Pic.PIC_BIG_2, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", null, null));
                contents1.add(new Content(3, "少年派的奇幻漂流", Pic.PIC_BIG_3, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", null, null));
                contents1.add(new Content(4, "海贼王第710话", Pic.PIC_BIG_4, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", null, null));
                floors.add(new Floor(0, null, "排序", TemplateType.CAROUSEL, null, null, null, null, contents1, null));

                List<Content> contents2 = new ArrayList<>();
                contents2.add(new Content(0, "[CCTV5]世界杯战况", Pic.PIC_PROGRAM_1, ContentType.LIVE_PROGRAM, "频道ID", ViewType.LIVE_PLAYER, "频道播放地址", "9.6", "10000次"));
                contents2.add(new Content(0, "[江苏卫视]舌尖上的中国", Pic.PIC_PROGRAM_3, ContentType.LIVE_PROGRAM, "频道ID", ViewType.LIVE_PLAYER, "频道播放地址", "9.6", "2000次"));
                floors.add(new Floor(0, "直播", "排序", TemplateType.COUNT_TWO, ViewType.LIVE_MAIN, null, "CCTV5/江苏卫视", null, contents2, null));

                List<Content> contents3 = new ArrayList<>();
                contents3.add(new Content(0, "名侦探柯南", Pic.PIC_SMALL_1, ContentType.VOD_VIDEO, "节目ID", ViewType.VOD_PLAYER, "节目播放地址", "9.6", null));
                contents3.add(new Content(0, "全职猎人", Pic.PIC_SMALL_2, ContentType.VOD_VIDEO, "节目ID", ViewType.VOD_PLAYER, "节目播放地址", "9.6", null));
                floors.add(new Floor(0, "点播", "排序", TemplateType.COUNT_TWO, ViewType.VOD_MAIN, null, "精选/欧美/电视剧/娱乐", null, contents3, null));
                break;
            case "1":
                List<Content> liveContents1 = new ArrayList<>();
                liveContents1.add(new Content(1, "飞屋环游记", Pic.PIC_BIG_1, "直播节目类", "节目ID", ViewType.LIVE_PLAYER, "节目播放地址", null, null));
                liveContents1.add(new Content(2, "叛逆的鲁路修第110话", Pic.PIC_BIG_2, "直播节目类", "节目ID", ViewType.LIVE_PLAYER, "节目播放地址", null, null));
                liveContents1.add(new Content(3, "少年派的奇幻漂流", Pic.PIC_BIG_3, "直播节目类", "节目ID", ViewType.LIVE_PLAYER, "节目播放地址", null, null));
                liveContents1.add(new Content(4, "海贼王第710话", Pic.PIC_BIG_4, "直播节目类", "节目ID", ViewType.LIVE_PLAYER, "节目播放地址", null, null));
                floors.add(new Floor(0, null, "排序", TemplateType.CAROUSEL, null, null, null, null, liveContents1, null));

                List<Content> liveContents2 = new ArrayList<>();
                liveContents2.add(new Content(0, "巴西世界杯", Pic.PIC_PROGRAM_1, "点播视频类", "节目ID", ViewType.LIVE_PLAYER, "节目播放地址", "9.6", null));
                liveContents2.add(new Content(0, "新闻30分", Pic.PIC_PROGRAM_2, "点播视频类", "节目ID", ViewType.LIVE_PLAYER, "节目播放地址", "9.6", null));
                floors.add(new Floor(0, "精彩回看", "排序", TemplateType.COUNT_TWO, ViewType.LIVE_ALL_PROGRAM, null, "所有回看", null, liveContents2, null));

                List<Content> liveContents3 = new ArrayList<>();
                liveContents3.add(new Content(0, "湖南卫视", Pic.PIC_TV_1, "直播频道类", "频道ID", ViewType.LIVE_PLAYER, "频道播放地址", "9.6", "10000次"));
                liveContents3.add(new Content(0, "湖北卫视", Pic.PIC_TV_2, "直播频道类", "频道ID", ViewType.LIVE_PLAYER, "频道播放地址", "9.6", "2000次"));
                liveContents3.add(new Content(0, "江苏卫视", Pic.PIC_TV_3, "直播频道类", "频道ID", ViewType.LIVE_PLAYER, "频道播放地址", "9.6", "3000次"));
                liveContents3.add(new Content(0, "东方卫视", Pic.PIC_TV_4, "直播频道类", "频道ID", ViewType.LIVE_PLAYER, "频道播放地址", "9.6", "5000次"));
                floors.add(new Floor(0, "热门电视", "排序", TemplateType.COUNT_FOUR, ViewType.LIVE_ALL_PROGRAM, null, "所有电视", null, liveContents3, null));
                break;
            default:
                List<Content> vodContents1 = new ArrayList<>();
                vodContents1.add(new Content(1, "飞屋环游记", Pic.PIC_BIG_1, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", null, null));
                vodContents1.add(new Content(2, "叛逆的鲁路修第110话", Pic.PIC_BIG_2, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", null, null));
                vodContents1.add(new Content(3, "少年派的奇幻漂流", Pic.PIC_BIG_3, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", null, null));
                vodContents1.add(new Content(4, "海贼王第710话", Pic.PIC_BIG_4, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", null, null));
                floors.add(new Floor(0, null, "排序", TemplateType.CAROUSEL, null, null, null, null, vodContents1, null));

                List<Content> vodContents2 = new ArrayList<>();
                vodContents2.add(new Content(0, "霍比特人意外之旅", Pic.PIC_SMALL_6, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", "9.6", "10000次"));
                vodContents2.add(new Content(0, "指环王", Pic.PIC_SMALL_7, ContentType.VOD_VIDEO, "视频ID", ViewType.LIVE_PLAYER, "视频播放地址", "9.6", "2000次"));
                floors.add(new Floor(0, "电影", "排序", TemplateType.COUNT_TWO, null, null, null, null, vodContents2, null));

                List<Content> vodContents3 = new ArrayList<>();
                vodContents3.add(new Content(0, "名侦探柯南", Pic.PIC_SMALL_1, ContentType.VOD_TELEPALY, "电视剧ID", ViewType.VOD_PLAYER, "电视剧内容ID", null, null));
                vodContents3.add(new Content(0, "全职猎人", Pic.PIC_SMALL_2, ContentType.VOD_TELEPALY, "电视剧ID", ViewType.VOD_PLAYER, "电视剧内容ID", null, null));
                vodContents3.add(new Content(0, "乌龙派出所", Pic.PIC_SMALL_3, ContentType.VOD_TELEPALY, "电视剧ID", ViewType.VOD_PLAYER, "电视剧内容ID", null, null));
                floors.add(new Floor(0, "电视剧", "排序", TemplateType.COUNT_THREE, null, null, null, null, vodContents3, null));

                List<Content> vodContents4 = new ArrayList<>();
                vodContents4.add(new Content(0, "幽游白书", Pic.PIC_SMALL_4, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", "9.6", null));
                vodContents4.add(new Content(0, "神奇宝贝", Pic.PIC_SMALL_5, ContentType.VOD_VIDEO, "视频ID", ViewType.VOD_PLAYER, "视频播放地址", "9.6", null));
                floors.add(new Floor(0, "动漫", "排序", TemplateType.COUNT_TWO, null, null, null, null, vodContents4, null));
                break;
        }

        resp.floors = floors;
        resp.result = 0;
        resp.message = "success";
        resp.lastModifyTime = System.currentTimeMillis();
        return resp;
    }

    @RequestMapping(value = "/getContents")
    public GetContentsResp getContents(@RequestParam String userToken, @RequestParam String floorId,
                                       @RequestParam(required = false, defaultValue = "0") int start,
                                       @RequestParam(required = false, defaultValue = "20") int limit) {
        GetContentsResp resp = new GetContentsResp();
        resp.contents = generate();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannelDetail")
    public GetChannelDetailResp getChannelDetail(@RequestParam String userToken, @RequestParam String channelId) {
        GetChannelDetailResp resp = new GetChannelDetailResp();
        Channel channel;
        switch (channelId) {
            case "1":
                channel = new Channel(1, "CCTV1", ContentUrl.CCTV1, null);
                break;
            case "2":
                channel = new Channel(2, "CCTV2", ContentUrl.CCTV2, null);
                break;
            case "3":
                channel = new Channel(3, "CCTV3", ContentUrl.CCTV3, null);
                break;
            case "4":
                channel = new Channel(4, "CCTV4", ContentUrl.CCTV4, null);
                break;
            case "5":
                channel = new Channel(5, "CCTV5", ContentUrl.CCTV5, null);
                break;
            case "6":
                channel = new Channel(6, "CCTV6", ContentUrl.CCTV6, null);
                break;
            case "7":
                channel = new Channel(7, "CCTV7", ContentUrl.CCTV7, null);
                break;
            case "8":
                channel = new Channel(8, "CCTV8", ContentUrl.CCTV8, null);
                break;
            case "9":
                channel = new Channel(9, "CCTV9", ContentUrl.CCTV9, null);
                break;
            case "10":
                channel = new Channel(10, "CCTV10", ContentUrl.CCTV10, null);
                break;
            default:
                channel = new Channel(1, "CCTV1", ContentUrl.CCTV1, null);
                break;
        }
        resp.channel = channel;
        return resp;
    }

    @RequestMapping(value = "/getProgramDetail")
    public GetProgramDetailResp getProgramDetail(@RequestParam String userToken, @RequestParam String programId) {
        GetProgramDetailResp resp = new GetProgramDetailResp();
        Program program;
        switch (programId) {
            case "1":
                program = new Program(1, "世界杯战况", "11:00", "回看", "2014年世界杯");
                break;
            case "2":
                program = new Program(2, "新闻30分", "12:00", "回看", "CCTV9新闻台正午播放");
                break;
            default:
                program = new Program(1, "世界杯战况", "11:00", "回看", "2014年世界杯");
                break;
        }
        resp.program = program;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }


    @RequestMapping(value = "/getTeleplayDetail")
    public GetTeleplayDetailResp getTeleplayDetail(@RequestParam String userToken, @RequestParam String teleplayId) {
        GetTeleplayDetailResp resp = new GetTeleplayDetailResp();
        Teleplay teleplay;
        switch (teleplayId) {
            case "1":
                teleplay = new Teleplay(1, "名侦探柯南", null, "导演", "柯南/新一/小兰", "真相只有一个", "9.1", "2001", "21亿", "800集", "656集");
                break;
            case "2":
                teleplay = new Teleplay(2, "全职猎人", null, "导演", "小杰/西索", "惊险刺激的游戏世界,小杰与西索幻影旅团的精彩对决", "9.3", "2001", "500万", "80集", "80集");
                break;
            case "3":
                teleplay = new Teleplay(3, "乌龙派出所", null, "导演", "两津勘吉/中山/本田", "龟有公园前派出所,爆笑登场", "9.9", "2001", "2000万", "320集", "320集");
                break;
            default:
                teleplay = new Teleplay(1, "名侦探柯南", null, "导演", "柯南/新一/小兰", "真相只有一个", "9.1", "2001", "21亿", "800集", "656集");
                break;
        }
        resp.teleplay = teleplay;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getTeleplayVideos")
    public GetTeleplayVideosResp getTeleplayVideos(@RequestParam String userToken, @RequestParam String teleplayId) {
        GetTeleplayVideosResp resp = new GetTeleplayVideosResp();
        List<Video> videos = new ArrayList<>();
        switch (teleplayId) {
            case "1":
            case "2":
            case "3":
            default:
                videos.add(new Video(1, ContentUrl.MOVE1, "生化危机", null, null, null, null, "8.9", null, "12345次", "95分钟"));
                videos.add(new Video(2, ContentUrl.MOVE2, "古墓丽影", null, null, null, null, "8.0", null, "31345次", "105分钟"));
                videos.add(new Video(3, ContentUrl.MOVE3, "像素大战", null, null, null, null, "9.0", null, "33345次", "112分钟"));
                videos.add(new Video(4, ContentUrl.MOVE4, "地牢围攻", null, null, null, null, "8.8", null, "12331次", "95分钟"));
                videos.add(new Video(5, ContentUrl.MOVE5, "超能特工队", null, null, null, null, "8.7", null, "55335次", "90分钟"));
                videos.add(new Video(6, ContentUrl.MOVE6, "头脑特工队", null, null, null, null, "9.9", null, "14242次", "93分钟"));
                videos.add(new Video(7, ContentUrl.MOVE7, "熊出没之雪岭熊风", null, null, null, null, "7.0", null, "12245次", "98分钟"));
                videos.add(new Video(8, ContentUrl.MOVE8, "63_芈月传", null, null, null, null, "7.7", null, "42545次", "97分钟"));
                videos.add(new Video(9, ContentUrl.MOVE9, "十七岁", null, null, null, null, "8.9", null, "1345次", "125分钟"));
                videos.add(new Video(10, ContentUrl.MOVE10, "解救吾先生", null, null, null, null, "9.1", null, "26445次", "153分钟"));
                break;
        }
        resp.videos = videos;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getVideoDetail")
    public GetVideoDetailResp getVideoDetail(@RequestParam String userToken, @RequestParam String videoId) {
        GetVideoDetailResp resp = new GetVideoDetailResp();
        Video video;
        switch (videoId) {
            case "1":
                video = new Video(1, ContentUrl.MOVE1, "生化危机", null, null, null, null, "8.9", null, "12345次", "95分钟");
                break;
            case "2":
                video = new Video(2, ContentUrl.MOVE2, "古墓丽影", null, null, null, null, "8.0", null, "31345次", "105分钟");
                break;
            case "3":
                video = new Video(3, ContentUrl.MOVE3, "像素大战", null, null, null, null, "9.0", null, "33345次", "112分钟");
                break;
            case "4":
                video = new Video(4, ContentUrl.MOVE4, "地牢围攻", null, null, null, null, "8.8", null, "12331次", "95分钟");
                break;
            case "5":
                video = new Video(5, ContentUrl.MOVE5, "超能特工队", null, null, null, null, "8.7", null, "55335次", "90分钟");
                break;
            case "6":
                video = new Video(6, ContentUrl.MOVE6, "头脑特工队", null, null, null, null, "9.9", null, "14242次", "93分钟");
                break;
            case "7":
                video = new Video(7, ContentUrl.MOVE7, "熊出没之雪岭熊风", null, null, null, null, "7.0", null, "12245次", "98分钟");
                break;
            case "8":
                video = new Video(8, ContentUrl.MOVE8, "63_芈月传", null, null, null, null, "7.7", null, "42545次", "97分钟");
                break;
            case "9":
                video = new Video(9, ContentUrl.MOVE9, "十七岁", null, null, null, null, "8.9", null, "1345次", "125分钟");
                break;
            case "10":
                video = new Video(10, ContentUrl.MOVE10, "解救吾先生", null, null, null, null, "9.1", null, "26445次", "153分钟");
                break;
            default:
                video = new Video(1, ContentUrl.MOVE1, "生化危机", null, null, null, null, "8.9", null, "12345次", "95分钟");
                break;
        }
        resp.video = video;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannelTags")
    public GetChannelTagsResp getChannelTags(@RequestParam String userToken) {
        GetChannelTagsResp resp = new GetChannelTagsResp();
        List<ChannelTag> tags = new ArrayList<>();
        tags.add(new ChannelTag(1, "所有"));
        tags.add(new ChannelTag(2, "央视"));
        tags.add(new ChannelTag(3, "地方"));
        tags.add(new ChannelTag(4, "体育"));
        tags.add(new ChannelTag(5, "教育"));
        tags.add(new ChannelTag(6, "健康"));
        tags.add(new ChannelTag(7, "少儿"));
        tags.add(new ChannelTag(8, "购物"));
        tags.add(new ChannelTag(9, "旅游"));
        resp.channelTags = tags;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannels")
    public GetChannelsResp getChannels(@RequestParam String userToken, String channelTagId) {
        GetChannelsResp resp = new GetChannelsResp();
        List<Channel> channels = new ArrayList<>();
        switch (channelTagId) {
            case "1":// 所有
                channels.add(new Channel(1, "CCTV1", ContentUrl.CCTV1, null));
                channels.add(new Channel(2, "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel(3, "CCTV3", ContentUrl.CCTV3, null));
                channels.add(new Channel(4, "CCTV4", ContentUrl.CCTV4, null));
                channels.add(new Channel(5, "CCTV5", ContentUrl.CCTV5, null));
                channels.add(new Channel(6, "CCTV6", ContentUrl.CCTV6, null));
                channels.add(new Channel(7, "CCTV7", ContentUrl.CCTV7, null));
                channels.add(new Channel(8, "CCTV8", ContentUrl.CCTV8, null));
                channels.add(new Channel(9, "CCTV9", ContentUrl.CCTV9, null));
                channels.add(new Channel(10, "CCTV10", ContentUrl.CCTV10, null));
                break;
            case "2"://央视
                channels.add(new Channel(2, "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel(5, "CCTV5", ContentUrl.CCTV5, null));
                break;
            case "3"://地方
                channels.add(new Channel(2, "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel(3, "CCTV3", ContentUrl.CCTV3, null));
                channels.add(new Channel(6, "CCTV6", ContentUrl.CCTV6, null));
                break;
            case "4"://体育
                channels.add(new Channel(4, "CCTV4", ContentUrl.CCTV4, null));
                break;
            case "5"://教育
                channels.add(new Channel(2, "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel(5, "CCTV5", ContentUrl.CCTV5, null));
                break;
            case "6"://健康
                channels.add(new Channel(6, "CCTV6", ContentUrl.CCTV6, null));
                break;
            case "7"://少儿
                channels.add(new Channel(9, "CCTV9", ContentUrl.CCTV9, null));
                channels.add(new Channel(10, "CCTV10", ContentUrl.CCTV10, null));
                break;
            case "8"://购物
                channels.add(new Channel(8, "CCTV8", ContentUrl.CCTV8, null));
                channels.add(new Channel(9, "CCTV9", ContentUrl.CCTV9, null));
                channels.add(new Channel(10, "CCTV10", ContentUrl.CCTV10, null));
                break;
            case "9"://旅游
                channels.add(new Channel(8, "CCTV8", ContentUrl.CCTV8, null));
                break;
            default:
                channels.add(new Channel(1, "CCTV1", ContentUrl.CCTV1, null));
                channels.add(new Channel(2, "CCTV2", ContentUrl.CCTV2, null));
                channels.add(new Channel(3, "CCTV3", ContentUrl.CCTV3, null));
                channels.add(new Channel(4, "CCTV4", ContentUrl.CCTV4, null));
                channels.add(new Channel(5, "CCTV5", ContentUrl.CCTV5, null));
                channels.add(new Channel(6, "CCTV6", ContentUrl.CCTV6, null));
                channels.add(new Channel(7, "CCTV7", ContentUrl.CCTV7, null));
                channels.add(new Channel(8, "CCTV8", ContentUrl.CCTV8, null));
                channels.add(new Channel(9, "CCTV9", ContentUrl.CCTV9, null));
                channels.add(new Channel(10, "CCTV10", ContentUrl.CCTV10, null));
                break;
        }
        resp.channels = channels;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannelPrograms")
    public GetProgramsResp getChannelPrograms(@RequestParam String userToken, String channelId, long startTime, long endTime) {
        GetProgramsResp resp = new GetProgramsResp();
        List<Program> programs = new ArrayList<>();
        switch (channelId) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            default:
                programs.add(new Program(1, "等着我", "10:00", "回看", null));
                programs.add(new Program(2, "午间新闻", "11:00", "回看", null));
                programs.add(new Program(3, "2016等着我特别节目", "12:00", "直播", null));
                programs.add(new Program(4, "电视剧:问家人", "13:00", "直播", null));
                programs.add(new Program(5, "我爱我家", "14:00", "直播", null));
                programs.add(new Program(6, "焦点访谈", "15:00", "直播", null));
                programs.add(new Program(7, "西游记", "16:00", "直播", null));
                break;
        }
        resp.programs = programs;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getVodTags")
    public GetVodTagsResp getVodTags(@RequestParam String userToken) {
        GetVodTagsResp resp = new GetVodTagsResp();
        List<VodTag> vodTags = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            VodTag vodTag = new VodTag();
            vodTag.id = "" + i;
            vodTag.name = "vod tag " + i;
            vodTags.add(vodTag);
        }
        resp.tags = vodTags;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

//  @RequestMapping(value = "/getVodContents")
//  public GetVodContentsResp getVodContents(@RequestBody(required = false) String json) {
//    GetVodContentsResp resp = new GetVodContentsResp();
//    List<VodContent> vodContents = new ArrayList<>();
//    for (int i = 0; i < 10; i++) {
//      VodContent vodContent = new VodContent();
//      vodContent.id = "" + i;
//      vodContent.playId = "";
//      vodContent.name = "vod content " + i;
//      vodContent.poster = "";
//      vodContent.director = "";
//      vodContent.actors = "";
//      vodContent.description = "";
//      vodContent.score = "";
//      vodContent.showTime = "";
//      vodContent.total = "";
//      vodContent.updateCount = "";
//      vodContent.playCount = "";
//      vodContent.time = "";
//      vodContent.superId = "";
//      vodContent.contentType = "";
//      vodContent.tags = "";
//      vodContents.add(vodContent);
//    }
//    resp.data = resp.new Data();
//    resp.data.contents = vodContents;
//    resp.result = 0;
//    resp.message = "success";
//    return resp;
//  }

    @RequestMapping(value = "/getRelevantRecommend")
    public GetRelevantRecommendResp getRelevantRecommend(@RequestParam String userToken) {
        GetRelevantRecommendResp resp = new GetRelevantRecommendResp();
        resp.contents = generate();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/search")
    public SearchResp search(@RequestParam String userToken, @RequestParam String text,
                             @RequestParam(required = false, defaultValue = "0") int start,
                             @RequestParam(required = false, defaultValue = "20") int limit) {
        SearchResp resp = new SearchResp();
        resp.contents = generate();
        ;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/postCollectVideo")
    public PostCollectVideoResp postCollectVideo(@RequestParam String userToken, @RequestParam String videoId) {
        PostCollectVideoResp resp = new PostCollectVideoResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/deleteCollectVideo")
    public DeleteCollectVideoResp deleteCollectVideo(@RequestParam String userToken, @RequestParam String videoId) {
        DeleteCollectVideoResp resp = new DeleteCollectVideoResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getCollectVideos")
    public GetCollectVideosResp getCollectVideos(@RequestParam String userToken,
                                                 @RequestParam(required = false, defaultValue = "0") int start,
                                                 @RequestParam(required = false, defaultValue = "20") int limit) {
        GetCollectVideosResp resp = new GetCollectVideosResp();

        List<Video> videos = new ArrayList<>();

        videos.add(new Video(8, ContentUrl.MOVE8, "63_芈月传", null, null, null, null, "7.7", null, "42545次", "97分钟"));
        videos.add(new Video(9, ContentUrl.MOVE9, "十七岁", null, null, null, null, "8.9", null, "1345次", "125分钟"));
        videos.add(new Video(10, ContentUrl.MOVE10, "解救吾先生", null, null, null, null, "9.1", null, "26445次", "153分钟"));

        resp.videos = videos;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/postVideoPlayRecord")
    public PostVideoPlayRecordResp postVideoPlayRecord(@RequestParam String userToken, @RequestParam String videoId, @RequestParam long breakpoint) {
        PostVideoPlayRecordResp resp = new PostVideoPlayRecordResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getVideoPlayRecords")
    public GetVideoPlayRecordsResp getVideoPlayRecords(@RequestParam String userToken,
                                                       @RequestParam(required = false, defaultValue = "0") int start,
                                                       @RequestParam(required = false, defaultValue = "20") int limit) {
        GetVideoPlayRecordsResp resp = new GetVideoPlayRecordsResp();
        resp.contents = generate();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    private List<Content> generate() {
        List<Content> contents = new ArrayList<>();
        contents.add(new Content(0, "叛逆的鲁路修第10话", Pic.PIC_BIG_1, "点播视频类", "视频表的记录ID", "跳转到点播播放页面", "视频播放地址", "9.6", "预留文本2"));
        contents.add(new Content(0, "叛逆的鲁路修第10话", Pic.PIC_BIG_1, "点播视频类", "视频表的记录ID", "跳转到点播播放页面", "视频播放地址", "9.6", "预留文本2"));
        contents.add(new Content(0, "叛逆的鲁路修第10话", Pic.PIC_BIG_1, "点播视频类", "视频表的记录ID", "跳转到点播播放页面", "视频播放地址", "9.6", "预留文本2"));
        return contents;
    }

    //@RequestMapping(value = "/columns2", method = RequestMethod.POST) public GetColumnsResp columns(
    //    @RequestParam(value = "lastModifyTime", required = true) Long lastModifyTime) {
    //  List<Column> columns = new ArrayList<>();
    //  for (int i = 0; i < 10; i++) {
    //    Column column = new Column();
    //    column.id = String.valueOf(i);
    //    column.name = "column" + i;
    //    column.status = "0";
    //    columns.add(column);
    //  }
    //  GetColumnsResp resp = new GetColumnsResp();
    //  resp.columns = columns;
    //  resp.lastModifyTime = System.currentTimeMillis();
    //  return resp;
    //}
}
