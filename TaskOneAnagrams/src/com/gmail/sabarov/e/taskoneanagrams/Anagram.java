package com.gmail.sabarov.e.taskoneanagrams;

import java.io.IOException;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println(Reverse.reverseOfWordsExpectForSymbols(scanner.nextLine()));
       
	}

}
