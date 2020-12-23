package com.company;

import java.io.*;
import java.util.Random;

public class MakeName {
String first;
String last;
    public MakeName() {
        Random rand = new Random();
        this.first = first(rand);
        this.last = last(rand);
        try {
            FileWriter writer = new FileWriter("/Users/alexdudin/IdeaProjects/gmailbot/src/com/company/account name");
            writer.write(first+" "+last);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String first(Random rand){
        String first = "";
        File dictionary = new File("/Users/alexdudin/IdeaProjects/gmailbot/src/com/company/names");
        try (FileReader reader = new FileReader(dictionary);
             BufferedReader read = new BufferedReader(reader)) {
            for (int i = 0; i <=rand.nextInt(5191);i++) {
                first = read.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return first;
    }
    private String last(Random rand){
        String last = "";
        File dictionary = new File("/Users/alexdudin/IdeaProjects/gmailbot/src/com/company/last");
        try (FileReader reader = new FileReader(dictionary);
             BufferedReader read = new BufferedReader(reader)) {
            for (int i = 0; i <=rand.nextInt(1000);i++) {
                last = read.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
}
