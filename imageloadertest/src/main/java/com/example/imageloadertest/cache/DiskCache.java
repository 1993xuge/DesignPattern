package com.example.imageloadertest.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.imageloadertest.Util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created at 2018/1/5 下午1:39.
 *
 * @author yixu.wang
 */

public class DiskCache implements BitmapCache {
    private static String cacheDir = "sdcard/cache/";

    @Override
    public Bitmap get(String url){
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    @Override
    public void put(String url, Bitmap bitmap){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            Util.closeQuietly(fileOutputStream);
        }
    }
}
