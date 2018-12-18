package com.example.imageloadertest;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created at 2018/1/6 上午10:33.
 *
 * @author yixu.wang
 */

public class Util {
    public static void closeQuietly(Closeable closeable){
        if(closeable != null){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
