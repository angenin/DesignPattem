package com.angenin.state.state;

import com.angenin.state.RaffleActivity;

//奖品发放完状态类
//扣除积分后无法领取奖品不够人性化，此类可以不需要，奖品发放完后可以让客户隔天再领取，客户状态不需要改变，依然是发放奖品状态
public class DispenseOutState implements State {

	// ��ʼ��ʱ��������
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("奖品库存已被领完，请下次在参与...");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品库存已被领完，请下次在参与...");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品库存已被领完，请下次在参与...");
    }
}
