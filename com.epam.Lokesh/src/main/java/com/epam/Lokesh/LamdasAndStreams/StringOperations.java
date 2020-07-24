package com.epam.Lokesh.LamdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperations {

	public boolean hasAOfSize3(String str) {
		if (str.charAt(0) == 'a' && str.length() == 3) {
			return true;
		}
		return false;
	}

	public List<String> stringsWithASize3(List<String> listOfStrings) {
		Stream<String> streamObject = listOfStrings.stream();
		List<String> requiredList = streamObject.filter(string -> hasAOfSize3(string)).collect(Collectors.toList());
		return requiredList;
	}

	public boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public List<String> returnPalindromes(List<String> listOfStrings) {
		Stream<String> streamObject = listOfStrings.stream();
		List<String> listOfPalindromes = streamObject.filter(str -> isPalindrome(str)).collect(Collectors.toList());

		return listOfPalindromes;
	}
}
