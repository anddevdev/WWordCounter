package com.example.wwordcounter.count;




public class counter {
    public static int getNumber(String phrase) {
        if (phrase != null) {
            return phrase.length();
        }
        return -1;
    }

    public static int getWordNumber(String phrase){
        if (phrase == null)
            return 0;
        return phrase.trim().split("\\s+").length;
    }
    }

