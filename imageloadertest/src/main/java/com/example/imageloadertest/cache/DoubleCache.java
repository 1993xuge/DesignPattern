package com.example.imageloadertest.cache;

import android.graphics.Bitmap;

/**
 * Created at 2018/1/5 下午4:27.
 *
 * @author yixu.wang
 */

public class DoubleCache implements BitmapCache {
    private MemoryCache memoryCache;
    private DiskCache diskCache;

    public DoubleCache(){
        memoryCache = new MemoryCache();
        diskCache = new DiskCache();
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        memoryCache.put(url, bitmap);
        diskCache.put(url, bitmap);
    }

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = memoryCache.get(url);
        if(bitmap == null){
            bitmap = diskCache.get(url);
        }
        return bitmap;
    }
}
