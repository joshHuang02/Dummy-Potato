/**
 * This class gives weather advice
 *
 * @author Josh Huang
 * @version 9/26/2019
 */
public class weatherConditionals
{
    public static String getWeatherAdvice(int temp, String description) {
        boolean windy = false;
        String advice = "Temp: " + temp + " Description: " + description + "\n";
        if (description.indexOf("windy") >= 0) {
            windy = true;
        }
        if (temp > 100 && description.indexOf("snow") >= 0) {
            advice += "The climate is screwed!\nAnyways its safe to go outside, " + temp + " degrees and " + description + ".";
        } else if (temp <= 30 || windy == true) {
            advice += "Too windy or cold! Enjoy watching the weather through the window.";
        } else {
            advice += "Its safe to go outside, " + temp + " degrees and " + description + ".";
        }
        return advice + "\n";
    }

    public static String getHikingAdvice(int temp, int windchill, int humidity, String description) {
        String advice = "";
        if (temp < -459) {
            temp = -459;
        }
        if (windchill < -459) {
            windchill = -459;
        }
        if (humidity < 0) {
            humidity = 0;
        } else if (humidity > 100) {
            humidity = 100;
        }
        if (temp > 30 && windchill < 30) {
            advice = "Aha you thought it's " + temp + " degrees out and it is ok to hike but windchill is actually " + windchill + " degrees! So just don't go hiking today";
        } else if (description.indexOf("snow") >= 0 || description.indexOf("rain") >= 0 || description.indexOf("freezing") >= 0 || description.indexOf("showers") >= 0 || description.indexOf("hail") >= 0 || description.indexOf("sleet") >= 0) {
            advice = description + " is too wack to go hiking!";
        } else if (humidity < 30 || humidity > 50) {
            advice = humidity + " percent humidity is not good, don't go hiking";
        } else if (temp < 30 || temp > 110) {
            advice = temp + " degrees is too extreme for hiking";
        } else {
            advice = "Weather looks good for hiking";
        }
        if (temp > 200) {
            advice += "\nBy the way is your location on fire?!";
        } else if (temp > 100 && description.indexOf("sunny") >= 0) {
            advice += "\nSpicy weather huh?";
        }
        return "Temp: " + temp + " Windchill: " + windchill + " Humidity: " + humidity + " Description: " + description + "\n" + advice + "\n";
    }
}