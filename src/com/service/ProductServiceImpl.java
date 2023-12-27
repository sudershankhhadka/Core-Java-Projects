package com.service;

import com.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
        static List<Product> plist = new ArrayList<>();
    @Override
    public void addProduct(Product prod) {
            plist.add(prod);
        System.out.println("----------Successfully Added--------"+plist.size());


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","admin","Password@123");

            // ----> For adding  ---> sql queries
            String sql = "insert into product (id,name,price,comapny,category) values ('"+prod.getId()+"','"+prod.getName()+"','"+prod.getPrice()+"','"+prod.getComapany()+"','"+prod.getCategory()+"')";

            Statement st = con.createStatement();
            st.execute(sql);
            con.close();
            System.out.println("success");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }

  //  @Override
    public void deleteProduct(int index) {


     //   plist.remove(index);

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the product id to be deleted :");
            int prodID = s.nextInt();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","admin","Password@123");

            // ----> For deleting   ---> sql queries
            String sql = "delete from product where id ="+prodID;
            Statement st = con.createStatement();
            st.execute(sql);
            con.close();
            System.out.println("success");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Product> getAllProducts() {

        return plist;
    }
}
