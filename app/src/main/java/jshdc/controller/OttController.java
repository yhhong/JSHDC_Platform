package jshdc.controller;

import jshdc.bean.*;
import jshdc.bean.response.ott.*;
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
        List<Column> columns = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Column column = new Column();
            column.id = String.valueOf(i);
            column.name = "column" + i;
            column.status = "0";
            columns.add(column);
        }
        GetColumnsResp resp = new GetColumnsResp();
        resp.columns = columns;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    @RequestMapping(value = "/getFloors")
    public GetFloorsResp getFloors(@RequestParam String userToken, @RequestParam String columnId, @RequestParam long lastModifyTime) {
        GetFloorsResp resp = new GetFloorsResp();
        List<Floor> floors = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Floor floor = new Floor();
            floor.id = "id" + i;
            floor.name = "category " + i;
            floor.order = "order " + i;
            floor.displayType = "displayType " + i;
            floor.view = "view " + i;
            floor.argument = "argument " + i;
            floor.element1 = "element1";
            floor.element2 = "element2";
            floor.contents = generate();
            List<Message> messages = new ArrayList<>();
            for (int k = 0; k < 5; k++) {
                Message message = new Message();
                message.id = "id" + k;
                message.userId = "userId " + k;
                message.avatar = "avatar " + k;
                message.name = "name " + k;
                message.content = "content" + k;
                messages.add(message);
            }
            floor.messages = messages;
            floors.add(floor);
        }
        resp.floors = floors;
        resp.result = 0;
        resp.message = "success";
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
        for (int j = 0; j < 5; j++) {
            Content content = new Content();
            content.id = "id" + j;
            content.name = "name " + j;
            content.poster = "poster" + j;
            content.type = "type " + j;
            content.tableId = "tableId " + j;
            content.view = "view " + j;
            content.argument = "argument " + j;
            content.element1 = "element1";
            content.element2 = "element2";
            contents.add(content);
        }
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
