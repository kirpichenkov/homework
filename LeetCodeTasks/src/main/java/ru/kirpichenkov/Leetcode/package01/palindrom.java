package ru.kirpichenkov.Leetcode.package01;
/*
Учитывая целое число x, верните true если x палиндром, и false в любом другом случае .
 */

public class palindrom {

    public static boolean isPalindrom(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }

        int left = 1, right = 1;
        while (x / left > 9) {
            left *= 10;
        }

        while (left != 0) {
            if (x / left % 10 != x / right % 10) {
                return false;
            }
            left /= 10;
            right *= 10;
        }
        return true;
    }
}



