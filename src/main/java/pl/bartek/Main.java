package pl.bartek;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSquared(16));
    }

    public static double getBiggerDouble(double a, double b) {
        return a == b ? 0 : (a > b ? a : b);
    }

    public static int sumAndMultiply(int a, int b, int c) {
        return (a + b) * c;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int sumWithCondition(int a, int b) {
        return (a >= 13 && a <= 19 || b >= 13 && b <= 19) ? 19 : (a + b);
    }

    public static String stringZAndY(String str) {
        return str.startsWith("z")
                ?
                (str.endsWith("y")
                        ? "zzyy"
                        : "zzz")
                :
                (str.endsWith("y")
                        ? "yyy"
                        : str);
    }

    public static boolean containsBad(String str) {
        return str.substring(0, 5).contains("bad");
    }

    public static int countChar(String str, char ch) {
        return (int) str.chars()
                .filter(character -> character == ch)
                .count();
    }

    public static int getFactorial(int x) {
        return IntStream.rangeClosed(1, x)
                .reduce((y, z) -> y * z)
                .orElse(0);
    }

    public static boolean unitsGreaterThanTens(int x) {
        return x < 10 || (x / 10 > x % 10);
    }

    public static float power(float number, int exponent) {
//        return (int) Math.pow(number,exponent);
//        return IntStream.rangeClosed(1,exponent)
//                .map(x -> number)
//                .reduce((x,y) -> x * y)
//                .orElse(1);
        float result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= (int) number;
        }
        for (int i = 0; i > exponent; i--) {
            result /= number;
        }
        return result;
    }

    public static boolean isSquared(int x) {
        return Math.sqrt(x) % 1 == 0;
    }

}