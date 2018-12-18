package com.example.imageloadertest.config;

import android.support.annotation.IdRes;

import com.example.imageloadertest.cache.BitmapCache;
import com.example.imageloadertest.cache.MemoryCache;
import com.example.imageloadertest.policy.LoadPolicy;
import com.example.imageloadertest.policy.SerialPolicy;

/**
 * Created at 2018/1/6 下午4:10.
 *
 * @author yixu.wang
 */

public class ImageLoaderConfig {

    /**
     * 图片缓存配置对象
     **/
    private BitmapCache bitmapCache = new MemoryCache();

    /**
     * 加载图片时loading和加载失败的图片配置对象
     **/
    private DisplayConfig displayConfig = new DisplayConfig();

    /**
     * 加载策略
     **/
    private LoadPolicy loadPolicy = new SerialPolicy();

    /**
     * 线程数量，默认为CPU数量+1
     **/
    private int threadCount = Runtime.getRuntime().availableProcessors() + 1;

    private ImageLoaderConfig() {

    }

    public BitmapCache getBitmapCache() {
        return bitmapCache;
    }

    public DisplayConfig getDisplayConfig() {
        return displayConfig;
    }

    public LoadPolicy getLoadPolicy() {
        return loadPolicy;
    }

    public int getThreadCount() {
        return threadCount;
    }

    public static class Builder {
        /**
         * 图片缓存配置对象
         **/
        private BitmapCache bitmapCache = new MemoryCache();

        /**
         * 加载图片时loading和加载失败的图片配置对象
         **/
        private DisplayConfig displayConfig = new DisplayConfig();

        /**
         * 加载策略
         **/
        private LoadPolicy loadPolicy = new SerialPolicy();

        /**
         * 线程数量，默认为CPU数量+1
         **/
        private int threadCount = Runtime.getRuntime().availableProcessors() + 1;

        /**
         * 设置缓存
         **/
        public Builder setCache(BitmapCache cache) {
            bitmapCache = cache;
            return this;
        }

        /**
         * 设置图片加载时显示的图片
         **/
        public Builder setLoadingResId(@IdRes int resId) {
            displayConfig.loadingResId = resId;
            return this;
        }

        /**
         * 设置图片加载失败时显示的图片
         **/
        public Builder setLoadingFailedResId(@IdRes int resId) {
            displayConfig.failedResId = resId;
            return this;
        }

        /**
         * 设置加载策略
         **/
        public Builder setLoadPolicy(LoadPolicy policy) {
            if (policy != null) {
                loadPolicy = policy;
            }
            return this;
        }

        public void applyConfig(ImageLoaderConfig config) {
        }

    }

}
