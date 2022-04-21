import phone.Smartphone;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> numbers = Arrays.asList(sc.nextLine().split("\\s+"));
        List<String> urls = Arrays.asList(sc.nextLine().split("\\s+"));
        Smartphone phone = new Smartphone(numbers, urls);

        System.out.println(phone.call());
        System.out.println(phone.browse());
    }
}