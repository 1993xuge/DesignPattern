package com.example.composite;

/**
 * Created at 2018/1/27 下午8:04.
 *
 * @author yixu.wang
 */

public abstract class AbstractFile {

    protected String name;

    public AbstractFile(String fileName){
        name = fileName;
    }

    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
