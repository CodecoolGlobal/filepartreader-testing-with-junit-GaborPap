package com.codecool.filepart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {

    @Test
    void getWordOrderedAlpabetically() {
        FilePartReader fp = new FilePartReader();
        fp.setup("/home/gabor/Codecool/OOP/GIT/filepartreader-testing-with-junit-GaborPap/src/com/codecool/filepart/txtfile.txt",1,2);
        FileWordAnalyzer fz = new FileWordAnalyzer(fp);


        assertEquals("[ala, fourth, furst, görög, second, sixth, third]", fz.getWordOrderedAlpabetically().toString() );
    }

    @Test
    void getWordsContainingSubstring() {
        FilePartReader fp = new FilePartReader();
        fp.setup("/home/gabor/Codecool/OOP/GIT/filepartreader-testing-with-junit-GaborPap/src/com/codecool/filepart/txtfile.txt",1,2);
        FileWordAnalyzer fz = new FileWordAnalyzer(fp);


        assertEquals("[third]", fz.getWordsContainingSubstring("ird").toString() );
        assertEquals("[third, fourth, sixth]", fz.getWordsContainingSubstring("th").toString() );
        assertEquals("[]", fz.getWordsContainingSubstring("valami").toString() );
    }


    @Test
    void getStringWhichPalindromes() {
        FilePartReader fp = new FilePartReader();
        fp.setup("/home/gabor/Codecool/OOP/GIT/filepartreader-testing-with-junit-GaborPap/src/com/codecool/filepart/txtfile.txt",1,2);
        FileWordAnalyzer fz = new FileWordAnalyzer(fp);


        assertEquals("[ala, görög]", fz.getStringWhichPalindromes().toString() );
    }
}