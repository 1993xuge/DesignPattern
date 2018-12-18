package com.example.buildermode.compute.product;

/**
 * Created at 2018/1/6 上午11:33.
 * 计算机抽象类，即Product角色
 * @author yixu.wang
 */
public abstract class Computer {

    protected String board;
    protected String display;
    protected String os;


    public void setBoard(String board) {
        this.board = board;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer [board = " + board + ", display = " + display + ", os = " + os + "]";
    }
}
