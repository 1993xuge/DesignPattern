package com.example.proxymode.staticproxy.searcher.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 2018/1/30 下午5:41.
 *
 * @author yixu.wang
 */

public class Logger {

    private List<String> users;

    public Logger() {
        users = new ArrayList<>();
    }

    public void log(String userId) {
        if (!users.contains(userId)) {
            users.add(userId);
            System.out.println("Logger --> log " + userId);
        }
    }
}
