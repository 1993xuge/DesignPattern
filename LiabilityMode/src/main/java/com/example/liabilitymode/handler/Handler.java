package com.example.liabilitymode.handler;

/**
 * Created at 2018/1/12 上午10:16.
 *
 * @author yixu.wang
 */

public abstract class Handler {

    /**
     * 下一个处理请求的对象
     */
    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理事件
     */
    public abstract String handleRequest(String user, double fee);
}
