package com.angenin.memento.game;

/**
 * @package_name: com.angenin.memento.game
 * @name: GameRole
 * @author: angenin
 * @dateTime: 2020/7/17 10:56 下午
 **/
public class GameRole {

    private int vit;    //攻击力
    private int def;    //防御力

    //根据当前状态创建创建Memento并返回
    public Memento createMemento(){
        return new Memento(vit, def);
    }

    //根据传入的备忘录对象，恢复游戏角色的状态
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //显示游戏角色的状态
    public void display(){
        System.out.println("攻击力：" + this.vit);
        System.out.println("防御力：" + this.def);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }
}
