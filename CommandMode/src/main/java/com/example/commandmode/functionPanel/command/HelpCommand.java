package com.example.commandmode.functionPanel.command;

import com.example.commandmode.functionPanel.handler.HelpHandler;

/**
 * Created at 2018/1/24 下午7:06.
 *
 * @author yixu.wang
 */

public class HelpCommand implements Command {

    private HelpHandler helpHandler;

    public HelpCommand() {
        helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
