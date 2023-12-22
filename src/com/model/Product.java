package com.model;

public class Product {
    private int id;
    private String name;
    private String comapany;
    private int price;
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComapany() {
        return comapany;
    }

    public void setComapany(String comapany) {
        this.comapany = comapany;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return " \n Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comapany='" + comapany + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
