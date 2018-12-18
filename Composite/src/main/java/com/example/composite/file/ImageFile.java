package com.example.composite.file;

/**
 * Created at 2018/1/27 下午8:05.
 *
 * @author yixu.wang
 */

public class ImageFile extends File {

    public ImageFile(String fileName) {
        super(fileName);
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
