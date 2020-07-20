package com.angenin.command;

/**
 * @package_name: com.angenin.command
 * @name: NoCommand
 * @author: angenin
 * @dateTime: 2020/7/13 10:11 下午
 **/

//没有如何命令，用于初始化每个按钮，当调用空命令时，对象什么都不做
//这也是一种设计模式，可以省掉对空的判断
public class NoCommand implements Command {
    @Override
    public void execute() {
        //空实现
    }

    @Override
    public void undo() {
        //空实现
    }
}
