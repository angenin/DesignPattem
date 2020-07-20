package com.angenin.state.state;

import com.angenin.state.RaffleActivity;

//不能抽奖状态类
public class NoRaffleState implements State {

	 //初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //此状态可以扣除积分，扣除后，将状态设置成可以抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，可以进行抽奖了...");
        activity.setState(activity.getCanRaffleState());
    }

    //此状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才可抽奖...");
        return false;
    }

    //此状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品...");
    }
}
