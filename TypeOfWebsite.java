/*Write a program to find out the type of website from the URL:

.com – commercial website
.org – organization website
.in – Indian website  */
import java.util.Scanner;
public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
    }
}
