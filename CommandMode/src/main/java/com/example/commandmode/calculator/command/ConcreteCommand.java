package com.example.commandmode.calculator.command;

import com.example.commandmode.calculator.handler.Adder;

/**
 * Created at 2018/1/24 下午7:48.
 *
 * @author yixu.wang
 */

public class ConcreteCommand extends AbstractCommand {

    private Adder adder = new Adder();
    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
