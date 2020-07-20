package com.angenin.command.light;

import com.angenin.command.Command;

/**
 * @package_name: com.angenin.command
 * @name: LightOnCommand
 * @author: angenin
 * @dateTime: 2020/7/13 10:02 下午
 **/


//开灯类
public class LightOnCommand implements Command {

    //聚合LightReceiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light){
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法，开灯类，所以调用on方法
        light.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法，进行撤销操作，与execute方法做相反的操作
        light.off();
    }
}
