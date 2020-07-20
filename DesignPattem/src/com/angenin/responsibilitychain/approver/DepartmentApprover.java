package com.angenin.responsibilitychain.approver;

import com.angenin.responsibilitychain.PurchaseRequest;

/**
 * @package_name: com.angenin.responsibilitychain.approver
 * @name: FepartmentApprover
 * @author: angenin
 * @dateTime: 2020/7/19 3:47 下午
 **/

//系主任类
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPric() <= 5000){
            System.out.println("请求编号：" + purchaseRequest.getId() + " 处理成功...（处理者：" + getName() + "）");
        }else{
            getApprover().processRequest(purchaseRequest);
        }
    }
}
