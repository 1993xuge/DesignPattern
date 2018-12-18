package com.xuge.chainofresponsibilitypattern;

import com.xuge.chainofresponsibilitypattern.logger.AbstractLogger;
import com.xuge.chainofresponsibilitypattern.logger.ConsoleLogger;
import com.xuge.chainofresponsibilitypattern.logger.ErrorLogger;
import com.xuge.chainofresponsibilitypattern.logger.FileLogger;

public class MyClass {

    public static final void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();

//        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

//        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
