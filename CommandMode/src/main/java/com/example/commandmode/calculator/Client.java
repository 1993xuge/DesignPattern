package com.example.commandmode.calculator;

import com.example.commandmode.calculator.command.ConcreteCommand;
import com.example.commandmode.calculator.invoker.CalculatorForm;

/**
 * Created at 2018/1/24 下午7:53.
 *
 * @author yixu.wang
 */

public class Client {

    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();

        calculatorForm.setCommand(new ConcreteCommand());

        calculatorForm.compute(2);
        calculatorForm.compute(5);

        calculatorForm.undo();
    }
}
