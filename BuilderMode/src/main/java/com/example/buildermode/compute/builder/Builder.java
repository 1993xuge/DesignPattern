package com.example.buildermode.compute.builder;

import com.example.buildermode.compute.product.Computer;

/**
 * Created at 2018/1/6 上午11:42.
 *
 * @author yixu.wang
 */

public abstract class Builder {

    public abstract void buildBoard(String board);

    public abstract void buildDisplay(String display);

    public abstract void buildOS();

    public abstract Computer create();
}
