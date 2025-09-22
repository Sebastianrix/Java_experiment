import java.util.Scanner;

public class Hey {
 public static void main(String[] args){
     Scanner myScanner = new Scanner(System.in);
     System.out.println("Hvad hedder du?");

     String myInputText = myScanner.nextLine();

     System.out.println("Hej "+myInputText+" hyggeligt at møde dig!");

 }
}