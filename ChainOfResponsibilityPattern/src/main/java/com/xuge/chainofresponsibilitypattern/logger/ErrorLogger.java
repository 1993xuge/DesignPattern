package com.xuge.chainofresponsibilitypattern.logger;

/**
 * Created at 2018/11/23 下午1:42.
 *
 * @author yixu.wang
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
