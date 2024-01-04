package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recipeapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());

        int[] imageList = {R.drawable.img_1, R.drawable.img, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4, R.drawable.img_5, R.drawable.img_6};
        int[] ingredientList = {R.string.pastaIngredients, R.string.noodlesIngredients,R.string.cakeIngredients,R.string.pancakeIngredients,R.string.pizzaIngredients, R.string.burgerIngredients, R.string.friesIngredients};
        int[] descList = {R.string.pastaDesc, R.string.noodleseDesc, R.string.cakeDesc,R.string.pancakeDesc,R.string.pizzaDesc, R.string.burgerDesc, R.string.friesDesc};
        String[] nameList = {"Pasta", "Noodles", "Cake", "Pancake", "Pizza","Burgers", "Fries"};
        String[] timeList = {"30 mins", "2 mins", "45 mins","10 mins", "60 mins", "45 mins", "30 mins"};
        String[] difficultylist = {"easy","medium","hard","easy","medium","hard","hard"};

        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], timeList[i], ingredientList[i], difficultylist[i], descList[i], imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new ListAdapter(MainActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, RecipeCardActivity.class);
                intent.putExtra("name", nameList[i]);
                intent.putExtra("time", timeList[i]);
                intent.putExtra("time", difficultylist[i]);
                intent.putExtra("ingredients", ingredientList[i]);
                intent.putExtra("desc", descList[i]);
                intent.putExtra("image", imageList[i]);
                startActivity(intent);
            }
        });
    }
}