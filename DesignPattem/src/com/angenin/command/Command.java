package com.angenin.command;

/**
 * @package_name: com.angenin.command
 * @name: Command
 * @author: angenin
 * @dateTime: 2020/7/13 10:00 下午
 **/

//命令接口
public interface Command {

    //执行动作或操作
    public void execute();
    //撤销动作或操作
    public void undo();

}
