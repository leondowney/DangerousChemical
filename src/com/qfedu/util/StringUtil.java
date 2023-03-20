package com.qfedu.util;

/**
 * Author：jiangtao_liu
 * Date：2023/3/10
 * Description：
 */
public class StringUtil {

    public static boolean isNull(String str) {

        if (str==null || "".equals(str)){
            return true;
        }else {
            return false;
        }
    }
}
