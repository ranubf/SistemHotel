package sistemhotel;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class EnkripsiAES {

    public SecretKey buatKunci() throws Exception {
        SecureRandom sr = new SecureRandom();
        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(256, sr);
        return kg.generateKey();
    }

    public byte[] buatIV() {
        byte[] iv = new byte[16];
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(iv);
        return iv;
    }

    public byte[] AESEncyption(String pt, SecretKey sk, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, sk, ivParameterSpec);
        return cipher.doFinal(pt.getBytes());
    }

    public String AESDecryption(byte[] cT, SecretKey sK, byte[] iV) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iV);
        cipher.init(Cipher.DECRYPT_MODE, sK, ivParameterSpec);
        byte[] result = cipher.doFinal(cT);
        return new String(result);
    }
}
