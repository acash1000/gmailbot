package com.company;

import java.util.Random;

public class email {
    String email;
    String first;
    String last;
    public email(String first, String last){
        this.first  = first;
        this.last = last;
        this. email = makeEmail();
    }

    public String getEmail() {
        return email;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    private String makeEmail(){
        Random ran = new Random();
        StringBuilder foo = new StringBuilder();
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(first.charAt(0));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(Integer.toString(ran.nextInt(9)));
        foo.append(last.charAt(0));
        return foo.toString();

    }

}
