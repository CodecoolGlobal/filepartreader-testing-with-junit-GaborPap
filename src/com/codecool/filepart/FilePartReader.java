package com.codecool.filepart;

import java.io.*;
import java.util.Arrays;
import java.util.List;

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
        if ((toLine < fromLine) || fromLine < 1)
            throw new IllegalArgumentException("Invalid values to from and toline");

        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public String read() throws IOException {
        File file = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(file));

        StringBuilder sb = new StringBuilder();

        String strLine = "";
        while ((strLine = br.readLine()) != null) {

            sb.append(strLine).append("\n");
        }

        return sb.toString().substring(0,sb.length()-1);
    }

    public String readLines() throws IOException{
        int index=0;
        StringBuilder sb = new StringBuilder();
        String str = read();
        List<String> items = Arrays.asList(str.split("\\r?\\n"));

        while ((index<items.size()) && (index<=toLine-1)){
            if (index>=fromLine-1)
                sb.append(items.get(index)).append("\n");
            index++;
        }

        return sb.toString().substring(0,sb.length()-1);
    }
}
