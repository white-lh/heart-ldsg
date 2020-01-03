package com.buba.ldsg.util;

import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class MD5Util {
    /**
     * Method name: md5 <BR>
     * Description: 加密密码 <BR>
     * Remark: <BR>
     *
     * @param text 明文
     * @return String 密文<BR>
     */
    public static String md5(String text) {
        //加密后的字符串
        String encodeStr = DigestUtils.md5DigestAsHex(text.getBytes()).toUpperCase();
        return encodeStr;
    }

    /**
     * Method name: verify <BR>
     * Description: 验证密码是否正确 <BR>
     * Remark: <BR>
     *
     * @param text 明文
     * @param md5  密文
     * @return boolean 结果<BR>
     */
    public static boolean verify(String text, String md5) {
        //根据传入的密钥进行验证
        String md5Text = md5(text);
        if (md5Text.equalsIgnoreCase(md5)) {
            return true;
        }
        return false;
    }

}
