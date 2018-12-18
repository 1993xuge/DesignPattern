package com.example.factory.data.product;

/**
 * Created at 2018/1/10 上午10:06.
 *
 * @author yixu.wang
 */

public abstract class IOHandle {

    public abstract void add(String id, String name);

    public abstract void remove(String id);

    public abstract void update(String id, String name);

    public abstract void query(String id);
}
