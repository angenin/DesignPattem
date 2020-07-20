package com.angenin.command;

import com.angenin.command.light.LightOffCommand;
import com.angenin.command.light.LightOnCommand;
import com.angenin.command.light.LightReceiver;
import com.angenin.command.tv.TVOffCommand;
import com.angenin.command.tv.TVOnCommand;
import com.angenin.command.tv.TVReceiver;

/**
 * @package_name: com.angenin.command
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/13 10:33 下午
 **/
public class Test {

    //测试命令模式
    public static void main(String[] args) {
        //创建遥控器对象
        RemoteController remoteController = new RemoteController();
        //创建的电灯对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯的开关按钮
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //把按钮添加到控制器中，指定0号为电灯的开关按钮序号
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("----按下电灯的开按钮----");
        remoteController.onButtonWasPushed(0);
        System.out.println("----按下电灯的关按钮----");
        remoteController.offButtonWasPushed(0);
        System.out.println("----按下撤销按钮----");
        remoteController.undoButtonWasPushed();
        //再次按下撤销按钮没执行操作，因为按下后已被初始化
        remoteController.undoButtonWasPushed();

        //创建的电视对象（接受者）
        TVReceiver tvReceiver = new TVReceiver();
        //创建电视的开关按钮
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);

        //把按钮添加到控制器中，指定1号为电视的开关按钮序号
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("----按下电视的开按钮----");
        remoteController.onButtonWasPushed(1);
        System.out.println("----按下撤销按钮----");
        remoteController.undoButtonWasPushed();
    }
}
