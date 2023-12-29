package com.view;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        add();
//        getAll();
        delete();
//        getAll();    //after deleting
    }

    static void add(){
        ProductService s = new ProductServiceImpl();
        char flag ;
        Scanner sc = new Scanner(System.in);
        do {
            Product p = new Product();
            System.out.println("Enter id");
            p.setId(sc.nextInt());


            System.out.println("Enter name:");
            p.setName(sc.next());

            System.out.println("Enter category:");
            p.setCategory(sc.next());

            System.out.println("Enter comapany");
            p.setComapany(sc.next());

            System.out.println("Enter price:");
            p.setPrice(sc.nextInt());

            s.addProduct(p);

            System.out.println("Do you want to add more? [y/n]");
            flag = sc.next().charAt(0);
        }
        while(flag == 'y');
    }
    //get all products

//    static void getAll(){
//        ProductService ps = new ProductServiceImpl();
//        List<Product> plist = ps.getAllProducts();
//        System.out.println(plist);
//    }

   // delete products

    static void delete(){
        ProductService ps = new ProductServiceImpl();
       ps.deleteProduct(2);
    }
}
