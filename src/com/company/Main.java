package com.company;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose locale: \n 1 - English; \n 2 - Belarussian; \n 3 - Russian; \n other - Russian; \n-1 - exit\n");
            int choice = scanner.nextInt();
            String lang = "";
            String country = "";

            switch (choice) {
                case 1:
                    lang = "EN";
                    country = "US";
                    break;

                case 2:
                    lang = "BE";
                    country = "BY";
                    break;

                case 3:
                    lang = "RU";
                    country = "RU";
                    break;
                default:
                    break;

                case -1:
                    return;
            }
            Locale locale = new Locale(lang, country);
            ResourceBundle resourceBundle = ResourceBundle.getBundle("datares.text", locale);
            String str1 = resourceBundle.getString("str1");
            System.out.println(str1);
        }
    }
}