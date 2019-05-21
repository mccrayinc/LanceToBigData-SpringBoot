package com.lance.boot.common.number;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-05-21 17:27
 * @Description: 相关数字处理
 *
 */
public class NumericUtil {

    public static BigDecimal getMin(BigDecimal... e) {
        List<BigDecimal> list = Arrays.asList(e);

        // 升序排序
        list.sort(BigDecimal::compareTo);

        return list.get(0);
    }

    public static Integer getMin(Integer... e) {
        List<Integer> list = Arrays.asList(e);

        // 升序排序
        list.sort(Integer::compareTo);

        return list.get(0);
    }

    public static Integer getMax(Integer... e) {
        List<Integer> list = Arrays.asList(e);

        // 降序排序
        list.sort(Comparator.reverseOrder());

        return list.get(0);
    }

    public static Integer getMax(List<Integer> list) {
        // 降序排序
        list.sort(Comparator.reverseOrder());

        return list.get(0);
    }

    /**
     * source > target
     * @param source 原数量
     * @param target 目标数量
     * @return 是原否小于目标
     */
    public static boolean gt(BigDecimal source, BigDecimal target){
        return source.compareTo(target)>0;
    }

    /**
     * source < target
     * @param source 原数量
     * @param target 目标数量
     * @return 是原否小于目标
     */
    public static boolean lt(BigDecimal source, BigDecimal target){
        return source.compareTo(target)<0;
    }

    /**
     * source >= target
     * @param source 原数量
     * @param target 目标数量
     * @return 是原否小于目标
     */
    public static boolean ge(BigDecimal source, BigDecimal target){
        return source.compareTo(target)>=0;
    }

    /**
     * source <= target
     * @param source 原数量
     * @param target 目标数量
     * @return 是原否小于目标
     */
    public static boolean le(BigDecimal source, BigDecimal target){
        return source.compareTo(target)<=0;
    }

    public static boolean eq(BigDecimal source, BigDecimal target){
        return source.compareTo(target)==0;
    }

    public static boolean isInteger(String str) {
        String regx = "^[-\\+]?[\\d]*$";
        Pattern pattern = Pattern.compile(regx);
        return pattern.matcher(str).matches();
    }

    /**
     *  把A转换为10，B转换为11,C转换为12。。。依次类推
     * @author liusu
     * @date 2019/2/27 10:02
     *
     */
    public static int charToNum(char c){
        if(isInteger(String.valueOf(c))){
            return Integer.valueOf(String.valueOf(c));
        }

        int  b   =  c - 65 + 10;
        return b;
    }

}
