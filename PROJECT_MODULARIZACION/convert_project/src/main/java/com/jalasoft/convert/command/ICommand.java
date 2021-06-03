package com.jalasoft.convert.command;

import com.jalasoft.convert.convert_file.Criteria;

public interface ICommand {
    String build(Criteria criteria);
}
