import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); 
		 while(num != 0)
        {
            num /= 10;
            ++count;
        } System.out.println("Number of digits: " + count);
    }
}
