package com.angenin.command.tv;

import com.angenin.command.Command;

/**
 * @package_name: com.angenin.command
 * @name: LightOnCommand
 * @author: angenin
 * @dateTime: 2020/7/13 10:02 下午
 **/


//关灯类
public class TVOffCommand implements Command {

    //聚合LightReceiver
    TVReceiver tv;

    public TVOffCommand(TVReceiver tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        //调用接收者的方法，关灯类，所以调用off方法
        tv.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法，进行撤销操作，与execute方法做相反的操作
        tv.on();
    }
}
