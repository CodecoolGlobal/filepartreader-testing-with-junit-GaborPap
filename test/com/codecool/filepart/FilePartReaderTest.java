package com.codecool.filepart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    @Test
    void setup() {

    }

    @Test
    void read() {

        FilePartReader fp = new FilePartReader();
        fp.setup("/home/gabor/Codecool/OOP/GIT/filepartreader-testing-with-junit-GaborPap/src/com/codecool/filepart/txtfile.txt",1,2);
        String str = "";
        try{
            str = fp.read();
        }catch (Exception e){

        }
        assertEquals("furst\nsecond\nthird\nfourth\nala\nsixth\ngörög",str);
    }

    @Test
    void readLines() {
        FilePartReader fp = new FilePartReader();
        fp.setup("/home/gabor/Codecool/OOP/GIT/filepartreader-testing-with-junit-GaborPap/src/com/codecool/filepart/txtfile.txt",1,2);
        String str = "";
        try{
            str = fp.readLines();
        }catch (Exception e){

        }
        assertEquals("furst\nsecond",str);

        fp.setup("/home/gabor/Codecool/OOP/GIT/filepartreader-testing-with-junit-GaborPap/src/com/codecool/filepart/txtfile.txt",1,1);
        str = "";
        try{
            str = fp.readLines();
        }catch (Exception e){

        }
        assertEquals("furst",str);
    }
}