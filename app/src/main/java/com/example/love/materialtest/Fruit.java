package com.example.love.materialtest;

public class Fruit {
    private String fruitname;
    private int imageId;
    public Fruit(String name, int imageId){
        this.fruitname = name;
        this.imageId = imageId;
    }
    public String getName(){
        return fruitname;
    }
    public int getImageTd(){
        return  imageId;
    }
}
