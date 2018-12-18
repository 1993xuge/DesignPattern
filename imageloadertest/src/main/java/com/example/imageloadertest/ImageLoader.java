package com.example.imageloadertest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import com.example.imageloadertest.cache.BitmapCache;
import com.example.imageloadertest.cache.MemoryCache;
import com.example.imageloadertest.config.ImageLoaderConfig;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created at 2018/1/5 上午11:30.
 *
 * @author yixu.wang
 */

public class ImageLoader {

    private static ImageLoader sInstance;

    private ImageLoaderConfig imageLoaderConfig;

    BitmapCache bitmapCache = new MemoryCache();

    // 图片加载中显示的图片resId
    private int loadingImageId;
    // 图片加载失败时显示的图片资源Id
    private int loadingFailedImageId;

    // 线程池，线程数量为CPU的数量
    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private ImageLoader(){

    }

    public static ImageLoader getInstance(){
        if(sInstance == null){
            synchronized (ImageLoader.class){
                if(sInstance == null){
                    new ImageLoader();
                }
            }
        }
        return sInstance;
    }

    public void init(ImageLoaderConfig config){
        imageLoaderConfig = config;
        bitmapCache = imageLoaderConfig.getBitmapCache();

    }

    public void displayImage(final String url, final ImageView imageView) {
        // 使用缓存
        Bitmap bitmap = null;
        if(bitmapCache != null){
            bitmap = bitmapCache.get(url);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }

        submitLoadRequest(url, imageView);
    }

    private void submitLoadRequest(final String imageUrl, final ImageView imageView){
        // 设置 加载中的图片
        if(loadingImageId != 0){
            imageView.setImageResource(loadingImageId);
        }
        imageView.setTag(imageUrl);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(imageUrl);
                if (bitmap == null) {
                    // 图片加载失败
                    if(loadingFailedImageId != 0){
                        imageView.setImageResource(loadingFailedImageId);
                    }
                    return ;
                }

                if (imageView.getTag().equals(imageUrl)) {
                    imageView.setImageBitmap(bitmap);
                }

                if(bitmapCache != null){
                    bitmapCache.put(imageUrl, bitmap);
                }
            }
        });
    }

    public Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public void setBitmapCache(BitmapCache bitmapCache) {
        this.bitmapCache = bitmapCache;
    }

    public void setLoadingImageId(int loadingImageId) {
        this.loadingImageId = loadingImageId;
    }

    public void setLoadingFailedImageId(int loadingFailedImageId) {
        this.loadingFailedImageId = loadingFailedImageId;
    }
}
