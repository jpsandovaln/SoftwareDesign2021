package com.jalasoft.project.model.convert;

public class CommandContext {
    private ICommand command;

    public CommandContext (ICommand command) {
        this.command = command;
    }

    public String getCommand(Criteria criteria) {
        return this.command.build(criteria);
    }
}
