package com;
import java.util.Scanner;
public class masterlogic {

	
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) throws Exception
		{
			System.out.println("\t\t\tWELCOME TO  LOGIC MASTER\n\t\t\t************************************");
			System.out.println("1.NUMBER PROGRAMMING\n2.PATTERN PROGRAMMING\n3.GAME\n4.FOOD ORDER");

			int number=sc.nextInt();
			boolean exit=true;
				

	do{

			switch(number)
			{
				

				
	      case 1:{
			  System.out.println("\t\tWelcome to Number Programming\n\t\t*************************");
			  System.out.println("1.Prime Number\n2.Binary to Decimal \n3.Decimal to Binary\n4.Palindrom Number\n5.Table\n6.Strong Number\n7.Amstrong Number\n8.Factorial\n9.Perfect Number");
			 int option=sc.nextInt();
			 boolean exit1=true;
				 do
				 {
	                  switch(option)

			  {


				 case 1:
					
				 
				  {
					  
					  System.out.println(" number  divide only 1 and itself");
					 System.out.println("please enter one number");
			int num=sc.nextInt();
			String res="PRIME NUMBER";

			if(num==0 || num==1)
			{
				res="NOT PRIME OR COMPOSITE NUMBER";
			}
			else  {
				for(int i=2; i<num; i++)
				{
					if(num%2==0)
						res="COMPOSITE NUMBER";
					break;
	              }
			}


			System.out.println(res);

				 
					 
					 break;}//prime 



				 case 2:{

					 System.out.println(" number contains as a bit number " );
					 System.out.println("ENTER ANY BINARU NUMBER");
			int num=sc.nextInt();
			int sum=0,power=1;

			while(num>0)
			{
				sum+=num%10*power;
	              num/=10;
				  power*=2;

			}
			System.out.println(sum);

					 
					 
					 
					 break;}//btd


				 case 3:{
					        System.out.println("ENTER DECIMAL NUMBER");
			int num =sc.nextInt();
			int sum=0,power=1;	

			while(num>0)
			{
				sum+=num%2*power;

				num/=2;
				power*=10;
			}
			System.out.println(sum);


					 
					 break;}//dtb


				 case 4:{System.out.println("number and reverse number are same");
					     System.out.println("ENTER THE NUMBER");
			int num=sc.nextInt();
	         int rev=0;
			 int temp=num;

			while(num>0)
			{
				rev=(rev*10)+(num%10);
				num/=10;

			}
			String res=(temp==rev)?"palindrom":"not palindrom";
			System.out.println(res);
					 
					 break;}//palindrom


			     case 5:{
					 System.out.println("table printed");
					     System.out.println("ENTER THE LOWER VALUE");
			int low=sc.nextInt();

			System.out.println("ENTER HIGHER VALUE");
			int high=sc.nextInt();


	        for(int i=low; i<=high; i++)
			{
				for(int j=1; j<=5; j++)
				{
					Thread.sleep(100);
				    System.out.println(i+"*"+j +"="+( i*j)  );

				}
				System.out.println("**********");
				
			}
					 break;}//table
			     case 6:{
					 
					 System.out.println("123= 1!+2!+3!=same number");     
			System.out.println("ENTER ANY NUMBER");
			int num=sc.nextInt();
	        int fact=1,sum=0;
			int temp=num;


			while(num>0)
			{
				for(int i=num%10; i>=2;i--)

				{
					fact*=i;
				}
			sum+=fact;
			num/=10;
			fact=1;

	       }

		   String res=(sum==temp)?"strong number":"this is not strong number";
		   System.out.println(res);

					 break;}//strong

			     case 7:{
					       System.out.println(" 123 is 3 digit number then 1^3+ 2^3+3^3= same number");
			System.out.println("ENTER ANY NUMBER");    //123
			int num=sc.nextInt();

			int count=0;
			int temp=num;
			int sum=0;
			int product=1;

	        while(num>0)
			{
				num/=10;
				count++;
	         }
	       num=temp;
	  
		   for(int i=num; i>0;i=i/10)   
			{
			   int last=i%10;
				for(int j=1; j<=count; j++)
				{
				   product*=last;
				   
				}
				sum+=product;
				 product=1;
			}

	String res=(sum==temp)?"amstrong":"not amstrong";
			System.out.println(res);
					 
					 break;}//amstrong
			     case 8:{
					 System.out.println("factorial 5!=   5*4*3*2");
					     System.out.println("ENTER THE NUMBER");
			int num=sc.nextInt();
			int fact=1;

			for(int i=num; i>=1; i--)
			{
				fact=i*fact;
			}
			System.out.println(fact);
					 break;}//factorial

				 case 9:
				          	 
				 {
					 System.out.println(" 12 == divisible except 12 ==>all divisible number add=same number");
					 System.out.println("ENTER THE NUMBER");
			int num=sc.nextInt();
			int sum=0;

			for(int i=1; i<num;i++)
			{
				if(num%i==0)
				{
					sum+=i;
					
		        }
		   }

	String res=(num==sum)?"perfect number":"not perfect number";
					System.out.println(res);

					   
					 break;}//perfect
						  
						  
			    default:{
					exit1=false;
					System.out.println("Redirecting The Home Page");
					break;}



			  }

				 }//do
				 while(exit1);
				
			  
			  
			  break;}//number









		  case 2:{


			  System.out.println("WELCOME TO PATTERN MATCHING");
			   System.out.println("1.Triangle\n2.Square and Diagonal \n3.Name");

			   
			   int op=sc.nextInt();

			   
				   switch(op)
				   {
					
					case 1:{

							int n=5;
		

		for(int i=0;i<n;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(i>=j)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print("  ");


				for(int j=0;j<5;j++)
				{
					if(i<=j)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print("  ");

				for(int j=0;j<5;j++)
				{
					if(i+j<=n-1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print("  ");

				for(int j=0;j<5;j++)
				{
					if(i+j<=n-1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
	                System.out.print("       ");






				for(int j=0;j<n;j++)
				{
					if(i+j<=n-1 && i<=j)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print("");

				for(int j=0;j<n;j++)
				{
					if(i<=j && i+j>=n-1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print("  ");

				for(int j=0;j<n;j++)
				{
					if(i>=j && i+j>=n-1)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.print("  ");

				for(int j=0;j<n;j++)
				{
					if(i+j<=n-1 && i>=j)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				
	    System.out.println();
			}
						
						
						break;}//tri
					case 2:{
						
						int n=5;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(true)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("  ");


			  for(int j=0;j<n;j++)
				{
					if(i<=n/2)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("  ");
			  for(int j=0;j<n;j++)
				{
					if(i>=n/2)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("  ");
			  for(int j=0;j<n;j++)
				{
					if(j<=n/2)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("");
			  for(int j=0;j<n;j++)
				{
					if(j>=n/2)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("  ");



			for(int j=0;j<n;j++)
				{
					if(i==0 || i==n-1 ||j==0 ||j==n-1)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("  ");

			  for(int j=0;j<n;j++)
				{
					if(i+j==n+1)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("  ");



			  for(int j=0;j<n;j++)
				{
					if(i+j==n-3)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("  ");


			  for(int j=0;j<n;j++)
				{
					if(i==j-3)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          System.out.print("  ");

			  for(int j=0;j<n;j++)
				{
					if(i==j+3)
						System.out.print("* ");
					else
						System.out.print("  ");

				}

	          

	System.out.println();



			}
						
						
						
						break;}//squa
					case 3:{

						int n=7;

			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					if( j==0 ||i==0|| i==n/2 ||(i==j && i>=n/2)|| j==n-1  && i<=n/2)
						System.out.print("* ");
						else
						System.out.print("  ");
					

				}
				System.out.print("  ");

				for(int j=0; j<n; j++)
				{
					if(j==n/2)
						System.out.print("* ");
						else
						System.out.print("  ");
					

				}
				System.out.print("  ");


	for(int j=0; j<n; j++)
				{
					if((i==j && j<=n/2)|| (j>=n/2 && i+j==n-1) || (j==n/2 && i>=n/2))
						System.out.print("* ");
						else
						System.out.print("  ");
					

				}
				System.out.print("  ");


	for(int j=0; j<n; j++)
				{
					if(j==0 ||i==0 || j==n-1 ||i==n/2)
						System.out.print("* ");
						else
						System.out.print("  ");
					

				}
				System.out.println();



			}
			

						
						
						
						
						break;}//name




					default: {
						
						
						break;}



				   }
	            



			   
			   
			  
			   System.out.println(" Redirecting the Homepage..........");
			    Thread.sleep(1000);












			  break;}






		  case 3:{
			  System.out.println("Welcome to Game");

	                     boolean value=true;
			System.out.println("Lets start a game.I assume a number 1 to 50 and you will tell me");
				int sys_num=(int)(Math.random()*50);
				System.out.println("Thinking.......");
				Thread.sleep(2000);
				System.out.println("tell what number i assume");

			do{
				
				int input=sc.nextInt();
	    
	                if(input>sys_num)
				{
					System.out.println("it is high value");
				}
				else if (input<sys_num)
				{
					System.out.println("it is low number");
				}

				else if(input==sys_num)
				{
					System.out.println("congratulation you guessed it right ");



					System.out.println("1.play again\n2.exit");
					int key=sc.nextInt();
					if (key==2)
					{
						value=false;
						System.out.println("thank you for playing");
					}

						sys_num=(int)(Math.random()*50);
				}
					
				
						

					
				}



			
			while(value);


			  break;}//game


		  case 4:{
			  System.out.println("Welcome to Swiggy");

	                   System.out.println("\t\tSelect the Hotel Name\n\t_______________________");
			System.out.println("1.BUHARI\n2.AMINIA\n3.A2B");
			 int value=sc.nextInt();
			
			 
			 
			 switch(value)
			{
				case 1:  { 
					    System.out.println("WELCOME TO BUHARI");
				       System.out.println("MENU\n_________________________");
				       System.out.println("1.chicken biriyani\n2.mutton biriyani\n3.spring roll");
						      int key=sc.nextInt();

							  switch(key)
					{
								  case 1:{
									  System.out.println("chicken biriyani price is 180");
									  double price=180;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+ ""+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("Enter your Bill Amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your OTP is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("Please Enter your OTP");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wrong otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please CHECK your Bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  break;}//chicken bir

								  case 2:{ System.out.println("mutton biriyani price is 380");
									  double price=380;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//mutton biriyani
								  case 3: { System.out.println("spring roll price is 90");
									  double price=180;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//spring roll
								  default:{
									  System.out.println("invalid");
									  break;}//invalid
						
					}//key

						
						
			break;
				}//buhari




				case 2: {System.out.println("WELCOMW TO AMINIA");
				
				       System.out.println("MENU\n_________________________");
				       System.out.println("1.momo\n2.chowmein\n3.chicken65");
						      int key=sc.nextInt();

							  switch(key)
					{
								  case 1:{
									  System.out.println("momo plate is 120");
									  double price=120;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  break;}//chicken bir

								  case 2:{ System.out.println("chowmein price is 80");
									  double price=80;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//mutton biriyani
								  case 3: { System.out.println("chicken65 price is 120");
									  double price=120;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//spring roll
								  default:{
									  System.out.println("invalid");
									  break;}//invalid
						
					}
				break;	
				}//aminia

				case 3: {System.out.println("WELCOME TO A2B");
				
				       System.out.println("MENU\n_________________________");
				       System.out.println("1.poori\n2.samosa\n3.milkshake");
						      int key=sc.nextInt();

							  switch(key)
					{
								  case 1:{
									  System.out.println("poori price is 60");
									  double price=60;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  break;}//chicken bir

								  case 2:{ System.out.println("samosa price is 20");
									  double price=20;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//mutton biriyani
								  case 3: { System.out.println("milkshake price is 170");
									  double price=170;
									  System.out.println("enter your quantity");
									  int qnt=sc.nextInt();

									  double total=price*qnt;

									  System.out.println("your total price is"+total);

									  System.out.println("select payment mode");
									  System.out.println("1.phone pay\n2.google pay");
									  int pay=sc.nextInt();
	                                       switch(pay)
									  {
											   case 1:{
												   System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }


													   
												   break;}//phone pay

											   case 2:{ System.out.println("processing.....");
													   Thread.sleep(2000);

	                                                   
												   System.out.println("enter your bill amount");
												   int bill=sc.nextInt();
												   if(bill==total)
												   {
													
												 int sys=(int)(Math.random()*9999+9999);
												   System.out.println("your otp is");
												   
												   System.out.println("waiting.....");
												   
												   System.out.println(sys);

												  
												   System.out.println("please enter your otp");
												   int user=sc.nextInt();

												   if(user==sys)
													   {
														
												   System.out.println("PLACED YOUR ORDER");
												   
												   System.out.println("your order delivery within 30 min");
													   }
												   else{
													  System.out.println("wront otp.");
												        }
												   
												   }
	                                                   else{
													 System.out.println("please check your bill");
												           }
												   
												   break;}//google pay
											   default: {
												   System.out.println("invalid");
												   break;}//invalid
										
									  }//pay

									  
									  break;}//spring roll
								  default:{
									  System.out.println("invalid");
									  break;}//invalid
						
					}
				break;	
				}//a2b

				default: {System.out.println("PLEASE CHECK YOUR OPTION AGAIN");
				break;	
				}

	             
				 
				  
				  
				  
				  
				  
				  
				  
				  
				  
				 } //hotel end
				  
			





			  break;}//food

		  
		  
		  
		  
		  
		       default : { 
				   
				   exit=false;
				   System.out.println("THANK YOU FOR USING LOGIC MASTER");
				   break;}//exit


		 
		  



			}//main Switch

	}while(exit);



		}//final
	}


