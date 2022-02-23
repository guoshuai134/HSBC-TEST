package org.example.test;

import org.example.model.Point;
import org.example.service.PointService;
import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName:
 * Description: TODO
 *
 * @author: Guo Shuai
 * @version: 1.0
 * @Date: 2022/2/19
 */
public class UnitTest {

    private final PointService pointService = new PointService();

    @Test
    public void exampleOne() {
        //定义字符串
        String str = "aabcccbbad";
        //循环
        while (true) {
            //获取结果
            Point point = pointService.getContinuityPoint(str);
            //判断是否未做任何操作
            if (point.getStartPosition() == -1) {
                break;
            } else {
                //获取连续的字符换
                String continuityStr = str.substring(point.getStartPosition(), point.getEndPosition() + 1);
                str = str.replaceFirst(continuityStr, "");
                System.out.println(str);
            }
        }
    }

    @Test
    public void exampleTwo() {
        //定义字符串
        String str = "abcccbad";
        //循环
        while (true) {
            //获取结果
            Point point = pointService.getContinuityPoint(str);
            //判断是否未做任何操作
            if (point.getStartPosition() == -1) {
                break;
            } else {
                //获取连续的字符换
                String continuityStr = str.substring(point.getStartPosition(), point.getEndPosition() + 1);
                str = str.replaceFirst(continuityStr, point.getPrevChar());
                System.out.println(str + "," + continuityStr + " is replaced by " + point.getPrevChar());
            }
        }
    }
}
