package phone;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder result = new StringBuilder();
        for (String url : urls) {
            char[] urlChars = url.toCharArray();
            boolean isValidUrl = true;
            for (char urlChar : urlChars) {
                if (Character.isDigit(urlChar)) {
                    isValidUrl = false;
                    break;
                }
            }
            if (isValidUrl) {
                result.append("Browsing: ").append(url).append("!\n");
            } else {
                result.append("Invalid URL!\n");
            }
        }
        return result.toString();
    }

    @Override
    public String call() {
        StringBuilder result = new StringBuilder();

        for (String number : numbers) {
            char[] numberChars = number.toCharArray();
            boolean isValidNumber = true;
            for (char phoneCharacter : numberChars) {

                if (!Character.isDigit(phoneCharacter)) {
                    isValidNumber = false;
                    break;
                }
            }
            if (!isValidNumber) {
                result.append("Invalid number!\n");
            } else {
                result.append("Calling... ").append(number).append("\n");
            }
        }
        return result.toString();
    }
}