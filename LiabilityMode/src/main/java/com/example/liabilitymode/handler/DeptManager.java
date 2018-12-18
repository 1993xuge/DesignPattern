package com.example.liabilitymode.handler;

/**
 * Created at 2018/1/12 上午10:22.
 *
 * @author yixu.wang
 */

public class DeptManager extends Handler {
    @Override
    public String handleRequest(String user, double fee) {
        String str = "";
        if (fee < 1000) {
            str = "部门经理 同意 " + user + " 申请的费用 ： " + fee;
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handleRequest(user, fee);
            }
        }
        return str;
    }
}
