
import java.util.Scanner;

public class Solution {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            /*
            Use printf to print the string (s1) left-justified in a 15-character wide field. 
            If the string is shorter than 15 characters, the remaining space on the right will 
            be filled with spaces.*/
            System.out.printf("%-15s", s1);
            /*Use another printf to print the integer (x). It will be formatted to have at least 
            three digits (it will be padded with zeros in front if necessary). 
            The %n at the end of the format string is used to print a new line.
            */
            System.out.printf("%03d%n", x );

        }
        System.out.println("================================");

}
}
