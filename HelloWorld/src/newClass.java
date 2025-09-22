import java.util.concurrent.TimeUnit;

public class newClass {
    public static void main(String[] args) throws Exception {
        String alphabet = "1234567890+=ABCDEFGHIJKLMNOPQRSTUWVXYZÆØÅ., _-@!?abcdefghijklmnopqrstuwvxyzæøå:;";
        String text = "HelloWorld_Din password er: 2912-@CatsErCool.Break the code. Cracked your password. Cracked your password cracked your password";
        int myIndex = 0;
        String guess = "";

        while (!guess.equals(text)) {

            for (int i = 0; i < alphabet.length(); i++) {

                System.out.println(guess + alphabet.charAt(i));
                TimeUnit.MICROSECONDS.sleep(1000);
                if (alphabet.charAt(i) == text.charAt(myIndex)) {
                    guess = guess + alphabet.charAt(i);
                    break;
                }
            }
            myIndex++;

        }
    }
}
