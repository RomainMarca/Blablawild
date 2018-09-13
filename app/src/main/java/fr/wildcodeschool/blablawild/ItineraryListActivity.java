package fr.wildcodeschool.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static fr.wildcodeschool.blablawild.ItinerarrySearchActivity.EXTRA_DEPART;
import static fr.wildcodeschool.blablawild.ItinerarrySearchActivity.EXTRA_NAME;

public class ItineraryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_list);

        Intent intentSearchAct = getIntent();
        String editDepart = intentSearchAct.getStringExtra(EXTRA_DEPART);
        String editName = intentSearchAct.getStringExtra(EXTRA_NAME);

        setTitle(editDepart+" >> "+editName);
    }
}
