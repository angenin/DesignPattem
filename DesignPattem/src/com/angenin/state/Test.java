package com.angenin.state;

/**
 * ״̬ģʽ������
 * @author Administrator
 *
 */
public class Test {

    //测试状态模式
	public static void main(String[] args) {
		//创建抽奖活动对象，奖品池里有3个奖品
        RaffleActivity activity = new RaffleActivity(3);

        //连抽10次
        for (int i = 0; i < 100; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            //扣除积分
            activity.debuctMoney();

            //进行抽奖
            activity.raffle();
        }
	}

}
