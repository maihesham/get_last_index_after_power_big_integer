import java.util.Scanner;
/*
 * 2*2 = 4*2 = 8*2 = 16*2 = 32 last digit in 32 is 2 that means
     after multiplying 4 times digit repeat itself.
 * store last digit of a in last_digit
 * now we are expect by if b%4==0 so after 4 times will cycle again
 * or if b%4!=0 so will cycle after b%4 times
 *
 *

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int b=input.nextInt();
		String z=Integer.toString(n);
		int last_digit=Character.getNumericValue(z.charAt(z.length()-1));
		int exp=0;
		if(b%4==0){
			exp=4;
		}else{
			exp=b%4;
		}
		int a=(int) Math.pow(last_digit, exp);
	    System.out.println("Last digit of "+" "+n+"^"+b+"  = "+a%10);


	}

}