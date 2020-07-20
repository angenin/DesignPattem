package com.angenin.responsibilitychain.approver;

import com.angenin.responsibilitychain.PurchaseRequest;

/**
 * @package_name: com.angenin.responsibilitychain.approver
 * @name: CollegeApprover
 * @author: angenin
 * @dateTime: 2020/7/19 3:54 下午
 **/

//院长类
public class CollegeApprover extends Approver {

    public CollegeApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPric() > 5000 && purchaseRequest.getPric() <= 10000){
            System.out.println("请求编号：" + purchaseRequest.getId() + " 处理成功...（处理者：" + getName() + "）");
        }else{
            getApprover().processRequest(purchaseRequest);
        }
    }
}
