package com.example.commandmode.functionPanel.command;

import com.example.commandmode.functionPanel.handler.WindowHandler;

/**
 * Created at 2018/1/24 下午7:13.
 *
 * @author yixu.wang
 */

public class MinimizeCommand implements Command {
    private WindowHandler windowHandler;

    public MinimizeCommand() {
        windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
