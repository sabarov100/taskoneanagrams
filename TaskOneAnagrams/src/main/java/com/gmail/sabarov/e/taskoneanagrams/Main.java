package main.java.com.gmail.sabarov.e.taskoneanagrams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Reverse reverse = new Reverse();
        reverse.reverseOfWordsExpectForSymbols(scanner.nextLine());
    
        
        LongColumnDivisioner longColumnDivisioner = new LongColumnDivisioner();
        System.out.println(longColumnDivisioner.longColumnDivision(405022500, 0));

    }

}
