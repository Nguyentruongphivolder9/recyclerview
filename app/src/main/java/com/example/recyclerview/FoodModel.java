package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FoodModel {
    private int image;
    private float prise;
    private boolean isFavorite;
    private float rating;
    private int totalUserVotes;
    private String name;
    private String mainIngredient;

    // data mock : dữ liệu giả
    public static List<FoodModel> getMock(){
        return new ArrayList<>(
                new FoodModel(R.drawable.)
        );
    }
}
