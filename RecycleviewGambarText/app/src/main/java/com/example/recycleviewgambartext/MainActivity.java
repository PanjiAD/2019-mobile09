package com.example.recycleviewgambartext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import com.example.recycleviewgambartext.adapters.avangersAdapter;
import com.example.recycleviewgambartext.models.avengers;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvAvangers;

    List<avengers> listAvangers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvAvangers = findViewById(R.id.rvAvangers);
        avengers avengersHero = new avengers("Thor", this.getResources().getDrawable(R.drawable.thor));
        listAvangers.add(avengersHero);

        avengersHero = new avengers("Captain America", this.getResources().getDrawable(R.drawable.captain));
        listAvangers.add(avengersHero);

        avengersHero = new avengers("Iron Man", this.getResources().getDrawable(R.drawable.iron_man));
        listAvangers.add(avengersHero);

        avengersHero = new avengers("Hawkeye", this.getResources().getDrawable(R.drawable.hawkeye));
        listAvangers.add(avengersHero);

        avengersHero = new avengers("Black Widow", this.getResources().getDrawable(R.drawable.black_widow));
        listAvangers.add(avengersHero);

        avengersHero = new avengers("Hulk", this.getResources().getDrawable(R.drawable.hulk));
        listAvangers.add(avengersHero);

        avangersAdapter avangersAdapter = new avangersAdapter(listAvangers);

        rvAvangers.setAdapter(avangersAdapter);
//        rvAvangers.setLayoutManager(new LinearLayoutManager(this));
//        rvAvangers.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvAvangers.setLayoutManager(new GridLayoutManager(this, 2));

    }
}
