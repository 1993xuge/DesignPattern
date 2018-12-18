package com.example.composite.file;

/**
 * Created at 2018/1/27 下午8:07.
 *
 * @author yixu.wang
 */

public class TextFile extends File {
    public TextFile(String fileName) {
        super(fileName);
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}
