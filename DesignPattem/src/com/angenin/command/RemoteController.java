package com.angenin.command;

import javax.jws.Oneway;

/**
 * @package_name: com.angenin.command
 * @name: RemoteController
 * @author: angenin
 * @dateTime: 2020/7/13 10:14 下午
 **/

//万能遥控器类
public class RemoteController {

    //开 按钮的命令数组
    Command[] onCommands;
    //关 按钮的命令数组
    Command[] offCommands;

    //撤销 按钮的命令
    Command undoCommand;

    //完成对按钮的初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            //对开按钮进行初始化
            onCommands[i] = new NoCommand();
            //对关按钮进行初始化
            offCommands[i] = new NoCommand();
        }
        //对撤销按钮进行初始化
        undoCommand = new NoCommand();
    }

    //设置指定编号按钮的功能（开关按钮对什么家电生效）
    public void setCommand(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    //按下指定编号的开按钮
    public void onButtonWasPushed(int no){
        //找到按下的按钮并执行对应的开操作
        onCommands[no].execute();
        //并记录最新的操作，用于之后的撤销动作
        undoCommand = onCommands[no];
    }

    //按下指定编号的关按钮
    public void offButtonWasPushed(int no){
        //找到按下的按钮并执行对应的开操作
        offCommands[no].execute();
        //并记录最新的操作，用于之后的撤销动作
        undoCommand = offCommands[no];
    }

    //按下撤销按钮
    public void undoButtonWasPushed(){
        //执行撤销操作
        undoCommand.undo();
        //因为这里的撤销操作只记录最新一次的操作，所以撤销后需要对撤销进行按钮初始化
        undoCommand = new NoCommand();
    }

}
