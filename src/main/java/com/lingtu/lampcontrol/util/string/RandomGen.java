package com.lingtu.lampcontrol.util.string;

import java.util.Random;

/**
 * @author 马帅
 * @version 1.0
 * @className RandomGen.java
 * @description 随机验证码工具
 * @date 2020/3/15 23:32
 */
public class RandomGen {

    /**
     * 生成四位不重复的验证码
     */
    public static String getCodeGen(){

        char [] codeSequence = {

                'A','B','C','D','E','F','G','H','I','J',
                'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                '1','2','3','4','5','6','7','8','9'
        };

        char [] numberCode = {
                '0','1','2','3','4','5','6','7','8','9'
        };

        Random random =new Random();

        // 动态字符串，String创建的字符串不能修改
        StringBuilder sb = new StringBuilder();

        // 计数器确定产生的是四位验证码
        int count = 0;
        while(true){

            // 随机产生一个下标，通过下标取出字符数组对应的字符
            char c = numberCode[random.nextInt(numberCode.length)];

            // 假设取出来的字符在动态字符串中不存在，代表没有重复
            if (sb.indexOf(c+"") == -1) {
                //追加到动态字符串中
                sb.append(c);
                count++;
                if (count == 4) {
                    break;
                }
            }
        }

        return sb.toString();

    }



}
