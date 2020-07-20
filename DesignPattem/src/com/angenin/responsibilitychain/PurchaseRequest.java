package com.angenin.responsibilitychain;

/**
 * @package_name: com.angenin.responsibilitychain
 * @name: PurchaseRequest
 * @author: angenin
 * @dateTime: 2020/7/19 3:38 下午
 **/

//请求类
public class PurchaseRequest {

    private int type = 0;       //请求类型
    private float pric = 0.0f;  //请求的金额
    private int id = 0;


    public PurchaseRequest(int type, float pric, int id) {
        this.type = type;
        this.pric = pric;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public float getPric() {
        return pric;
    }
}
