import java.util.*;
public class Strrev{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       StringBuilder sb = new StringBuilder(s);
        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
     }
}
