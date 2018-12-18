package com.example.imageloadertest.policy;

import com.example.imageloadertest.request.BitmapRequest;

/**
 * Created at 2018/1/6 下午4:16.
 *
 * @author yixu.wang
 */

public class SerialPolicy implements LoadPolicy {
    @Override
    public int compare(BitmapRequest request1, BitmapRequest request2) {
        // 如果优先级相等,那么按照添加到队列的序列号顺序来执行
        return request1.serialNum - request2.serialNum;
    }
}
