package com.bankDomain;

import java.util.Scanner;

class BankAccount
{
	int balance;
	int previousTrans;
	String custName;
	String custId;
	
	BankAccount(String cname,String cid)
	{
		custName =cname;
		custId = cid;
	}


	void deposite (int amount)
	{
		if (amount !=0 )
		{
			balance = balance + amount;
			previousTrans = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if (amount !=0 )
		{
			balance = balance - amount;
			previousTrans = amount;
		}
	}
	
	void getPreviousTrans()
	{
		if(previousTrans > 0)
		{
			System.out.println("Deposited: "+previousTrans);
		}
		else if(previousTrans < 0)
		{
			System.out.println("withdraw: "+Math.abs(previousTrans));
		}
		else
		{
			System.out.println("No Transction Occured");
		}
	}
		
 void showMenu()
 {
		
			char option= '\0';
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Welcome: "+custName);
			System.out.println("Your ID is "+custId);
			System.out.println("\n");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Previous Transaction");
			System.out.println("E: Exit");
			
			do
			{
				System.out.println("Enter Option");
				option = scanner.next().charAt(0);
				System.out.println("/n");
				
				switch(option)
				{
				
				case 'A':
					System.out.println("-----------------------------");
					System.out.println("Balance= "+balance);
					System.out.println("-----------------------------");
					System.out.println("/n");
					break;
					
				case 'B':
					System.out.println("-----------------------------");
					System.out.println("Enter the amount to Deposit");
					System.out.println("-----------------------------");
					int amount = scanner.nextInt();
					deposite(amount);
					System.out.println("/n");
					break;
					
				case 'C':
					System.out.println("-----------------------------");
					System.out.println("Enter the amount to Withdraw");
					System.out.println("-----------------------------");
					int amount2 = scanner.nextInt();
					withdraw(amount2);
					System.out.println("/n");
					break;
					
				case 'D':
					System.out.println("-----------------------------");
					getPreviousTrans();
					System.out.println("-----------------------------");
					System.out.println("/n");
					break;
					
				case 'E':
					System.out.println("****** END******");
					break;
					
				default:
					System.out.println("Invalid Option..Try Again");
					break;
				}
				
				}
			while (option != 'E');
			System.out.println("Thank You for using service");
		
				
		}
	}
		
