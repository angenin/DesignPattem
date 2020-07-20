package com.angenin.responsibilitychain.approver;

import com.angenin.responsibilitychain.PurchaseRequest;

/**
 * @package_name: com.angenin.responsibilitychain
 * @name: Approver
 * @author: angenin
 * @dateTime: 2020/7/19 3:42 下午
 **/
public abstract class Approver {

    private String name;        //姓名
    private Approver approver;  //下一个处理者

    public Approver(String name) {
        this.name = name;
    }

    //设置下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理审批请求的方法，得到一个请求，因为是由子类来处理的，所以该方法为抽象方法
    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public String getName() {
        return name;
    }

    public Approver getApprover() {
        return approver;
    }
}
