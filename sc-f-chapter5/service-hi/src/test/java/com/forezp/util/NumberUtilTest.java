package com.forezp.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class NumberUtilTest {

    @InjectMocks
    private NumberUtil numberUtil;

    @Test(timeout = 20000)
    public void getStringTest1(){
        String str = numberUtil.getString(1);
        System.out.println(str);
    }

    @Test(timeout = 20000)
    public void getStringTest2(){
        String str = numberUtil.getString(10);
        System.out.println(str);
    }

    @Test(timeout = 20000)
    public void getStringTest3(){
        String str = numberUtil.getString(100);
        System.out.println(str);
    }


    @Test(timeout = 20000)
    public void getStringTest4(){
        String str = numberUtil.getString2(100);
        System.out.println(str);
    }
}
