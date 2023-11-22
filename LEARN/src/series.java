




import java.util.*;
import java.io.*;

class series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- > 0){
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            int seq=0,i=1;
            while(n-- > 0){
                seq+=(i*b);
                System.out.print((seq+a)+" ");
                i*=2;
            }
            System.out.println();
            
        }
        in.close();
    }
}
