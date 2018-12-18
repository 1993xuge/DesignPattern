package com.example.state.state;

/**
 * Created at 2018/1/11 下午8:41.
 *
 * @author yixu.wang
 */

public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("降低音量");
    }
}
