package com.badboyh2o.webservice.client;

import java.rmi.RemoteException;

import com.badboyh2o.webservice.CommonServiceProxy;

public class Client {

    public static void main(String args[]){
        CommonServiceProxy h = new CommonServiceProxy();
        try {
            String s = h.sayHello("yangwenxue");
            System.out.println("调webservice:"+s);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
