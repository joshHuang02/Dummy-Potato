/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
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
    public String getResponse(String statement) {
        statement = statement.trim();
        String response = "";
        if (statement.length() == 0) {
            response = "Come on say something.";
        } else if (statement.indexOf("to be or not to be") >= 0) {
            response = "That is the question.";
        } else if (statement.indexOf("the best programming language") >= 0 
        || statement.indexOf("The best programming language") >= 0) {
            response = "The language used in this program isn't the answer......";
        } else if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("dog") >= 0 
        || statement.indexOf("Dog") >= 0 
        || statement.indexOf("cat") >= 0
        || statement.indexOf("Cat") >= 0 ){
            response = "tell me moer about your pets.";
        } else if (statement.indexOf("Mr. Lu") >= 0) {
            response = "Wow! Mr. Lu is my favorite teacher!";
        } else if (statement.indexOf("joe") >= 0 || statement.indexOf("Joe") >= 0) {
            response = "Joe Mama";
        } else if (statement.equals("exit") || statement.equals("bye")) {
            System.exit(0); 
        } else {
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

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "Nani?";
        } else if (whichResponse == 5) {
            response = "Cool";
        }

        return response;
    }
}
