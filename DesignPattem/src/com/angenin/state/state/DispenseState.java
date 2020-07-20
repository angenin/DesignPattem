package com.angenin.state.state;

import com.angenin.state.RaffleActivity;

//发放奖品状态类
public class DispenseState implements State {

	 //初始化时传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    //此状态需要先发放奖品后才能重新扣除积分，进行抽奖
    @Override
    public void deductMoney() {
        System.out.println("已中奖，请先领取奖品后，再进行操作...");
    }

    //此状态需要先发放奖品后才能重新扣除积分，进行抽奖
    @Override
    public boolean raffle() {
        System.out.println("已中奖，请先领取奖品后，再进行操作..");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if(activity.getCount() > 0){
            System.out.println("领取奖品成功，正在发放奖品...");
            //改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
        }else{
            System.out.println("奖品库存已被领完，请隔天再进行领取...");
            //扣除积分后无法领取奖品不够人性化，此类可以不需要，奖品发放完后可以让客户隔天再领取，客户状态不需要改变，依然是发放奖品状态
            //如果想奖品发放完后结束活动，可在扣除积分时和抽奖时进行判断还有无奖品
            //activity.setState(activity.getDispensOutState());

            //奖品库存为0，抽奖结束
            //System.out.println("抽奖活动结束");
            //System.exit(0);
        }

    }
}
