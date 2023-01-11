package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));
    }

    public static String hydrate(String drinkString) {
        int res = 0;
        for (char c : drinkString.toCharArray()) {
            if (Character.isDigit(c)) {
                int count = Integer.parseInt(String.valueOf(c));
                res += count;
            }
        }
        return (res > 1) ? res + " glasses of water" : res + " glass of water";
    }
}
