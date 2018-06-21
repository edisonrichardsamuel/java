import java.util.*;
import java.io.*;
public class Fact{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int s=Integer.parseInt(sc.nextInt());
        int fact=1;
        for(int i=1;i<=s;i++)
        {
            fact=fact*i;
        }
         System.out.println(fact);
     }
}
