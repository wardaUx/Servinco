package com.example.wardauzair.profilescreens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileScreenTwo extends AppCompatActivity {


    private RecyclerView recyclerViewPosts;
    private  PostAdapterDark postAdapter;
    private ArrayList<PostItems> modelArrayList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_screen_two);


        recyclerViewPosts = findViewById(R.id.recyclerViewPosts);
        recyclerViewPosts.setHasFixedSize(true);
        recyclerViewPosts.setLayoutManager(new LinearLayoutManager(this));



        modelArrayList =  new ArrayList<>();

        PostItems modelOne = new PostItems("Good, better, best. Never let it rest. 'Til your good is better and your better is best.\n");
        PostItems modelTwo = new PostItems(" We should not give up and we should not allow the problem to defeat us.\n");
        PostItems modelThree = new PostItems("A creative man is motivated by the desire to achieve, not by the desire to beat others.\n");
        PostItems modelFour = new PostItems("Accept the challenges so that you can feel the exhilaration of victory.\n");
        PostItems modelFive = new PostItems("Start where you are. Use what you have. Do what you can. \n");


        modelArrayList.add(modelOne);
        modelArrayList.add(modelTwo);
        modelArrayList.add(modelThree);
        modelArrayList.add(modelFour);
        modelArrayList.add(modelFive);


        postAdapter = new PostAdapterDark(this,modelArrayList);
        recyclerViewPosts.setAdapter(postAdapter);

    }
}
