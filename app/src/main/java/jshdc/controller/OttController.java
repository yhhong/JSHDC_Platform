package jshdc.controller;

import jshdc.bean.*;
import jshdc.bean.response.ott.*;
import jshdc.util.ContentType;
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
                floors.add(new Floor(0, "电影", "排序", TemplateType.COUNT_TWO, null, null, "CCTV5/江苏卫视", null, vodContents2, null));

                List<Content> vodContents3 = new ArrayList<>();
                vodContents3.add(new Content(0, "名侦探柯南", Pic.PIC_SMALL_1, ContentType.VOD_TELEPALY, "电视剧ID", ViewType.VOD_PLAYER, "电视剧内容ID", null, null));
                vodContents3.add(new Content(0, "全职猎人", Pic.PIC_SMALL_2, ContentType.VOD_TELEPALY, "电视剧ID", ViewType.VOD_PLAYER, "电视剧内容ID", null, null));
                vodContents3.add(new Content(0, "乌龙派出所", Pic.PIC_SMALL_3, ContentType.VOD_TELEPALY, "电视剧ID", ViewType.VOD_PLAYER, "电视剧内容ID", null, null));
                floors.add(new Floor(0, "电视剧", "排序", TemplateType.COUNT_THREE, null, null, "精选/欧美/电视剧/娱乐", null, vodContents3, null));

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

        Channel channel = new Channel();
        channel.id = "" + channelId;
        channel.name = "name" + channelId;
        channel.url = "www.baidu.com";
        channel.description = "description " + channelId;
        resp.channel = channel;
        return resp;
    }

    @RequestMapping(value = "/getProgramDetail")
    public GetProgramDetailResp getProgramDetail(@RequestParam String userToken, @RequestParam String programId) {
        GetProgramDetailResp resp = new GetProgramDetailResp();

        Program program = new Program();
        program.id = "" + programId;
        program.name = "name" + programId;
        program.showTime = "12:00";
        program.playType = "";
        program.description = "channel " + programId;
        resp.program = program;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getVideoDetail")
    public GetVideoDetailResp getVideoDetail(@RequestParam String userToken, @RequestParam String videoId) {
        GetVideoDetailResp resp = new GetVideoDetailResp();

        Video video = new Video();
        video.id = "" + videoId;
        video.playId = "http://static.tripbe.com/videofiles/20121214/9533522808.f4v.mp4";
        video.name = "name" + videoId;
        video.poster = "";
        video.director = "";
        video.actors = "";
        video.description = "description " + videoId;
        video.score = "";
        video.showTime = "";
        video.playCount = "";
        video.time = "";
        resp.video = video;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getTeleplayDetail")
    public GetTeleplayDetailResp getTeleplayDetail(@RequestParam String userToken, @RequestParam String teleplayId) {

        GetTeleplayDetailResp resp = new GetTeleplayDetailResp();

        Teleplay teleplay = new Teleplay();
        teleplay.id = "" + teleplayId;
        teleplay.name = "name" + teleplayId;
        teleplay.poster = "";
        teleplay.director = "";
        teleplay.actors = "";
        teleplay.description = "description " + teleplayId;
        teleplay.score = "";
        teleplay.showTime = "";
        teleplay.playCount = "";
        teleplay.total = "";
        teleplay.updateCount = "";
        resp.teleplay = teleplay;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getTeleplayVideos")
    public GetTeleplayVideosResp getTeleplayVideos(@RequestParam String userToken, @RequestParam String teleplayId) {
        GetTeleplayVideosResp resp = new GetTeleplayVideosResp();

        List<Video> videos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Video video = new Video();
            video.id = "" + i;
            video.playId = "";
            video.name = "name" + i;
            video.poster = "";
            video.director = "";
            video.actors = "";
            video.description = "description " + i;
            video.score = "";
            video.showTime = "";
            video.playCount = "";
            video.time = "";
            videos.add(video);
        }
        resp.videos = videos;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannelTags")
    public GetChannelTagsResp getChannelTags(@RequestParam String userToken) {

        GetChannelTagsResp resp = new GetChannelTagsResp();
        List<ChannelTag> tags = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ChannelTag channelTag = new ChannelTag();
            channelTag.id = "" + i;
            channelTag.name = "channel tag " + i;
            tags.add(channelTag);
        }
        resp.channelTags = tags;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannels")
    public GetChannelsResp getChannels(@RequestParam String userToken) {
        GetChannelsResp resp = new GetChannelsResp();
        List<Channel> channels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Channel channel = new Channel();
            channel.id = "" + i;
            channel.name = "channel " + i;
            channel.url = "";
            channel.description = "";
            channels.add(channel);
        }
        resp.channels = channels;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getChannelPrograms")
    public GetProgramsResp getChannelPrograms(@RequestParam String userToken) {
        GetProgramsResp resp = new GetProgramsResp();
        List<Program> programs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Program program = new Program();
            program.id = "" + i;
            program.name = "program " + i;
            program.showTime = "";
            program.playType = "";
            program.description = "";
            programs.add(program);
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
        for (int j = 0; j < 5; j++) {
            Video video = new Video();
            video.id = "id" + j;
            video.playId = "http://static.tripbe.com/videofiles/20121214/9533522808.f4v.mp4";
            video.name = "name " + j;
            video.poster = "poster" + j;
            video.director = "director " + j;
            video.actors = "actors " + j;
            video.description = "description " + j;
            video.score = "score";
            video.showTime = "showTime";
            video.playCount = "99999";
            video.time = "45:59";
            videos.add(video);
        }
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
