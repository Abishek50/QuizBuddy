package com.example.quizapp;

public class DifficultyModal {
    //initialize variables
    int img;
    String title, description;
    //Constructor call
    public DifficultyModal(int img, String title, String description){
        this.img=img;
        this.title=title;
        this.description=description;
    }

    //getter setter methods
    public int getImg(){
        return img;
    }
    public void setImg(int i){
        img=i;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String str){
        title=str;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String str){
        description=str;
    }
}
