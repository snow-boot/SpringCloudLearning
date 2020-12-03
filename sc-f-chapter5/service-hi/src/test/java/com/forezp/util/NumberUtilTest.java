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
    public void getString(){
        String str = numberUtil.getString(1);
        System.out.println(str);
    }
}
