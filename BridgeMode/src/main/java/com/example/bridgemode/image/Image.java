package com.example.bridgemode.image;

import com.example.bridgemode.impl.ImageImpl;

/**
 * Created at 2018/1/26 下午5:58.
 *
 * @author yixu.wang
 */

public abstract class Image {

    protected ImageImpl imp;

    public void setImageImpl(ImageImpl imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
