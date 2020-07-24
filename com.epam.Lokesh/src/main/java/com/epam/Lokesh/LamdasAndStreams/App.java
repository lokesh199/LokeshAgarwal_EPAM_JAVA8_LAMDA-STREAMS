package com.epam.Lokesh.LamdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static double averageOfIntegers(ArrayList<Integer> numbers, int arraySize) {
		int sumOfIntegers = 0;
		for (int i = 0; i < arraySize; i++) {
			sumOfIntegers += numbers.get(i);
		}
		return sumOfIntegers / arraySize;
	}

	public static List<String> findPalindromicStrings(List<String> listOfStrings, int listSize) {
		List<String> palindromicStrings = new ArrayList<String>();
		StringOperations operations = new StringOperations();
		palindromicStrings = operations.returnPalindromes(listOfStrings);
		return palindromicStrings;
	}

	public static List<String> separateStringsStartingWithASize3(List<String> listOfStrings, int listSize) {
		List<String> requiredList = new ArrayList<String>();
		StringOperations operations = new StringOperations();
		requiredList = operations.stringsWithASize3(listOfStrings);
		return requiredList;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Enter the number of Integers: ");
		int arraySize = sc.nextInt();
		System.out.println("Enter " + arraySize + " integers: ");
		for (int i = 0; i < arraySize; i++) {
			int value = sc.nextInt();
			numbers.add(value);
		}
		double average = averageOfIntegers(numbers, arraySize);
		System.out.println("average of the given integers is: " + average);

		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("hey");
		listOfStrings.add("what is this?");
		listOfStrings.add("ant");
		listOfStrings.add("all");
		listOfStrings.add("abc");
		listOfStrings.add("wow");
		listOfStrings.add("great");
		List<String> requiredStrings = separateStringsStartingWithASize3(listOfStrings, listOfStrings.size());

		System.out.println("Strings starting with 'a' and length 3 are: \n");
		for (String str : requiredStrings) {
			System.out.println(str);
		}

		List<String> anotherListOfStrings = new ArrayList<String>();
		anotherListOfStrings.add("bob");
		anotherListOfStrings.add("infinite possibilities");
		anotherListOfStrings.add("racecar");
		anotherListOfStrings.add("madam");
		anotherListOfStrings.add("magic");
		anotherListOfStrings.add("aliens");
		anotherListOfStrings.add("abcdcba");

		List<String> palindromicStrings = findPalindromicStrings(anotherListOfStrings, anotherListOfStrings.size());

		System.out.println("Palindromic Strings are: ");
		for (String str : palindromicStrings) {
			System.out.println(str);
		}

	}
}
