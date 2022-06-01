package com.xu;

import com.sun.org.apache.bcel.internal.generic.RET;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author XTY~
 * @version 1.0
 * @Date: 2022-05-31 12:19
 * @Description:
 */
public class Demo1Test
{
    @Test
    public void testSay()
    {
        Demo1 demo1 = new Demo1();
        String name = demo1.say("许天雨");
        Assert.assertEquals("hello 许天雨",name);
    }
}