package com.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 2018/1/27 下午8:10.
 *
 * @author yixu.wang
 */

public class Folder extends AbstractFile {

    private List<AbstractFile> files = new ArrayList<>();

    public Folder(String fileName) {
        super(fileName);
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return files.get(i);
    }

    @Override
    public void killVirus() {
        //模拟杀毒
        System.out.println("****对文件夹'" + name + "'进行杀毒");
        //递归调用成员构件的killVirus()方法
        for (AbstractFile file : files) {
//            System.out.println(file.name);
            file.killVirus();
        }
    }
}
