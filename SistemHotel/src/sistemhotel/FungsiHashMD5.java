package sistemhotel;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

public class FungsiHashMD5 {

    final private static String ALGORITMA_HASH = "MD5";

    public static String hash(String plain) {
        String cipher = null;
        try {
            MessageDigest md = MessageDigest.getInstance(ALGORITMA_HASH);
            md.update(plain.getBytes());
            byte[] bytes = md.digest();
            cipher = DatatypeConverter.printHexBinary(bytes).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cipher;
    }
}
