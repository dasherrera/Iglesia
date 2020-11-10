/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author ASUS
 */
public class encriptacion {
    
    public String getMd5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] encry = md.digest(input.getBytes());
            BigInteger Num = new BigInteger(1, encry);
            String encString = Num.toString(16);
            while (encString.length() < 32) {
                encString = "0" + encString;
            }
            return encString;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
