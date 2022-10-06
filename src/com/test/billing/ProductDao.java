package com.test.billing;

import java.util.ArrayList;

public interface ProductDao {
	public ArrayList<Product> displayElectonics();
	public ArrayList<Product> displayGroceries();
	public ArrayList<Product> displayCloths();
	public ArrayList<Product> displayKitchen();
	public void addBill(int add);
	public void generateBill();
}
