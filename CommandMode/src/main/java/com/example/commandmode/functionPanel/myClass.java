package com.example.commandmode.functionPanel;

import com.example.commandmode.functionPanel.command.Command;
import com.example.commandmode.functionPanel.command.HelpCommand;
import com.example.commandmode.functionPanel.command.MinimizeCommand;
import com.example.commandmode.functionPanel.invoke.FunctionButton;

public class myClass {

    public static void main(String[] args) {

        FunctionButton functionButton1 = new FunctionButton("功能键1");
        FunctionButton functionButton2 = new FunctionButton("功能键2");

        Command command1 = new HelpCommand();
        Command command2 = new MinimizeCommand();

        functionButton1.setCommand(command1);
        functionButton2.setCommand(command2);

        functionButton1.onClick();
        functionButton2.onClick();
    }
}
