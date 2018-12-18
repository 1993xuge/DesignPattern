package com.example.proxymode.staticproxy.searcher.util;

/**
 * Created at 2018/1/30 下午5:40.
 *
 * @author yixu.wang
 */

public class AccessValidator {

    public boolean validate(String userId){
        return userId.equals("yixu.wang");
    }
}
