package com.gmail.sabarov.e.taskoneanagrams;

import java.io.IOException;

import java.util.Scanner;

public class Anagram {
	
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Reverse reverse = new Reverse();
        reverse.reverseOfWordsExpectForSymbols(scanner.nextLine());
    }

}
