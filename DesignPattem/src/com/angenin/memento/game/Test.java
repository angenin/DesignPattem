package com.angenin.memento.game;


/**
 * @package_name: com.angenin.memento.theory
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/17 10:30 下午
 **/
public class Test {

    //测试备忘录模式
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(50);

        System.out.println("v v v 战斗前状态 v v v");
        gameRole.display();
        System.out.println("--------------");

        //对当前状态进行存档
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("v v v 战斗后状态 v v v");
        gameRole.setVit(60);
        gameRole.setDef(20);
        gameRole.display();
        System.out.println("--------------");

        //读档，恢复到战斗前的状态
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("v v v 恢复后状态 v v v");
        gameRole.display();
    }
}
