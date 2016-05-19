package jshdc.controller;

import jshdc.bean.response.ott.*;
import jshdc.content.ContentUrl;
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
                program = new Program("1", "世界杯战况", ContentUrl.CCTV1_LOOK_BACK + "?PlaySeek=" + "20160420180000" + "-" + "20160420190000", DateUtil.stringToDate("20160420180000").getTime(), 60 * 60 * 1000, "回看", "2014年世界杯", "1");
                break;
            case "2":
                program = new Program("2", "新闻30分", ContentUrl.CCTV1_LOOK_BACK + "?PlaySeek=" + "20160420190000" + "-" + "20160420193500", DateUtil.stringToDate("20160420190000").getTime(), 35 * 60 * 1000, "回看", "CCTV9新闻台正午播放", "1");
                break;
            default:
                program = new Program("1", "世界杯战况", ContentUrl.CCTV1_LOOK_BACK + "?PlaySeek=" + "20160420180000" + "-" + "20160420190000", DateUtil.stringToDate("20160420180000").getTime(), 60 * 60 * 1000, "回看", "2014年世界杯", "1");
                break;
        }
        resp.program = program;
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
                    start, end - start, playType, null, channelId);
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

    @RequestMapping(value = "/getTeleplayDetail")
    public GetTeleplayDetailResp getTeleplayDetail(@RequestParam String userToken,
                                                   @RequestParam String teleplayId) {
        GetTeleplayDetailResp resp = new GetTeleplayDetailResp();
        Teleplay teleplay;
        switch (teleplayId) {
            case "1":
                teleplay = new Teleplay("1", "名侦探柯南", null, "导演", "柯南/新一/小兰", "真相只有一个", "9.1", "2001", "21亿", "40集", "25集", makeTeleplayVideos(25), false);
                break;
            case "2":
                teleplay = new Teleplay("2", "全职猎人", null, "导演", "小杰/西索", "惊险刺激的游戏世界,小杰与西索幻影旅团的精彩对决", "9.3", "2001", "500万", "8集", "8集", makeTeleplayVideos(8), true);
                break;
            case "3":
                teleplay = new Teleplay("3", "乌龙派出所", null, "导演", "两津勘吉/中山/本田", "龟有公园前派出所,爆笑登场", "9.9", "2001", "2000万", "32集", "32集", makeTeleplayVideos(32), false);
                break;
            default:
                teleplay = new Teleplay("1", "名侦探柯南", null, "导演", "柯南/新一/小兰", "真相只有一个", "9.1", "2001", "21亿", "40集", "25集", makeTeleplayVideos(25), false);
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
        List<String> resolutions = new ArrayList<>();
        resolutions.add("480x320");
        resolutions.add("800x480");
        resolutions.add("1280x800");
        resolutions.add("1920x1080");

        List<Video> videos = new ArrayList<>();
        videos.add(new Video("1", ContentUrl.MOVE1, "生化危机", null, "directors", "actors", "description", "8.9", null, "12345次", "95分钟", resolutions, false));
        videos.add(new Video("2", ContentUrl.MOVE2, "古墓丽影", null, "directors", "actors", "description", "8.0", null, "31345次", "105分钟", resolutions, false));
        videos.add(new Video("3", ContentUrl.MOVE3, "像素大战", null, "directors", "actors", "description", "9.0", null, "33345次", "112分钟", resolutions, false));
        videos.add(new Video("4", ContentUrl.MOVE4, "地牢围攻", null, "directors", "actors", "description", "8.8", null, "12331次", "95分钟", resolutions, false));
        videos.add(new Video("5", ContentUrl.MOVE5, "超能特工队", null, "directors", "actors", "description", "8.7", null, "55335次", "90分钟", resolutions, false));
        videos.add(new Video("6", ContentUrl.MOVE6, "头脑特工队", null, "directors", "actors", "description", "9.9", null, "14242次", "93分钟", resolutions, false));
        videos.add(new Video("7", ContentUrl.MOVE7, "熊出没之雪岭熊风", null, "directors", "actors", "description", "7.0", null, "12245次", "98分钟", resolutions, false));
        videos.add(new Video("8", ContentUrl.MOVE8, "63_芈月传", null, "directors", "actors", "description", "7.7", null, "42545次", "97分钟", resolutions, false));
        videos.add(new Video("9", ContentUrl.MOVE9, "十七岁", null, "directors", "actors", "description", "8.9", null, "1345次", "125分钟", resolutions, false));
        videos.add(new Video("10", ContentUrl.MOVE10, "解救吾先生", null, "directors", "actors", "description", "9.1", null, "26445次", "153分钟", resolutions, false));

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
        if (videoId != null && videoId.length() != 0) {
            int length = videoId.length();
            videoId = videoId.substring(length - 1, length);
        }
        List<String> resolutions = new ArrayList<>();
        resolutions.add("480x320");
        resolutions.add("800x480");
        resolutions.add("1280x800");
        resolutions.add("1920x1080");
        switch (videoId) {
            case "1":
                video = new Video("1", ContentUrl.MOVE1, "生化危机", null, "directors", "actors", "description", "8.9", null, "12345次", "95分钟", resolutions, false);
                break;
            case "2":
                video = new Video("2", ContentUrl.MOVE2, "古墓丽影", null, "directors", "actors", "description", "8.0", null, "31345次", "105分钟", resolutions, false);
                break;
            case "3":
                video = new Video("3", ContentUrl.MOVE3, "像素大战", null, "directors", "actors", "description", "9.0", null, "33345次", "112分钟", resolutions, false);
                break;
            case "4":
                video = new Video("4", ContentUrl.MOVE4, "地牢围攻", null, "directors", "actors", "description", "8.8", null, "12331次", "95分钟", resolutions, false);
                break;
            case "5":
                video = new Video("5", ContentUrl.MOVE5, "超能特工队", null, "directors", "actors", "description", "8.7", null, "55335次", "90分钟", resolutions, false);
                break;
            case "6":
                video = new Video("6", ContentUrl.MOVE6, "头脑特工队", null, "directors", "actors", "description", "9.9", null, "14242次", "93分钟", resolutions, false);
                break;
            case "7":
                video = new Video("7", ContentUrl.MOVE7, "熊出没之雪岭熊风", null, "directors", "actors", "description", "7.0", null, "12245次", "98分钟", resolutions, false);
                break;
            case "8":
                video = new Video("8", ContentUrl.MOVE8, "63_芈月传", null, "directors", "actors", "description", "7.7", null, "42545次", "97分钟", resolutions, false);
                break;
            case "9":
                video = new Video("9", ContentUrl.MOVE9, "十七岁", null, "directors", "actors", "description", "8.9", null, "1345次", "125分钟", resolutions, false);
                break;
            case "10":
                video = new Video("10", ContentUrl.MOVE10, "解救吾先生", null, "directors", "actors", "description", "9.1", null, "26445次", "153分钟", resolutions, false);
                break;
            default:
                video = new Video("10", ContentUrl.MOVE10, "解救吾先生", null, "directors", "actors", "description", "8.9", null, "12345次", "95分钟", resolutions, false);
                break;
        }
        resp.video = video;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }


    @RequestMapping(value = "/postVodCollect")
    public PostVodCollectResp postCollect(@RequestParam String userToken,
                                          @RequestParam String videoId,
                                          @RequestParam String teleplayId) {
        PostVodCollectResp resp = new PostVodCollectResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/deleteVodCollect")
    public DeleteVodCollectResp deleteCollect(@RequestParam String userToken,
                                              @RequestParam String videoId,
                                              @RequestParam String teleplayId) {
        DeleteVodCollectResp resp = new DeleteVodCollectResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getVodCollects")
    public GetVodCollectsResp getCollects(@RequestParam String userToken,
                                          @RequestParam(required = false, defaultValue = "0") int start,
                                          @RequestParam(required = false, defaultValue = "20") int limit) {
        GetVodCollectsResp resp = new GetVodCollectsResp();
        List<VodCollect> vodCollects = new ArrayList<>();
        vodCollects.add(new VodCollect("1", null, "31", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, 0, "24", "24", "1099999", DateUtil.stringToDate("20010501000000").getTime()));
        vodCollects.add(new VodCollect("2", null, "32", "全职猎人", ContentUrl.Pic.PIC_SMALL_2, 0, "30", "30", "4234141", DateUtil.stringToDate("20120501000000").getTime()));
        vodCollects.add(new VodCollect("3", null, "33", "乌龙派出所", ContentUrl.Pic.PIC_SMALL_3, 0, "100", "89", "425225511", DateUtil.stringToDate("20130501000000").getTime()));
        vodCollects.add(new VodCollect("1", "21", null, "霍比特人意外之旅", ContentUrl.Pic.PIC_SMALL_6, 30 * 60 + 10, null, null, "1111003", DateUtil.stringToDate("20040501000000").getTime()));
        vodCollects.add(new VodCollect("2", "22", null, "指环王", ContentUrl.Pic.PIC_SMALL_7, 40 * 60 + 59, null, null, "35777", DateUtil.stringToDate("20050501000000").getTime()));
        vodCollects.add(new VodCollect("3", "23", null, "幽游白书", ContentUrl.Pic.PIC_SMALL_4, 45 * 60, null, null, "434535", DateUtil.stringToDate("20060501000000").getTime()));
        resp.vodCollects = vodCollects;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/postVodPlayRecord")
    public PostVodRecordResp postRecord(@RequestParam String userToken,
                                        @RequestParam String videoId,
                                        @RequestParam String playedTime) {
        // save a record into VodPlayRecord Table
        PostVodRecordResp resp = new PostVodRecordResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getVodPlayRecords")
    public GetVodPlayRecordsResp getRecords(@RequestParam String userToken,
                                            @RequestParam(required = false, defaultValue = "0") int start,
                                            @RequestParam(required = false, defaultValue = "20") int limit) {
        GetVodPlayRecordsResp resp = new GetVodPlayRecordsResp();
        List<VodPlayRecord> vodPlayRecords = new ArrayList<>();
        vodPlayRecords.add(new VodPlayRecord("1", null, "31", "6", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, "913123", DateUtil.stringToDate("20010501000000").getTime()));
        vodPlayRecords.add(new VodPlayRecord("2", null, "32", "2", "全职猎人", ContentUrl.Pic.PIC_SMALL_2, "31123", DateUtil.stringToDate("20010501000000").getTime()));
        vodPlayRecords.add(new VodPlayRecord("3", null, "33", "7", "乌龙派出所", ContentUrl.Pic.PIC_SMALL_3, "100422323", DateUtil.stringToDate("20010501000000").getTime()));
        vodPlayRecords.add(new VodPlayRecord("1", "21", null, "" + (25 * 60 + 17) * 1000, "霍比特人意外之旅", ContentUrl.Pic.PIC_SMALL_6, "1113", DateUtil.stringToDate("20010501000000").getTime()));
        vodPlayRecords.add(new VodPlayRecord("2", "22", null, "" + (25 * 60 + 17) * 1000, "指环王", ContentUrl.Pic.PIC_SMALL_7, "33322", DateUtil.stringToDate("20010501000000").getTime()));
        vodPlayRecords.add(new VodPlayRecord("3", "23", null, "" + (10 * 60 + 43) * 1000, "幽游白书", ContentUrl.Pic.PIC_SMALL_4, "14545322", DateUtil.stringToDate("20010501000000").getTime()));
        resp.vodPlayRecords = vodPlayRecords;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/getVodRecommends")
    public GetVodRecommendsResp getRecommendContents(@RequestParam String userToken,
                                                     @RequestParam String videoId,
                                                     @RequestParam String teleplayId) {
        GetVodRecommendsResp resp = new GetVodRecommendsResp();
        List<VodRecommend> vodRecommends = new ArrayList<>();
        vodRecommends.add(new VodRecommend("1", "22", null, "指环王", ContentUrl.Pic.PIC_SMALL_7, "directors", "actors", "description", "8.1", DateUtil.stringToDate("20110101000000").getTime(), "10000"));
        vodRecommends.add(new VodRecommend("2", "11", "31", "名侦探柯南", ContentUrl.Pic.PIC_SMALL_1, "directors", "actors", "description", "9.1", DateUtil.stringToDate("20010501000000").getTime(), "9999"));
        vodRecommends.add(new VodRecommend("3", "21", null, "霍比特人意外之旅", ContentUrl.Pic.PIC_SMALL_6, "directors", "actors", "description", "8.3", DateUtil.stringToDate("20130901000000").getTime(), "3242431"));
        resp.vodRecommends = vodRecommends;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }
}
