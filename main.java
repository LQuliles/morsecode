import java.util.*;

public class main 
{
	public static void main(String[] args) 
	{
		ArrayList<String> Holder = new ArrayList<String>();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Morsecode please");
		String userinput = in.nextLine();
		
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

        String[] morsecode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };
       for(String i : morsecode) 
       {
    	   Holder.add(i);
       }
       String text = "";
       
       translator(userinput, text, alphabet, Holder);
       
	}
	
	public static String translator( String i, String text, String[] alphabet, ArrayList<String> Holder) 
	{
		int cnt = 1;
		
		while( cnt <= i.length()) 
		{ 
			String temp;
			
			if(Holder.indexOf(i.substring(0, cnt)) != -1) 
			{
				temp = alphabet[Holder.indexOf(i.substring(0, cnt))];
				
				translator(i.substring(cnt, i.length()), text + temp, alphabet, Holder);
				
			}
			cnt++;
		}
		
		if(i.length() == 0 ) 
		{
			System.out.println( "Your morseocde could translate to" +  text);
		}
		
		
		return text;
		
	}
	
	
}
