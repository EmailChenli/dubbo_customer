package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Administrator
 * 2021/9/9 0009
 */
public class TestCase {

    //数据驱动
    //运行时，runtime，compile，resource
    //methed
    //名称，运行方式（并行，串行），定义数量
    @DataProvider(name="provider")
    public Object[][] provider(){
        Object [][] provider = new Object [5][2];
        for (int i = 0; i < provider.length; i++) {
            provider[i][0] = "name"+i;
            provider[i][1] = i+10;
        }

        return provider;
    }

    @Test(dataProvider="provider")
    public void getName(String name,int age){
        System.out.println(name+"_"+age);

    }
}
