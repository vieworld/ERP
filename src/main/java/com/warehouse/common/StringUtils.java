package com.warehouse.common;

public class StringUtils {

    public static String DateManage(String message) {
        String replace = message.replace("-", "");

        String str = replace.substring(4);

        return str;
    }
}
