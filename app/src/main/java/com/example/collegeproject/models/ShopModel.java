package com.example.collegeproject.models;

public class ShopModel {

    int pic;
    String text, price;
    String description;

    public ShopModel(int pic, String text,String price,  String description) {
        this.pic = pic;
        this.text = text;
        this.price = price;
        this.description = description;
    }

    public int getPic() {

        return pic;
    }

    public void setPic(int pic) {

        this.pic = pic;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }
    public String getPrice() {

        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
