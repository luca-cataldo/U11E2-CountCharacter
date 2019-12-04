/*
Name: CountCharacter
Purpose: Count the number of occurences of a character in a string.
Author: Luca Cataldo
Date: Dec. 4, 2019
*/

import java.io.*;

public class CountCharacter
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader keyboardInput = new BufferedReader (new InputStreamReader (System.in));

	System.err.print ("Enter a character: ");
	char charac = (keyboardInput.readLine ().charAt (0));

	System.err.print ("Enter a line of text: ");
	String str = (keyboardInput.readLine ());

	int count = 0;
	for (int i = 0 ; i < str.length () ; i++)
	{
	    if (str.charAt (i) == charac)
	    {
		count++;
	    }
	}
	System.out.println (count);
    }
}



