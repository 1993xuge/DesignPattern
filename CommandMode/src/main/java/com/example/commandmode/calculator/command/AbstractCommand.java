package com.example.commandmode.calculator.command;

/**
 * Created at 2018/1/24 下午7:38.
 *
 * @author yixu.wang
 */

public abstract class AbstractCommand {

    public abstract int execute(int value);

    public abstract int undo();
}
