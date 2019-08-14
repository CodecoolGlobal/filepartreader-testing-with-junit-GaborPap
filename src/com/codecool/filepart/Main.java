package com.codecool.filepart;

public class Main {
    public static void main(String args[]){
        FilePartReader fp = new FilePartReader();
        FileWordAnalyzer fz = new FileWordAnalyzer(fp);
        fp.setup("/home/gabor/Codecool/OOP/GIT/filepartreader-testing-with-junit-GaborPap/src/com/codecool/filepart/txtfile.txt",1,2);
        try {
            System.out.println(fp.read());
            System.out.println(fz.getWordOrderedAlpabetically());
            System.out.println(fp.readLines());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
