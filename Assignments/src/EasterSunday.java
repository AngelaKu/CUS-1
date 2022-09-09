import java.text.DecimalFormat;
import java.util.Scanner;

public class EasterSunday {

	public static void main(String[] args) {
	
		int y, a,b, c, d, e, g, h, k, r, p, j, m, n; 
		
		
		System.out.print("Write the year as an integer: ");
		Scanner kb = new Scanner(System.in);
		y=kb.nextInt();
		
		a = y % 19;
		b = y/100;
		c = y % 100;
		d = b/4;
		e = b % 4;
		g = ((8*b)+13)/25;
		h = (19*a+b-d-g+15)%30;
		j = c/4; 
		k = c % 4;
		m = (a+11*b)/319;   
		r = ((2*e)+(2*j)-k-h+m+32)%7; 
		n = (h-m+r+90)/25; 
		p = (h-m+r+n+19)%32;
		
		System.out.println("Easter Sunday is "+n+"/"+p+"/"+y);
		
	}

}
/*
Write the year as an integer: 2001
Easter Sunday is 4/15/2001
 */
