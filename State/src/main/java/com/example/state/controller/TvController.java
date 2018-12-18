package com.example.state.controller;

import com.example.state.state.TvState;

/**
 * Created at 2018/1/11 下午8:44.
 *
 * @author yixu.wang
 */

public class TvController implements PowerController {

    TvState tvState = null;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }
}
