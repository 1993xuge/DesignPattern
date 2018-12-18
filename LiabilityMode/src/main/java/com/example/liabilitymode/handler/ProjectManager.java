package com.example.liabilitymode.handler;

/**
 * Created at 2018/1/12 上午10:19.
 *
 * @author yixu.wang
 */

public class ProjectManager extends Handler {
    @Override
    public String handleRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            str = "项目经理 同意 " + user + " 申请的费用 ： " + fee;
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handleRequest(user, fee);
            }
        }
        return str;
    }
}
