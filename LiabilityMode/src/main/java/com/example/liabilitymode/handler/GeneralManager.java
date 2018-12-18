package com.example.liabilitymode.handler;

/**
 * Created at 2018/1/12 上午10:23.
 *
 * @author yixu.wang
 */

public class GeneralManager extends Handler {
    @Override
    public String handleRequest(String user, double fee) {
        String str = null;
        if(fee < 10000){
            str = "总经理同意 " + user + " 申请的费用 ： " + fee;
        }else{
            if(getSuccessor() != null){
                return getSuccessor().handleRequest(user, fee);
            }
        }
        return str;
    }
}
