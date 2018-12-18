package com.example.imageloadertest.cache;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

/**
 * Created at 2018/1/5 下午2:41.
 *
 * @author yixu.wang
 */

public class MemoryCache implements BitmapCache{
    // 图片缓存
    LruCache<String, Bitmap> imageCache;

    public MemoryCache(){
        initImageCache();
    }
    private void initImageCache() {
        // 计算可使用的最大内存
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);

        final int cacheSize = maxMemory / 4;

        imageCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024;
            }
        };
    }

    @Override
    public void put(String url, Bitmap bitmap){
        imageCache.put(url, bitmap);
    }

    public Bitmap get(String url){
        return imageCache.get(url);
    }
}
