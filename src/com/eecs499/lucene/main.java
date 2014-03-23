package com.eecs499.lucene;

import java.io.IOException;

import org.apache.lucene.queryparser.classic.ParseException;

public class main {

    public main() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Indexer fileIndexer = new Indexer();
        fileIndexer.startIndex("file/", "index/", true);
        
        SearchEngine searchEngine = new SearchEngine();
        
        try {
            searchEngine.searchFile("index", "Master", "contents");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
