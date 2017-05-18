package com.mani.gayi.arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * @author : Mani
 * 
 * Problem :
 * Given a string, find the first non-repeating character in it. 
 * For example, if the input string is “GeeksforGeeks”, 
 * then output should be ‘f’ and if input string is “GeeksQuiz”, then output should be ‘G’.
 * */

public class FirstNonRepeatingCharacter {
	
	
	private static class Result 
	{
		int index;
		int count;
		
		public Result(int index,int count)
		{
			this.index=index;
			this.count = count;
		}
	}
	
	public static Result findFirstNonRepeatingCharacter(String input)
	{
		Result returnValue = null;
		
		char[] data = input.toCharArray();
		
		Map<Character,Result> m = new HashMap<>();
		
		for(int index=0;index<data.length;index++)
		{
			if(!m.containsKey(data[index]))
			{
				m.put(data[index], new Result(index,1));
			}
			else
			{
				Result value = m.get(data[index]);
				value.index++;
				m.put(data[index], value);
			}
		}
		
		for(char c :m.keySet())
		{
			Result result = m.get(c);
			if(result.count == 1)
			{	
				returnValue = result;
				System.out.println("First Non Repeating Character : "+c+" found at index "+result.index);
				break;
			}
		}
		
		return returnValue;
	}
	
	public static void main(String[] args) {
		
		findFirstNonRepeatingCharacter("GeeksGeek");
		
	}

}
