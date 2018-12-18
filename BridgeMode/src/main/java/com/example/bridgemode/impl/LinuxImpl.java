package com.example.bridgemode.impl;

import com.example.bridgemode.Matrix;

/**
 * Created at 2018/1/26 下午6:03.
 *
 * @author yixu.wang
 */

public class LinuxImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.print("在Linux操作系统中显示图像：");
    }
}
