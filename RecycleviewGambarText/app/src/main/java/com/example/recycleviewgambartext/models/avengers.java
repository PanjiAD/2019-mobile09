package com.example.recycleviewgambartext.models;

import android.graphics.drawable.Drawable;

public class avengers {
    public String name;
    public Drawable symbol;

    public avengers(String name, Drawable symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getSymbol() {
        return symbol;
    }

    public void setSymbol(Drawable symbol) {
        this.symbol = symbol;
    }
}
