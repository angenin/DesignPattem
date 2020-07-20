package com.angenin.state.state;

import com.angenin.state.RaffleActivity;

import java.util.Random;

//可以抽奖状态类
public class CanRaffleState implements State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //此状态已扣除了积分，无需再扣除
    @Override
    public void deductMoney() {
        System.out.println("已扣除积分，请进行抽奖...");
    }

    //此状态可以抽奖，抽奖后，根据抽奖情况更改状态
    @Override
    public boolean raffle() {
        System.out.println("抽奖中...");
        Random r = new Random();
        int num = r.nextInt(10);
        //10%抽中机率
        if(num == 0){
            System.out.println("恭喜您中奖了！");
            //改变活动状态为发放奖品
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾，没抽中奖品...");
            //改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }

    //此状态不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品...");
    }
}
