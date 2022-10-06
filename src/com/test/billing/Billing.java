package com.test.billing;

import java.util.ArrayList;
import java.util.Scanner;

public class Billing {
	public static void shopItem()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Shopping Mart!!");
		System.out.println("List of sections available in this mart:");
		System.out.println(" 1.Electronics\n 2.Groceries\n 3.Cloths\n 4.Kitchen");
		int opt = sc.nextInt();
		switch(opt)
		{
		case 1:
		{
			ProductService service = new ProductService();
			ArrayList<Product> test = service.displayElectonics();
			System.out.println("Enter the id of item do u want to purchase :");
			int add = sc.nextInt();
			service.addBill(add);
			System.out.println("Do you want to continue in Electronics press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				service.displayElectonics();
			}
			else
			{
				shopItem();
			}
			break;
		}
		case 2:
		{
			ProductService service = new ProductService();
			ArrayList<Product> test = service.displayGroceries();
			System.out.println("Enter the id of item do u want to purchase :");
			int add = sc.nextInt();
			service.addBill(add);
			System.out.println("Do you want to continue in Groceries press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				service.displayGroceries();
			}
			else
			{
				shopItem();
			}
			break;
		}
		case 3:
		{
			ProductService service = new ProductService();
			ArrayList<Product> test = service.displayCloths();
			System.out.println("Enter the id of item do u want to purchase :");
			int add = sc.nextInt();
			service.addBill(add);
			System.out.println("Do you want to continue in Cloths press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				service.displayCloths();
			}
			else
			{
				shopItem();
			}
			break;
		}
		case 4:
		{
			ProductService service = new ProductService();
			ArrayList<Product> test = service.displayKitchen();
			System.out.println("Enter the id of item do u want to purchase :");
			int add = sc.nextInt();
			service.addBill(add);
			System.out.println("Do you want to continue in Kitchen press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				service.displayKitchen();
			}
			else
			{
				shopItem();
			}
			break;
		}
	}
	
}
	public static void bill() {
		ProductService service = new ProductService();
		
	}
	public static void main(String[] args) {
		Billing.shopItem();
		Billing.bill();
	}
	
}