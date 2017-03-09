package io.github.wangxinxing;

import org.junit.Test;

/**
 * Created by wangxinxing on 2017/3/9.
 */
public class SnowFlakeTest {

    @Test
    public void testSnowFlake() {
        SnowFlake snowFlake = new SnowFlake(10l);
        System.out.println(snowFlake.generateID());
        System.out.println(snowFlake.generateID());
        System.out.println(snowFlake.generateID());
        System.out.println(snowFlake.generateID());
    }

}
