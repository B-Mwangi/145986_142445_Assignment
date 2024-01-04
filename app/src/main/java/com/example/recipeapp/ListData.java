package com.example.recipeapp;

public class ListData {
    String name;
    String difficulty;
    int time;
    String ingredients;
    int desc;
    int image;

    public ListData(String name, String difficulty, int time, String ingredients, int desc, int image) {
        this.name = name;
        this.difficulty = difficulty;
        this.time = time;
        this.ingredients = ingredients;
        this.desc = desc;
        this.image = image;
    }
}
