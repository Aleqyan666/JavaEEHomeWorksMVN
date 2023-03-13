package org.javaEEhomeworks.classProblems;

import java.util.Arrays;

public class ClassProblems {
    void makeUppercase(String line) {
        String result = line.toUpperCase();
        System.out.println(result);
    }

    void revertWordsOrder(String line) {

        for (int i = 0; i < line.length(); i++) {

        }
    }

    void numberOfWords(String line) {
        int count = 0;
        char empty = '\u001F';
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == empty && i != chars.length - 1) {
                count++;
            }
        }
        System.out.println("number of words " + count);
    }


    void mixTwoStrings(String first, String second) {
        char fin = '\u001F' ;
        char[] array1 = first.toCharArray();
        char[] array2 = second.toCharArray();
        if (array1.length > array2.length) {
            for (int i = 0; i < array1.length; i++) {
                fin += (array1[i] + array2[i]);
            }
        }else if (array1.length < array2.length){
            for (int i = 0; i < array2.length; i++){
                if (i <= array1.length){
                    fin += array1[i] + array2[i];
                }else{
                    fin += array2[i];
                }
            }
        }else{
            for (int i = 0; i < array2.length; i++){
                if (i <= array2.length) {
                    fin += array1[i] + array2[i];
                }else{
                    fin += array1[i];
                }
            }
        }
    }

    static void  compressedString(String a){
        StringBuilder SB = new StringBuilder();
        int count = 1;
        char chars = a.charAt(0);
        for (int i = 1; i < a.length(); i++) {
            if (i == a.length()-1){
                if (chars == a.charAt(i)){
                    count++;
                }
                SB.append(chars);
                SB.append(count);
            } else if (chars == a.charAt(i)){
                count++;
            } else {
                SB.append(chars);
                SB.append(count);
                chars = a.charAt(i);
                count = 1;
            }
        }
        System.out.println(String.valueOf(SB));
    }
   static void compressString(String line) {
       char[] array = line.toCharArray();
       char temp = array[0];
       StringBuilder SB = new StringBuilder();
       int count = 0;
       for (int i = 0; i < array.length; i++) {

               if (array[i] == temp) {
                   count++;
                   if (i == (array.length - 1)) {
//                       for (int j = 0; j < array.length; j++) {}
                       SB = SB.append(temp).append(count);
                       count = 0;

                   }
           }
       }
       System.out.println(SB.toString());
   }


     void SortCharactersDescending(String line){
        char [] array = line.toCharArray();
        Arrays.sort(array);
        StringBuilder SB = new StringBuilder();
        for (int j = array.length-1 ; j >= 0  ;j--){
            SB.append(array[j]);
        }
        System.out.println(array);
    }

    public static void main(String[] args) {
        compressedString("kdwkkkkdwdwkkk");
        compressString("kdwkkkkdwdwkkk");


    }


}
