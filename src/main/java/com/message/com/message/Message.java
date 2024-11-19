package com.message.com.message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Message {

    public static void main(String[] args) {
        System.out.println(ifContains("1", "051984"));

    }

    public static boolean ifContains(String quantity, String combination) {
        int count = Integer.parseInt(quantity);
        if (count==0) return false;

        for (int i = 0; i <= combination.length() - count; i++) {
            for (int j = i + 1; j <= combination.length() - count; j++) {
                String str1 = combination.substring(i, i + count);
                String str2 = combination.substring(j, j + count);
                if (str1.equals(str2)) {
                    return true;
                }
            }
        }
        return false;

    }
}
