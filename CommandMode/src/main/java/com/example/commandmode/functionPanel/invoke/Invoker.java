package com.example.commandmode.functionPanel.invoke;

import com.example.commandmode.functionPanel.CommandQueue;

/**
 * Created at 2018/1/24 下午7:27.
 *
 * @author yixu.wang
 */

public class Invoker {

    private CommandQueue commandQueue;

    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call() {
        commandQueue.execute();
    }
}
