import java.util.Scanner;

public class MyCreates {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ar[] = new int [3];
		int b = 0;
		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = in.nextInt();
		}
	    for (int i = 0; i < ar.length; i++)
		    {
	    		if (ar[i] % 2== 0) b+=1;
		    }
	    if (b >= 2) { System.out.print("true");}
	    else System.out.print("false");
	    }
}
