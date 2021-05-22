package com.zzp.spring5;

/**
 * 使用有参数构造注入
 */
public class Orders {

    // 创建属性
    private String oname;
    private String address;

    // 有参数构造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(oname + "::" +address);
    }
}
