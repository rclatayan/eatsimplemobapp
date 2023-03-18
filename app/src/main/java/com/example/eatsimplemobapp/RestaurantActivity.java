package com.example.eatsimplemobapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.eatsimplemobapp.adapters.AllRestaurantAdapter;
import com.example.eatsimplemobapp.adapters.ExclusiveAdapter;
import com.example.eatsimplemobapp.adapters.OffersAdapter;
import com.example.eatsimplemobapp.models.AllRestaurantsModels;
import com.example.eatsimplemobapp.models.ExclusiveModels;
import com.example.eatsimplemobapp.models.OffersModels;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends AppCompatActivity {

    RecyclerView recyclerViewOffers;
    List<OffersModels> offersModels;
    OffersAdapter offersAdapter;

    RecyclerView recyclerViewExclusive;
    List<ExclusiveModels> exclusiveModels;
    ExclusiveAdapter exclusiveAdapter;

    RecyclerView recyclerViewAllRestaurant;
    List<AllRestaurantsModels> allRestaurantsModels;
    AllRestaurantAdapter allRestaurantAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        getOffers();
        getAllExclusive();
        getAllRestaurantsData();
    }

    private void getAllExclusive() {
        recyclerViewExclusive = findViewById(R.id.rec_exc);
        recyclerViewExclusive.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewExclusive.setHasFixedSize(true);

        exclusiveModels = new ArrayList<>();
        exclusiveModels.add(new ExclusiveModels(R.drawable.food9));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food6));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food3));
        exclusiveModels.add(new ExclusiveModels(R.drawable.food7));
        exclusiveAdapter = new ExclusiveAdapter(exclusiveModels);
        recyclerViewExclusive.setAdapter(exclusiveAdapter);
    }

    private void getAllRestaurantsData() {
        recyclerViewAllRestaurant = findViewById(R.id.rec_all_res);
        recyclerViewAllRestaurant.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerViewAllRestaurant.setHasFixedSize(true);

        allRestaurantsModels = new ArrayList<>();
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food1));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food2));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food3));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food4));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food5));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food6));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food7));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food8));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food9));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food10));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food11));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food12));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food13));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food14));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food15));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food16));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food17));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food18));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food19));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food20));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food21));
        allRestaurantsModels.add(new AllRestaurantsModels(R.drawable.food22));
        allRestaurantAdapter = new AllRestaurantAdapter(allRestaurantsModels);
        recyclerViewAllRestaurant.setAdapter(allRestaurantAdapter);
    }

    private void getOffers() {

        recyclerViewOffers = findViewById(R.id.rec_offer);
        recyclerViewOffers.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        recyclerViewOffers.setHasFixedSize(true);

        offersModels = new ArrayList<>();
        offersModels.add(new OffersModels(R.drawable.img15));
        offersModels.add(new OffersModels(R.drawable.img16));
        offersModels.add(new OffersModels(R.drawable.img17));
        offersModels.add(new OffersModels(R.drawable.img18));
        offersAdapter = new OffersAdapter(offersModels);
        recyclerViewOffers.setAdapter(offersAdapter);
    }
}