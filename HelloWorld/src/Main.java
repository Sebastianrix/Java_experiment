import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) throws Exception{
        String text = "I cracked your password I cracked your password I cracked your password I cracked your password";

        nyMethod(bruteForce(text));
    }
    public static String bruteForce(String inPut)  throws InterruptedException{
        String alphabet = "987654321ABCDEFGHIJKLMNOPQRSTUWVXYZÆØÅ _-@!?abcdefghijklmnopqrstuwvxyzæøå";
        int myIndex= 0;
        int colorIndex = 97;
        String guess = "";
        while(!guess.equals(inPut)){
            for (int i = 0;i< alphabet.length();i++){

                TimeUnit.MICROSECONDS.sleep(2000);
                System.out.println("\u001B["+colorIndex+"m "+guess+alphabet.charAt(i));
                //System.out.println("\u001B[0m");
                if (colorIndex<97){colorIndex++;}else colorIndex = 91;
                if(alphabet.charAt(i)==inPut.charAt(myIndex)) {
                    guess=guess+alphabet.charAt(i);
                    break;
                }
            }
             myIndex ++;
        }
        return guess;
    }

    public static void nyMethod(String input){
        System.out.println("\u001B[41m"+input);
    }
}