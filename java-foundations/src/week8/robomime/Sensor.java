package week8.robomime;

public class Sensor {

    public String decryptTricks(String message) {
        if (message.contains("!")) {
            message = removeExclamationMark(message);
        } else if (message.contains("&")) {
            message = removeAndPlusReverse(message);
        } else if (message.contains("#")) {
            message = removeHashtag(message);
        } else if (message.trim().contains("week8/robomime")) ;
        message = removeRobomime(message);
        return message;
    }

    private String removeExclamationMark(String message) {
        message = message.replaceAll("!", "");
        return message;
    }

    private String removeAndPlusReverse(String message) {
        message = message.replaceAll("&", "");
        message = new StringBuffer(message).reverse().toString();
        return message;
    }

    private String removeHashtag(String message) {
        message = message.replaceAll("#", "");
        return message;

    }

    private String removeRobomime(String message) {
        message = message.replaceAll("robomime", "");
        return message;
    }
}