package com.example.commandmode.functionPanel.invoke;

import com.example.commandmode.functionPanel.command.Command;

/**
 * Created at 2018/1/24 下午7:02.
 *
 * @author yixu.wang
 */

public class FunctionButton {
    private String name;
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        System.out.println("点击功能键：" + command.getClass().getSimpleName());
        command.execute();
    }
}
