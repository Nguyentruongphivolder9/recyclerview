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

    // data mock : d??? li???u gi???
    public static List<FoodModel> getMock(){
        return new ArrayList<>(Arrays.asList(
                new FoodModel(R.drawable.image_sua_dua_tran_chau_duong_den,
                        2.45f,true,
                        4.5f,
                        25,
                        "S???a D???a Tr??n Ch??u ???????ng ??en",
                        "s???a, d???a, ???????ng ??en"
                ),
                new FoodModel(R.drawable.image_banh_mi_pho,
                        1f,true,
                        4.5f,
                        25,
                        "B??nh M?? Ph???",
                        "b??nh m??, th???t heo"
                ),
                new FoodModel(R.drawable.image_goi_chan_ga,
                        2.5f,true,
                        4.5f,
                        50,
                        "G???i Ch??n G??",
                        "ch??n g??"
                ),
                new FoodModel(R.drawable.image_nam_chua_ran,
                        2f,true,
                        4.5f,
                        50,
                        "Nem Chua R??n",
                        "nem chua"
                ),
                new FoodModel(R.drawable.image_pho_mai_que,
                        1.45f,true,
                        4.5f,
                        50,
                        "Ph?? Mai Que",
                        "ph?? mai"
                ),
                new FoodModel(R.drawable.image_com_chay_gao_tam_nam_gio_kho_to,
                        1.95f,true,
                        4.5f,
                        999,
                        "C??m chay g???o t??m n???m gi?? kho t???",
                        "g???o t??m n???m,gi??"
                ),
                new FoodModel(R.drawable.image_banh_mi_pho,
                        2.56f,true,
                        4.5f,
                        999,
                        "Combo C??m chay g???o l???t + tr?? s??m b?? ??ao",
                        "g???o l???t, tr?? s??m b?? ??ao"
                ),
                new FoodModel(R.drawable.image_banh_chung,
                        2.17f,true,
                        4.5f,
                        999,
                        "B??nh Ch??ng",
                        "n???p, th???t heo, ?????u xanh"
                ),
                new FoodModel(R.drawable.image_bun_bo_hue,
                        1.4f,true,
                        4.5f,
                        999,
                        "B??n B?? Hu???",
                        "b??n, b??, n?????c h???m s????ng b??"
                ),
                new FoodModel(R.drawable.image_pho_tai_gan_bo,
                        3.04f,true,
                        4.5f,
                        999,
                        "Ph??? T??i G??n B??",
                        "ph???, th???t b??"
                )
        )
        );
    }
}
