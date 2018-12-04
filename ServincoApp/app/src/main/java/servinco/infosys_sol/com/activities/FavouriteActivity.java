package servinco.infosys_sol.com.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import servinco.infosys_sol.com.R;
import servinco.infosys_sol.com.commons.FavouritesAdapter;

public class FavouriteActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    RecyclerView recyclerView;
    ArrayList<String> arrayList = new ArrayList<>();
    LinearLayout linearLayout;
    Context mContext;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_favourite);

        initViews();
        setSupportActionBar(toolbar);
        recyclerData();


    }

    private void recyclerData(){
        arrayList.add("Entertainment");
        arrayList.add("Relationship");
        arrayList.add("Cricket");
        arrayList.add("Politics");
        arrayList.add("Tech");
        arrayList.add("Science");
        arrayList.add("LifeStyle");
        arrayList.add("Fashion");
        arrayList.add("Travel");
        arrayList.add("Health");
        arrayList.add("Comedy");
        arrayList.add("Art");
        arrayList.add("News");
        arrayList.add("Fitness");
        arrayList.add("Music");
        arrayList.add("Sports");
        arrayList.add("Football");
        arrayList.add("Hockey");
        arrayList.add("Baseball");
        arrayList.add("Volleyball");
        arrayList.add("Indoor games");
        arrayList.add("Outdoor games");
        arrayList.add("...");
    }

    private void initViews(){
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerView);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new FavouritesAdapter(arrayList,mContext));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_search:{
                Toast.makeText(this, "you click a search bar menu", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return true;
    }


}


