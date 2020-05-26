package com.practice;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringSplitMultipleDelimiter {
	public static void main(String[] args) {
	    String[] split = "1,2|3.4$5".split("[|,.$]");
	    System.out.println(Arrays.toString(split));
	    System.out.println(Arrays.deepToString(Pattern.compile("[|,.$]").splitAsStream("1,2|3.4$5").toArray()));
	    Pattern.compile("[|,.$]").splitAsStream("1,2|3.4$5").forEach(s->System.out.println(s));
	    System.out.println(Pattern.compile("[|,.$]").splitAsStream("1,2|3.4$5").collect(Collectors.toList()));
	}
}
