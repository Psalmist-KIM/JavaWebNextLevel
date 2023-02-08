package chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {
        if(isBlank(text)) {
            return 0;
        }

        return sum(toInts(split(text)));
    }

    public boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }
    public String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if(m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }
        return text.split(",|:");
    }

    public int sum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int[] toInts(String[] strNumbers) {
        int[] numbers = new int[strNumbers.length];
        for(int i = 0; i < numbers.length; ++i) {
            numbers[i] = toPositive(strNumbers[i]);
        }
        return numbers;
    }

    public int toPositive(String strNumber) {
        int number = Integer.parseInt(strNumber);
        if(number < 0) {
            throw new RuntimeException();
        }
        return number;
    }
}
