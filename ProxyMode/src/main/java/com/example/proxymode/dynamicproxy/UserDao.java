package com.example.proxymode.dynamicproxy;

/**
 * Created at 2018/12/10 下午7:05.
 *
 * @author yixu.wang
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存数据");
    }

    @Override
    public void delete() {
        System.out.println("删除数据");
    }
}
