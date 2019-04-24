package com.cc.open.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AESUtil {
	
	private final static Logger logger = LoggerFactory.getLogger(AESUtil.class);

	/**
     * 密钥
     */
    private static String key;
	
    @Value("${OpenCourses.AES.key}")
	private void setKey(String secretKey) {
		this.key = secretKey;
	}

    /**
     * 算法
     */
    private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";

    /**
     * AES加密
     * @param content 待加密的内容
     * @param key 加密密钥
     * @return 加密后的byte[]
     */
    public static byte[] AESEncryptToBytes(String content) {  
		try {
			KeyGenerator kgen;
			kgen = KeyGenerator.getInstance("AES");
	        kgen.init(128);
	        Cipher cipher;
			cipher = Cipher.getInstance(ALGORITHMSTR); 
	        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key.getBytes(), "AES"));
	        byte[] bytes = cipher.doFinal(content.getBytes("utf-8"));
	        return bytes;
		} catch (NoSuchAlgorithmException e) {
			logger.error("########  AESEncryption failed: NoSuchAlgorithmException");
		} catch (NoSuchPaddingException e) {
			logger.error("########  AESEncryption failed: NoSuchPaddingException");
		} catch (InvalidKeyException e) {
			logger.error("########  AESEncryption failed: InvalidKeyException");
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			logger.error("########  AESEncryption failed: IllegalBlockSizeException");
		} catch (BadPaddingException e) {
			logger.error("########  AESEncryption failed: BadPaddingException");
		} catch (UnsupportedEncodingException e) {
			logger.error("########  AESEncryption failed: UnsupportedEncodingException");
		}
		return null;
    }


    /**
     * AES加密为base 64 code
     *
     * @param content 待加密的内容
     * @return 加密后的base 64 code
     */
    public static String encrypt(String content) {
        return StringUtils.isEmpty(content) ? null : CodeUtil.base64Encode(AESEncryptToBytes(content));
    }

    /**
     * AES解密二进制内容
     * @param encryptBytes 待解密的byte[]
     * @param key 解密密钥
     * @return 解密后的String
     */
    public static String AESDecryptByBytes(byte[] encryptBytes){  
		try {
			KeyGenerator kgen;
			kgen = KeyGenerator.getInstance("AES");
	        kgen.init(128);      
	        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
	        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key.getBytes(), "AES"));
	        byte[] decryptBytes = cipher.doFinal(encryptBytes);
	        return new String(decryptBytes, "UTF-8");
		} catch (NoSuchAlgorithmException e) {
			logger.error("########  AESDecrytion failed: NoSuchAlgorithmException");
		} catch (NoSuchPaddingException e) {
			logger.error("########  AESDecrytion failed: NoSuchPaddingException");
		} catch (InvalidKeyException e) {
			logger.error("########  AESDecrytion failed: InvalidKeyException");
		} catch (IllegalBlockSizeException e) {
			logger.error("########  AESDecrytion failed: IllegalBlockSizeException");
			e.printStackTrace();
		} catch (BadPaddingException e) {
			logger.error("########  AESDecrytion failed: BadPaddingException");
		} catch (UnsupportedEncodingException e) {
			logger.error("########  AESDecrytion failed: UnsupportedEncodingException");
		}
    	return null;
    }


    /**
     * 将base 64 code AES解密
     * @param encryptStr 待解密的base 64 code
     * @return 解密后的string
     */
    public static String decrypt(String encryptStr) {
        return StringUtils.isEmpty(encryptStr) ? null : AESDecryptByBytes(CodeUtil.base64Decode(encryptStr));
    }
    
}
