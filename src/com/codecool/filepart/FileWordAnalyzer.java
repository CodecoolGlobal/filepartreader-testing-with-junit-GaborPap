package com.codecool.filepart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FileWordAnalyzer {
    private FilePartReader filePartReader;


    public FileWordAnalyzer(FilePartReader filePartReader) {
        this.filePartReader = filePartReader;
    }

    public List getWordOrderedAlpabetically() {
        try {
            String str = filePartReader.read();
            List<String> items = Arrays.asList(str.split("\\r?\\n"));
            Collections.sort(items);
            return items;

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List getWordsContainingSubstring(String subString) {

        try {
            String str = filePartReader.read();
            List<String> items = Arrays.asList(str.split("\\r?\\n"));
            return items.stream().filter(s -> s.contains(subString)).collect(Collectors.toList());


        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }


    public List getStringWhichPalindromes() {
        try {
            String str = filePartReader.read();
            List<String> items = Arrays.asList(str.split("\\r?\\n"));
            return items.stream().filter(s -> new StringBuilder(s).reverse().toString().equals(s)).collect(Collectors.toList());


        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
