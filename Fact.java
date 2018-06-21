import java.util.Scanner;

public class Fact {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int fact=1;
        for(int i=1;i<=s;i++)
        {
            fact=fact*i;
        }
         System.out.println(fact);
	}

}
