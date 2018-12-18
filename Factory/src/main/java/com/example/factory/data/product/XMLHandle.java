package com.example.factory.data.product;

/**
 * Created at 2018/1/10 上午10:17.
 *
 * @author yixu.wang
 */

public class XMLHandle extends IOHandle {
    @Override
    public void add(String id, String name) {
        System.out.println("Add with XML");
    }

    @Override
    public void remove(String id) {
        System.out.println("Remove with XML");
    }

    @Override
    public void update(String id, String name) {
        System.out.println("Update with XML");
    }

    @Override
    public void query(String id) {
        System.out.println("Query with XML");
    }
}
