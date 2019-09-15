package pratice_home;

public class PasswordCombination {

	public static void main(String[] args) 
	{
		        char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		        int len = 2;
		        iterate(chars, len, new char[len], 0);
	}

		   
	public static void iterate(char[] chars, int len, char[] build, int pos)
	{
		        if (pos == len) 
		        {
		            String word = new String(build);
		            // do what you need with each word here
		            
		            System.out.println("word:"+word);
		            
		            return;
		        }

		        for (int i = 0; i < chars.length; i++)
		        {
		            build[pos] = chars[i];
		            iterate(chars, len, build, pos + 1);
		        }
		        
		    }
		
	}


