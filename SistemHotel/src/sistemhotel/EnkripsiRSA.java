package sistemhotel;

import java.security.*;
import javax.crypto.Cipher;
import javax.xml.bind.DatatypeConverter;

public class EnkripsiRSA {

    private static final String RSA = "RSA/ECB/PKCS1Padding";

    public static KeyPair RSAKey() throws Exception {
        SecureRandom secureRandom = new SecureRandom();
        KeyPairGenerator KPG = KeyPairGenerator.getInstance("RSA");
        KPG.initialize(2048, secureRandom);
        return KPG.generateKeyPair();
    }

    public static byte[] RSAEncryp(String pT, PublicKey pubKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA);
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        return cipher.doFinal(pT.getBytes());
    }

    public static String RSADecryp(byte[] cT, PrivateKey priKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA);
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        byte[] result = cipher.doFinal(cT);
        return new String(result);
    }

   }

