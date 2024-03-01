package dev.lpa;

import java.util.Date;

class date {
    public static void main(String[] args) {
        Date date = new Date();
        String message = "Hello, world!";
        System.out.printf("%1$tD %1$tT : %2$s%n", date, message);
    }
}
