package com.xuge.chainofresponsibilitypattern.logger;

/**
 * Created at 2018/11/23 下午1:36.
 *
 * @author yixu.wang
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    // 责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    abstract protected void write(String message);

    public void logMessage(int level, String message) {
        if (level >= this.level) {
            // 只有该消息的级别比looger的级别大，该logger才输出
            write(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
}
