package forLoops;

import java.util.Scanner;
public class ForLoops3
	{

		public static void main(String[] args)
			{
//				oneThroughFive();
//				iLoveMullen();
//				oneThroughFiveHorizontal();
//				countdown();
//				challengeOne();
				challengeTwo();
//				challengeThree();
//				challengeFour();
				
			}
		public static void oneThroughFive()
		{
			for (int i = 1; i < 6; i++)
				{
				System.out.println(i);
				}
		}
		
		public static void iLoveMullen()
		{
			for (int i = 2; i < 12; i = i + 2)
				{
				System.out.println(i + ": I love mullen");
				}
		}
		
		public static void oneThroughFiveHorizontal()
			{
				for (int i = 1; i <= 5; i++)
					{
					System.out.println(i);
					}
			}
		
		public static void countdown()
			{
				for (int i = 10; i >= 1; i--)
					{
					System.out.println(i);
					}
				System.out.println("LIFTOFF");
			}
		
		public static void challengeOne()
			{
				for (int i = 5; i <= 100; i = i + 5)
					{
					System.out.println(i);
					}
			}
		
		public static void challengeTwo()
			{
				System.out.println("whats your top number?");
				Scanner userInput = new Scanner(System.in);
				int TopLimit = userInput.nextInt();
				
				System.out.println("whats your bottom number?");
				Scanner userInput2 = new Scanner(System.in);
				int bottomLimit = userInput2.nextInt();
				
				for (int i = bottomLimit; i < TopLimit + 1; i++)
					{
					System.out.println(i);
					}
			}
		
		
		

	}
