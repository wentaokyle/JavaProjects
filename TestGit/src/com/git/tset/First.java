package com.git.tset;

/**
 * 
 * @author wen
 *
 */
public class First 
{
	/**
	 * 
	 * @param str
	 */
	public static void say(String str)
	{
		System.out.println(str);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		say("say YES !");
		outputStr();
	}


	public static void outputStr(){
		for(int i=0; i<10; i++){
			System.out.println("i=" + i);
		}
	}
}
