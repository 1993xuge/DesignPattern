package com.example.factory.data.factory;

import com.example.factory.data.product.IOHandle;

/**
 * Created at 2018/1/10 上午10:19.
 *
 * @author yixu.wang
 */

public class IOFactory {

    public static <T extends IOHandle> T getIOHandle(Class<T> clz){
        IOHandle ioHandle = null;

        try {
            ioHandle = (IOHandle) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) ioHandle;
    }
}
