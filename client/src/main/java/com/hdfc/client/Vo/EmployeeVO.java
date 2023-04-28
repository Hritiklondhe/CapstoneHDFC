package com.hdfc.client.Vo;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.util.Base64Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeVO {

    private long employeeId;
    private String employeeName;
    private String dateOfBirth;

    private static final String ALGORITHM = "AES";
    private static final String KEY = "09876543210987654321098765432109";

    public static String decryptDOB(String encrypteddob) throws Exception {
        SecretKeySpec key = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = cipher.doFinal(Base64Utils.decodeFromString(encrypteddob));
        return new String(decrypted);
    }
}