package com.example.wardauzair.profilescreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ProfileScreenActivity extends AppCompatActivity {


    private ArrayList<PostItemsLight> modelArrayList ;
    private PostAdapterLight postAdapterLight;
    RecyclerView recyclerViewPostsLight;
    Button btnFollow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        recyclerViewPostsLight = findViewById(R.id.recyclerViewPostsLight);
        btnFollow = findViewById(R.id.btnFollow);

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileScreenActivity.this, ProfileScreenTwo.class));
            }
        });


        recyclerViewPostsLight = findViewById(R.id.recyclerViewPostsLight);
        recyclerViewPostsLight.setHasFixedSize(true);
        recyclerViewPostsLight.setLayoutManager(new LinearLayoutManager(this));



        modelArrayList =  new ArrayList<>();

        PostItemsLight modelOne = new PostItemsLight("Good, better, best. Never let it rest. 'Til your good is better and your better is best.\n");
        PostItemsLight modelTwo = new PostItemsLight(" We should not give up and we should not allow the problem to defeat us.\n");
        PostItemsLight modelThree = new PostItemsLight("A creative man is motivated by the desire to achieve, not by the desire to beat others.\n");
        PostItemsLight modelFour = new PostItemsLight("Accept the challenges so that you can feel the exhilaration of victory.\n");
        PostItemsLight modelFive = new PostItemsLight("Start where you are. Use what you have. Do what you can. \n");


        modelArrayList.add(modelOne);
        modelArrayList.add(modelTwo);
        modelArrayList.add(modelThree);
        modelArrayList.add(modelFour);
        modelArrayList.add(modelFive);


        postAdapterLight = new PostAdapterLight(this, modelArrayList);
        recyclerViewPostsLight.setAdapter(postAdapterLight);
    }
}
