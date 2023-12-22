package com.service;

import com.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
        static List<Product> plist = new ArrayList<>();
    @Override
    public void addProduct(Product prod) {
            plist.add(prod);
        System.out.println("----------Successfully Added--------"+plist.size());
    }

    @Override
    public void deleteProduct(int index) {
        plist.remove(index);
    }

    @Override
    public List<Product> getAllProducts() {

        return plist;
    }
}
