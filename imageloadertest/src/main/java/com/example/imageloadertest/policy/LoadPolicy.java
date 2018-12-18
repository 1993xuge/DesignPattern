package com.example.imageloadertest.policy;

import com.example.imageloadertest.request.BitmapRequest;

/**
 * Created at 2018/1/6 下午4:03.
 *
 * @author yixu.wang
 */

public interface LoadPolicy {
    public int compare(BitmapRequest request1, BitmapRequest request2);
}
