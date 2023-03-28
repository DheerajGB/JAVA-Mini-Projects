package com.javaproj;

import java.util.*;

class Bot
{
	public static void main(String...args)
	{
		 
	 while(true)
	   {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("User: ");
		  String User=sc.nextLine();
		 
		  
		   if(User.equals("Hi") || User.equals("Hello") || User.equals("hi"))
		   {
			   System.out.println("Bot: " +"Hello");
		   }
		   else if(User.equals("Who are you?") || User.equals("who are you?") || User.equals("who are you"))
		   {
			   System.out.println("Bot: " +"I am a Bot");
		   }
		   else if(User.equals("How are you?") || User.equals("how are you?") || User.equals("how are you"))
		   {
			   System.out.println("Bot: " +"I am Fine, Thankyou!");
		   }
		   else if(User.equals("EXIT") || User.equals("Exit") || User.equals("exit"))
		   {
			   System.exit(0);
		   }   
		   else
		   {
			   System.out.println("Sorry! I didn't understand that");
		   }
	   }
}	
}

