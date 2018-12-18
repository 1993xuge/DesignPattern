package com.example.commandmode.calculator.handler;

/**
 * Created at 2018/1/24 下午7:39.
 *
 * @author yixu.wang
 */

public class Adder {

    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }


}
