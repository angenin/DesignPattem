package com.angenin.responsibilitychain;

import com.angenin.responsibilitychain.approver.CollegeApprover;
import com.angenin.responsibilitychain.approver.DepartmentApprover;
import com.angenin.responsibilitychain.approver.SchoolMasterApprover;
import com.angenin.responsibilitychain.approver.ViceSchoolMasterApprover;

/**
 * @package_name: com.angenin.responsibilitychain
 * @name: Test
 * @author: angenin
 * @dateTime: 2020/7/19 3:59 下午
 **/
public class Test {

    //测试责任链模式
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000.0f, 1);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");

        //将各个审批级别的下一个设置好（设置为环状，必须进行处理，因为所有金额都在我们设置的范围内，所以可以设置环状）
        //如果请求范围不能全部设置，就只能设置链状的，不能有环状，否则会形成死循环
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
        viceSchoolMasterApprover.processRequest(purchaseRequest);
    }

}
