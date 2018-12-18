package com.example.composite.file;

/**
 * Created at 2018/1/27 下午8:09.
 *
 * @author yixu.wang
 */

public class VideoFile extends File {
    public VideoFile(String fileName) {
        super(fileName);
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}
