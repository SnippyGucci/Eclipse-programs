package practice;

import java.util.*;

public class throwaway {

	public static void main(String[] args) {
		String w1 = "Hello world";
		String w2 = "i hate everything";
		
		String str1 = w1.substring(0,2);
		String str2 = w2.substring(w2.length() - 1);
		String result = str2 + "nah" + str1;
		System.out.println(str1 + "\n" + str2 + "\n" + result + "\n" + result.indexOf(str2));
		
		System.out.println(str1.toLowerCase().compareTo(str2));
		
		int score = 85;
		//if (80 <= score <= 90)
			System.out.println("hello");
		
		double check = (double) 25/100;
		System.out.println(check);
		
		System.out.println(100/400);
		
		int[] array = new int[5];
		array[0] = 5;
		
		System.out.println(array.length);
		
		ArrayList<Integer> arrays = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		arrays.add(2, 7);
		arrays.set(2, 8);
		arrays.remove(2);
		System.out.println(arrays);
		System.out.println(arrays.size());
		
		boolean abc = (10<5);
		System.out.println(abc);
		
		System.out.println();
		
		System.out.println(false&&false);
		
		System.out.println(5+5/2*3.0-1);
		
		String bob = "hello world";
		
		System.out.println(bob.indexOf("world"));
		
		bob += " earth";
		System.out.println(bob);
		
		System.out.println("gee" == "geE");
		System.out.println();
		
		System.out.println((double) (12+7+4)/3);
		
		int pos = 5;
		pos -= 2;
		
		System.out.println(pos);
		
		System.out.println((int) (Math.random()*9) +1);
		
		System.out.println(5 == 5.00);
		
	}

}
