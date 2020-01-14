package com.cts.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI
{
	public static void main(String[] args) 
	{
		List<String> names=new ArrayList<String>();
		addNames(names);
		names.forEach(System.out::println);
		List<String> lengthScale=names.stream().filter(s -> s.length() >=4).collect(Collectors.toList());
		System.out.println("The names which have length more than 3 are :\n");
		lengthScale.forEach(System.out::println);
		//To print the names in uppercase
		List<String> capNames=names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println("The names in uppercase are /n");
		capNames.forEach(System.out::println);
		
	}

	private static void addNames(List<String> names)
	{
		names.add("Anu");
		names.add("Sadika");
		names.add("Appu");
		names.add("Nandu");
		names.add("Cts");
		
	}

}
