package com.example.my_horizontalrecycleview;

public class MainModel {
    Integer categorieLogo;
    String  categorieName;

    public MainModel(Integer categorieLogo,String categorieName) {
        this.categorieLogo = categorieLogo;
        this.categorieName = categorieName;
    }

    public Integer getCategorieLogo() {
        return categorieLogo;
    }

    public String getCategorieName() {
        return categorieName;
    }
}
