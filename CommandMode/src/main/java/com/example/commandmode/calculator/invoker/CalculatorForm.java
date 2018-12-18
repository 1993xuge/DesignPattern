package com.example.commandmode.calculator.invoker;

import com.example.commandmode.calculator.command.AbstractCommand;

/**
 * Created at 2018/1/24 下午7:50.
 *
 * @author yixu.wang
 */

public class CalculatorForm {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int i = command.execute(value);

        System.out.println("执行运算，运算结果为：" + i);
    }

    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销，运算结果为：" + i);
    }
}
