package org.example.structural.facade.design.facade;

import org.example.structural.facade.design.video.uploader.VideoEncoder;
import org.example.structural.facade.design.video.uploader.VideoFormat;
import org.example.structural.facade.design.video.uploader.VideoType;
import org.example.structural.facade.design.video.uploader.VideoUploader;

public class VideoFacade {

    public void videoUploader(){
        VideoEncoder videoEncoder = new VideoEncoder();
        VideoFormat videoFormat = new VideoFormat();
        VideoType videoType = new VideoType();
        VideoUploader videoUploader = new VideoUploader();

        System.out.println("video uploaded");
    }
}
