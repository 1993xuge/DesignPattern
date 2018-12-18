package com.example.imageloadertest.cache;

import android.graphics.Bitmap;

/**
 * Created at 2018/1/5 下午2:41.
 *
 * @author yixu.wang
 */

public interface BitmapCache {

    public void put(String url, Bitmap bitmap);
    public Bitmap get(String url);
}
