package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //step 1b: creating a ListView variable
    ListView lvMovie;
    //step 2a: creating an arraylist variable
    ArrayList<String> alMovieList;
    //step 3a: creating an arrayadapter variable
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step 1c: bind the listview ui element to the java variable
        lvMovie = findViewById(R.id.ListViewMovie);
        //step 2b : initialise the arraylist
        alMovieList = new ArrayList<>();

        //step 2c: add data into ArrayList
        alMovieList.add("Avengers Infinity War  Release Date: 2018.04");
        alMovieList.add("Justice League  Released Date: 2017.11");

        //step 3b: Initialise the ArrayAdapter and bind it to the ArrayList
        aaMovie = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alMovieList);

        //step 4: bind ListView to ArrayAdapter
        lvMovie.setAdapter(aaMovie);
    }
}
