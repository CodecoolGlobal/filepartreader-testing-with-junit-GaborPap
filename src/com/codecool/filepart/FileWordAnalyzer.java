package com.codecool.filepart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileWordAnalyzer {
    private FilePartReader filePartReader;


    public FileWordAnalyzer(FilePartReader filePartReader) {
        this.filePartReader = filePartReader;
    }

    public List getWordOrderedAlpabetically(){
        try {
            String str = filePartReader.read();
            List<String> items = Arrays.asList(str.split("\\r?\\n"));
            Collections.sort(items);
            return items;

        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public List getWordsContainingSubstring(String subString){

        try {
            String str = filePartReader.read();
            List<String> items = Arrays.asList(str.split("\\r?\\n"));
            List<String> contiainItems = new ArrayList<>();
            for (String string : items){
                if (string.contains(subString))
                    contiainItems.add(string);
            }
            return contiainItems;


        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }



    public List getStringWhichPalindromes(){
        try {
            String str = filePartReader.read();
            List<String> items = Arrays.asList(str.split("\\r?\\n"));
            List<String> contiainItems = new ArrayList<>();
            for (String string : items){
                if (string.equals(new StringBuilder(string).reverse().toString()))
                    contiainItems.add(string);
            }
            return contiainItems;


        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
