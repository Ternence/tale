package com.tale.init;

import com.blade.kit.base.Config;

/**
 * Tale 常量存储
 *
 * @author biezhi
 */
public class TaleConst {

    public static final String USER_IN_COOKIE = "S_L_ID";
    public static String AES_SALT = "0123456789abcdef";
    public static String LOGIN_SESSION_KEY = "login_user";
    public static Config OPTIONS = new Config();
    public static boolean INSTALL = false;
    public static Config BCONF = null;

    /**
     * 最大页码
     */
    public static final int MAX_PAGE = 100;

    /**
     * 最大获取文章条数
     */
    public static final int MAX_POSTS = 9999;

    /**
     * 点击次数超过多少更新到数据库
     */
    public static final int HIT_EXCEED = 10;

}