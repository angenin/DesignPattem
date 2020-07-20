package com.angenin.state.state;

//状态接口
public interface State {

    //扣除积分（-50）
    public void deductMoney();
    //是否抽中奖品
    public boolean raffle();
    //发放奖品
    public  void dispensePrize();

}
