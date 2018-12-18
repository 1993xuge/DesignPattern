package com.example.bridgemode.impl;

import com.example.bridgemode.Matrix;

/**
 * Created at 2018/1/26 下午6:02.
 *
 * @author yixu.wang
 */

public class WindowsImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.print("在Windows操作系统中显示图像：");
    }
}
