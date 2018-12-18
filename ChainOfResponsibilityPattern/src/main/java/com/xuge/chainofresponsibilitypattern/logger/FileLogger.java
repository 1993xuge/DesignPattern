package com.xuge.chainofresponsibilitypattern.logger;

/**
 * Created at 2018/11/23 下午1:43.
 *
 * @author yixu.wang
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
