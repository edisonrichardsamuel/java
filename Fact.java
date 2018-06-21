import java.util.Scanner;

public class Fact {
	public static void main(String a[]) {
		Scanner sc1=new Scanner(System.in);
        int s=sc1.nextInt();
        int f=1;
        for(int ii=1;ii<=s;ii++)
        {
            f=f*ii;
        }
         System.out.println(f);
	}

}
