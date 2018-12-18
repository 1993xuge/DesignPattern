package com.example.bridgemode.image;

import com.example.bridgemode.Matrix;

/**
 * Created at 2018/1/26 下午6:05.
 *
 * @author yixu.wang
 */

public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}
