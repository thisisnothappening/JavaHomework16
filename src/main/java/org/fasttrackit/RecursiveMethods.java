package org.fasttrackit;

public class RecursiveMethods {

    public int sumFirstNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + sumFirstNumbers(n - 1);
    }

    public int sumFirstEvenNumbers(int n) {
        if (n % 2 != 0) {
            n--;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        return n + sumFirstEvenNumbers(n - 2);
    }

    public boolean palindrome(String string) {
        if (string.length() == 0 || string.length() == 1) {
            return true;
        }
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return palindrome(string.substring(1, string.length() - 1));
        }
        return false;
    }

    public int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n/10);
    }

    public int fibonacciSeries(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
        }
    }
}
