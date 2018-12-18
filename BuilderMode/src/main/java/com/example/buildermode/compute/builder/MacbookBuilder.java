package com.example.buildermode.compute.builder;

import com.example.buildermode.compute.product.Computer;
import com.example.buildermode.compute.product.Macbook;

/**
 * Created at 2018/1/6 上午11:46.
 *
 * @author yixu.wang
 */

public class MacbookBuilder extends Builder {

    private Computer computer = new Macbook();

    @Override
    public void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        computer.setOs();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
