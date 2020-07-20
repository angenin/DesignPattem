package com.angenin.state;

import com.angenin.state.state.*;

//客户抽奖活动状态类
public class RaffleActivity {

    //客户当前状态
    State state = null;
    //奖品数量
    int count = 0;

    //活动状态
    State noRafflleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState =   new DispenseState(this);
    //State dispensOutState = new DispenseOutState(this);

    public RaffleActivity( int count) {
        //初始化当前状态为不可抽奖状态
        this.state = getNoRafflleState();
        //初始化奖品数量
        this.count = count;
    }

    //扣积分，调用当前状态的debuctMoney方法
    public void debuctMoney(){
        state.deductMoney();
    }

    //抽奖，调用当前状态的raffle方法
    public void raffle(){
        if(state.raffle()){
            //如果抽奖成功，领取奖品
            state.dispensePrize();
        }

    }

    //每领取一次奖品，数量减1
    public int getCount() {
        System.out.println("当前奖品数量：" + count);
        return count--;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

//    public State getDispensOutState() {
//        return dispensOutState;
//    }
//
//    public void setDispensOutState(State dispensOutState) {
//        this.dispensOutState = dispensOutState;
//    }
}
