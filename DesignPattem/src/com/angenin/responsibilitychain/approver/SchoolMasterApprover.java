package com.angenin.responsibilitychain.approver;

import com.angenin.responsibilitychain.PurchaseRequest;

/**
 * @package_name: com.angenin.responsibilitychain.approver
 * @name: SchoolMasterApprover
 * @author: angenin
 * @dateTime: 2020/7/19 3:58 下午
 **/

//校长类
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name){
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPric() > 30000){
            System.out.println("请求编号：" + purchaseRequest.getId() + " 处理成功...（处理者：" + getName() + "）");
        }else{
            getApprover().processRequest(purchaseRequest);
        }
    }

}
