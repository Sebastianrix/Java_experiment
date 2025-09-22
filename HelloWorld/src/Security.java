import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Security {
    public static void main(String[] args) throws Exception{
       //System.out.println(Main.bruteForce("Working?"));
       // Main.bruteForce("Doom?");

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String messege = "0000";
       // System.out.println(md.digest(messege.getBytes(StandardCharsets.UTF_8)));

        byte[] byteHash = md.digest(messege.getBytes(StandardCharsets.UTF_8));

       for (byte b : byteHash){
          String hex = Integer.toHexString(0xff & b);
          //if (hex.length() == 1) {
          //byteHash.append(hex);
       //}
          }
    }
    }

