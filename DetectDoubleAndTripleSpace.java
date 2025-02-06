//Write a Java program to detect double and triple spaces in a string.

public class DetectDoubleAndTripleSpace {
    public static void main(String[] args) {
        String myString = "This string  contains double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
//It will give the index where double and triple space is present and if not present it will return -1 in output