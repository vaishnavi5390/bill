package com.test.billing;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.concept.ConnectionFactory;

public class ProductService implements ProductDao
{
	public ArrayList<Product> displayElectonics() {
		ArrayList<Product> list = new ArrayList<Product>();
		try
        {
            Connection con = ConnectionFactory.getConnection();
            Statement statement = con.createStatement();
            ResultSet set = statement.executeQuery("select * from `product_info`.`electronics`");
            while(set.next())
            {
            	System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3)+" "+set.getDouble(4));
            }
        }
            catch (Exception e)
            {
                System.out.println(e);
            }
    		return list;
	}

	public ArrayList<Product> displayGroceries() {
		ArrayList<Product> list = new ArrayList<Product>();
		try
        {
            Connection con = ConnectionFactory.getConnection();
            Statement statement = con.createStatement();
            ResultSet set = statement.executeQuery("select * from groceries");
            while(set.next())
            {
            	System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3)+" "+set.getDouble(4));
            }
        }
            catch (Exception e)
            {
                System.out.println(e);
            }
    		return list;
	}

	public ArrayList<Product> displayCloths() {
		ArrayList<Product> list = new ArrayList<Product>();
		try
        {
            Connection con = ConnectionFactory.getConnection();
            Statement statement = con.createStatement();
            ResultSet set = statement.executeQuery("select * from cloths");
            while(set.next())
            {
            	System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3)+" "+set.getDouble(4));
            }
        }
            catch (Exception e)
            {
                System.out.println(e);
            }
    		return list;
	}

	public ArrayList<Product> displayKitchen() {
		ArrayList<Product> list = new ArrayList<Product>();
		try
        {
            Connection con = ConnectionFactory.getConnection();
            Statement statement = con.createStatement();
            ResultSet set = statement.executeQuery("select * from kitchen");
            while(set.next())
            {
            	System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3)+" "+set.getDouble(4));
            }
        }
            catch (Exception e)
            {
                System.out.println(e);
            }
    		return list;
	}

	public void addBill(int add) {
		try
        {    
            Connection con=ConnectionFactory.getConnection();
            Statement statement=con.createStatement();
            //statement.executeUpdate("insert  into bill(`id`) values('"+add.getId()+"')");
        }    
        catch (Exception e)
        {
            System.out.println(e);
        }
	}
	public void generateBill() {
		try
        {    
            Connection con=ConnectionFactory.getConnection();
            Statement statement=con.createStatement();
            ResultSet set = statement.executeQuery("select sum(price) from `bill`");
        }    
        catch (Exception e)
        {
            System.out.println(e);
        }
	}

}
