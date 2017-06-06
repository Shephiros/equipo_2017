package seguridad;

import java.security.MessageDigest;

/**
 *
 * @author user
 */
public class Encryptado {

    public boolean comparar(String contresenya, String base) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(contresenya.getBytes());
            byte byteData[] = md.digest();

            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            System.out.println("contrasenya que genera " + sb.toString());
            if (sb.toString().equals(base)) {
                System.out.println("contrasenya igual");
                return true;
            } else {
                System.out.println("contrasenya no es igual");
                return false;
            }

        } catch (Exception e) {

            return false;
        }//Fin de try

    }// Fin de metodo comparar.
    
    public String convertir(String contrasenya){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(contrasenya.getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            System.out.println("contrasenya que genera " + sb.toString());
            return sb.toString();
        } catch (Exception e) {

            return "Error";
        }//Fin de try
    }
}
