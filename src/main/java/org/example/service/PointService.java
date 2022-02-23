package org.example.service;

import org.example.model.Point;

public class PointService {

    /**
     * Get the first continuity point
     *
     * @param str
     * @return
     */
    public Point getContinuityPoint(String str) {
        //拆分字符串
        char[] charArray = str.toCharArray();
        //定义统计次数的变量
        int charCount = 1;
        //定义标记开始位置
        int startPosition = 0;
        //循环判断
        for (int i = 1; i < charArray.length; i++) {
            //判断当前字符串是否和上一个一样
            if (charArray[i] == charArray[i - 1]) {
                //累加出现次数
                charCount++;
            } else {
                //判断连续次数是否超过1
                if (charCount == 3) {
                    //封装数据
                    Point point = new Point();
                    point.setStartPosition(startPosition);
                    point.setEndPosition(i - 1);
                    //获取上一个字符
                    int prevCode = ((int) charArray[i - 1]) - 1;
                    //判断上一个字符位置是否不存在
                    if (prevCode < 97) {
                        point.setPrevChar("");
                    } else {
                        point.setPrevChar((char) prevCode + "");
                    }
                    //返回结果
                    return point;
                } else {
                    charCount = 1;
                    startPosition = i;
                }
            }
        }

        //返回默认结果
        return new Point(-1, -1, null);
    }
}
