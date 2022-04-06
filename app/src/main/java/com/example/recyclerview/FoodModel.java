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

    public FoodModel(int image, float prise, boolean isFavorite, float rating, int totalUserVotes, String name, String mainIngredient) {
        this.image = image;
        this.prise = prise;
        this.isFavorite = isFavorite;
        this.rating = rating;
        this.totalUserVotes = totalUserVotes;
        this.name = name;
        this.mainIngredient = mainIngredient;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public float getPrise() {
        return prise;
    }

    public void setPrise(float prise) {
        this.prise = prise;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getTotalUserVotes() {
        return totalUserVotes;
    }

    public void setTotalUserVotes(int totalUserVotes) {
        this.totalUserVotes = totalUserVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String toString() {
        return "FoodModel{" +
                "image=" + image +
                ", prise=" + prise +
                ", isFavorite=" + isFavorite +
                ", rating=" + rating +
                ", totalUserVotes=" + totalUserVotes +
                ", name='" + name + '\'' +
                ", mainIngredient='" + mainIngredient + '\'' +
                '}';
    }

    // data mock : dữ liệu giả
    public static List<FoodModel> getMock(){
        return new ArrayList<>(Arrays.asList(
                new FoodModel(R.drawable.image_sua_dua_tran_chau_duong_den,
                        2.45f,true,
                        4.5f,
                        25,
                        "Sữa Dừa Trân Châu Đường Đen",
                        "sữa, dừa, đường đen"
                ),
                new FoodModel(R.drawable.image_banh_mi_pho,
                        1f,true,
                        4.5f,
                        25,
                        "Bánh Mì Phố",
                        "bánh mì, thịt heo"
                ),
                new FoodModel(R.drawable.image_goi_chan_ga,
                        2.5f,true,
                        4.5f,
                        50,
                        "Gỏi Chân Gà",
                        "chân gà"
                ),
                new FoodModel(R.drawable.image_nam_chua_ran,
                        2f,true,
                        4.5f,
                        50,
                        "Nem Chua Rán",
                        "nem chua"
                ),
                new FoodModel(R.drawable.image_pho_mai_que,
                        1.45f,true,
                        4.5f,
                        50,
                        "Phô Mai Que",
                        "phô mai"
                ),
                new FoodModel(R.drawable.image_com_chay_gao_tam_nam_gio_kho_to,
                        1.95f,true,
                        4.5f,
                        999,
                        "Cơm chay gạo tám nấm giò kho tộ",
                        "gạo tám nấm,giò"
                ),
                new FoodModel(R.drawable.image_banh_mi_pho,
                        2.56f,true,
                        4.5f,
                        999,
                        "Combo Cơm chay gạo lứt + trà sâm bí đao",
                        "gạo lứt, trà sâm bí đao"
                ),
                new FoodModel(R.drawable.image_banh_chung,
                        2.17f,true,
                        4.5f,
                        999,
                        "Bánh Chưng",
                        "nếp, thịt heo, đậu xanh"
                ),
                new FoodModel(R.drawable.image_bun_bo_hue,
                        1.4f,true,
                        4.5f,
                        999,
                        "Bún Bò Huế",
                        "bún, bò, nước hầm sương bò"
                ),
                new FoodModel(R.drawable.image_pho_tai_gan_bo,
                        3.04f,true,
                        4.5f,
                        999,
                        "Phở Tái Gân Bò",
                        "phở, thịt bò"
                )
        )
        );
    }
}
