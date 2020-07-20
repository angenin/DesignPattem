package com.angenin.memento.game;

/**
 * @package_name: com.angenin.memento.theory
 * @name: Memento
 * @author: angenin
 * @dateTime: 2020/7/17 10:21 下午
 **/

//备忘录类
public class Memento {

    private int vit;    //攻击力
    private int def;    //防御力

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
