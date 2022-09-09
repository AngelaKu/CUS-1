import java.util.Scanner;

public class GraphicsHw {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = kb.nextLine();
		
		int vowels = 0;
		for (int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
			{
				vowels++;
			}
		}
		
		int a = 0;
		for (int l = 0; l < word.length(); l++)
		{
			if(word.charAt(l) == 'a')
			{
				a++;
			}	
		}
		
		int e = 0;
		for (int l = 0; l < word.length(); l++)
		{
			if(word.charAt(l) == 'e')
			{
				e++;
			}
		}
		
		int i = 0;
		for (int l = 0; l < word.length(); l++)
		{
			if(word.charAt(l) == 'i')
			{
				i++;
			}
		}
		
		int o = 0;
		for (int l = 0; l < word.length(); l++)
		{
			if(word.charAt(l) == 'o')
			{
				o++;
			}
		}
		
		int u = 0;
		for (int l = 0; l < word.length(); l++)
		{
			if(word.charAt(l) == 'u')
			{
				u++;
			}
		}
		
		System.out.println("Number of vowels of the entered word is "+vowels);
		System.out.println("There are "+a+" a, "+e+" e, "+i+" i, "+o+" o, "+u+" u");
		
				
				

	}

}
/*
Enter a word: dictionary
Number of vowels of the entered word is 4
There are 1 a, 0 e, 2 i, 1 o, 0 u
 */
