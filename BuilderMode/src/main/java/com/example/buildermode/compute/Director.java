package com.example.buildermode.compute;

import com.example.buildermode.compute.builder.Builder;

/**
 * Created at 2018/1/6 上午11:51.
 *
 * @author yixu.wang
 */

public class Director {
    public Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board, String display) {
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOS();
    }
}
