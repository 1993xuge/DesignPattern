package com.example.factory.data.product;

/**
 * Created at 2018/1/10 上午10:11.
 *
 * @author yixu.wang
 */

public class FileHandle extends IOHandle {
    @Override
    public void add(String id, String name) {
        System.out.println("Add with File");
    }

    @Override
    public void remove(String id) {
        System.out.println("Remove with File");
    }

    @Override
    public void update(String id, String name) {
        System.out.println("Update with File");
    }

    @Override
    public void query(String id) {
        System.out.println("Query with File");
    }
}
