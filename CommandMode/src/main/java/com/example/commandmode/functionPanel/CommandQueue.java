package com.example.commandmode.functionPanel;

import com.example.commandmode.functionPanel.command.Command;

import java.util.ArrayList;

/**
 * Created at 2018/1/24 下午7:25.
 *
 * @author yixu.wang
 */

public class CommandQueue {

    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
