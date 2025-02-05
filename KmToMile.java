//Km to mile conversion
import java.util.Scanner;
public class KmToMile {
    public static void main(String[] args) {
        System.out.println("Enter Km Value");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        float mile = (float) 0.621371;
        float multiply = km * mile;

        System.out.println("Ans Mile : " + multiply);
    }
}
