package sistemhotel;

import javax.swing.JOptionPane;


public class SistemHotel {
    
    public static void main(String[] args) {
        try {
            LoginForm lg = new LoginForm();
            lg.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
