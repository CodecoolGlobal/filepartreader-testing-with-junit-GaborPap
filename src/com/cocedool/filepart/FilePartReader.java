package com.cocedool.filepart;

public class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    FilePartReader() {
        this.filePath = "";
        this.fromLine = -1;
        this.toLine = -1;
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) {
        if ((toLine<fromLine) || fromLine<1) throw new IllegalArgumentException("Invalid values to from and toline");

        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public String read(){
        return null;
    }

    public String readLines(){
        return null;
    }
}
