/**
 * This class tests strings
 *
 * @author Josh Huang
 * @version 9/26/2019
 */
public class StringTester
{
    public static void main() {
        String weatherCondition;
        weatherCondition = "39 scattered showers (day)";
        System.out.println("Weather Condition: " + weatherCondition);
        System.out.println("Looking for first word: " + weatherCondition.substring(weatherCondition.indexOf(" ") + 1, weatherCondition.indexOf(" ", weatherCondition.indexOf(" ") + 1)));
        System.out.println("Looking for thunder: " + weatherCondition.indexOf("thunder"));

        //weather conditional test
        System.out.println("\nWeather Conditionals Test\n\n" + weatherConditionals.getWeatherAdvice(102, "snow"));
        System.out.println(weatherConditionals.getWeatherAdvice(30, "sunny"));
        System.out.println(weatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(weatherConditionals.getWeatherAdvice(34, "snow"));
        System.out.println(weatherConditionals.getWeatherAdvice(40, "windy"));

        //hiking advice test
        System.out.println("\nHiking Advice Test\n\n" + weatherConditionals.getHikingAdvice(32, 28, 40, "sunny"));
        System.out.println(weatherConditionals.getHikingAdvice(56, 56, 40, "snow"));
        System.out.println(weatherConditionals.getHikingAdvice(56, 56, 40, "windy"));
        System.out.println(weatherConditionals.getHikingAdvice(56, 56, 40, "hail"));
        System.out.println(weatherConditionals.getHikingAdvice(56, 56, 40, "rain"));
        System.out.println(weatherConditionals.getHikingAdvice(56, 56, 40, "freezing"));
        System.out.println(weatherConditionals.getHikingAdvice(56, 56, 40, "sleet"));
        System.out.println(weatherConditionals.getHikingAdvice(-600, 56, 40, "sunny"));
        System.out.println(weatherConditionals.getHikingAdvice(56, 56, 400, "sunny"));
        System.out.println(weatherConditionals.getHikingAdvice(130, 56, 40, "sunny"));
        System.out.println(weatherConditionals.getHikingAdvice(12, 56, 40, "sunny"));
        System.out.println(weatherConditionals.getHikingAdvice(300, 56, 40, "sunny"));
    }
}
