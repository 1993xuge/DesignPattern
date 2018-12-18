package com.xuge.chainofresponsibilitypattern.logger;

/**
 * Created at 2018/11/23 下午1:41.
 *
 * @author yixu.wang
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
