package org.example.structural.facade.design;

import org.example.structural.facade.design.facade.VideoFacade;
import org.example.structural.facade.design.video.uploader.VideoEncoder;
import org.example.structural.facade.design.video.uploader.VideoFormat;
import org.example.structural.facade.design.video.uploader.VideoType;
import org.example.structural.facade.design.video.uploader.VideoUploader;

public class Main {

    public static void main(String[] args) {

        /*
        instead of calling Video uploader like this

        VideoEncoder videoEncoder = new VideoEncoder();
        VideoFormat videoFormat = new VideoFormat();
        VideoType videoType = new VideoType();
        VideoUploader videoUploader = new VideoUploader();
         */

        // we can let the facade class handle it

        VideoFacade videoFacade = new VideoFacade();
        videoFacade.videoUploader();

    }
}
