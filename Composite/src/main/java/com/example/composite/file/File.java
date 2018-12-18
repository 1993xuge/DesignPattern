package com.example.composite.file;

import com.example.composite.AbstractFile;

/**
 * Created at 2018/1/27 下午8:08.
 *
 * @author yixu.wang
 */

public abstract class File extends AbstractFile {


    public File(String fileName) {
        super(fileName);
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！add");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！remove");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！getChild");
        return null;
    }
}
