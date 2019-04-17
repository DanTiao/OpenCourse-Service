package com.cc.open.utils;



import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;

public class AESEncrDecrUtil {
	
	private final static String KEY="qweqweqweqwe";
	
	private final static String TRANSFORMATION = "AES/ECB/PKCS5Padding";

	
	public static String encrypt(String content, String encryptkey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptkey.getBytes(), "AES"));
        byte[] b = cipher.doFinal(content.getBytes("utf-8"));
        // 采用base64算法进行转码,避免出现中文乱码
        return Base64.encodeBase64String(b);
    }
	
	public static String decrypt(String encryptStr, String decryptKey) throws Exception {
	    KeyGenerator kgen = KeyGenerator.getInstance("AES");
	    kgen.init(128);
	    Cipher cipher = Cipher.getInstance(TRANSFORMATION);
	    cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"));
	    // 采用base64算法进行转码,避免出现中文乱码
	    byte[] encryptBytes = Base64.decodeBase64(encryptStr);
	    byte[] decryptBytes = cipher.doFinal(encryptBytes);
	    return new String(decryptBytes);    
	}
	
	public static String encrypt(String content) throws Exception {
        return encrypt(content, KEY);
    }
    public static String decrypt(String encryptStr) throws Exception {
        return decrypt(encryptStr, KEY);
    }
	 
}
