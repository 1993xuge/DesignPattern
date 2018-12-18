package com.example.state.state;

/**
 * Created at 2018/1/11 下午8:40.
 *
 * @author yixu.wang
 */

public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("Do Nothing !");
    }

    @Override
    public void prevChannel() {
        System.out.println("Do Nothing !");
    }

    @Override
    public void turnUp() {
        System.out.println("Do Nothing !");
    }

    @Override
    public void turnDown() {
        System.out.println("Do Nothing !");
    }
}
