/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */


	public String getResponse(String statement)
	{





		String response = statement;
		int responseLength = response.length();
		statement = statement.replaceAll("\\s", "").toLowerCase();


		//When the user inputs 0 characters, the bot will respond with "Enter a character right now!!!!" This makes a more enjoyable experience to the user.
		if (responseLength == 0)
		{
			response = "Enter a character right now!!!!";
		}
		//

//The role of this statement is to ask the user "Tell me more about your pet" when the user includes the word "dog". This creates a better experience for the user.
		 else if (statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pet.";
		}


		//The role of this statement is to ask the user "Tell me more about your pet" when the user includes the word "cat". This creates a better experience for the user.
		 else if (statement.indexOf("cat") >= 0)

		{
			response = "Tell me more about your pet.";
		}

		 //The role of this statement is to tell the user "He sounds like a good teacher" when the user includes the statement "Mr. Smith". This creates a better experience for the user.
		 else if (statement.indexOf("mr.smith") >= 0)
		{
			response = "He sounds like a good teacher.";
		}
////The role of this statement is to ask the user "I ain't helping you. Who do you think I am?" when the user includes the word "help". This creates a better experience for the user.
		else if(statement.indexOf("help") >= 0)
		{
			response = "I ain't helping you. Who do you think I am?";
		}

		////The role of this statement is to tell the user "Hate is a strong word." when the user includes the word "hate". This creates a better experience for the user.
		else if(statement.indexOf("hate") >= 0)
		{
			response = "Hate is a strong word";
		}

		//The role of this statement is to tell the user "I love you too" when the user includes the word "love". This creates a better experience for the user.
		else if(statement.indexOf("love") >= 0)
		{
			response = "I love you too";
		}

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		//When the user inputs a keyword that isn't recognizable by the boy, it will display these following phrases.

		else if (whichResponse == 4)
		{
			response = "What the hell did you say to me?";
		}

		else if (whichResponse == 5)
		{
			response = "Don't do that. Please.";
		}
		else if (whichResponse == 6)
		{
			response = "Say that again and see what happens.";
		}

		return response;
	}
}
