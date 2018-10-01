package fr.wildcodeschool.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


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


        ListView listTrip = findViewById(R.id.list_list);
        ArrayList<TripModel> results = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-kk:mm");

        try {
            results.add(new TripModel(getString(R.string.eric), getString(R.string.cartman), sdf.parse("21/02/2017-15:30"), 15));
            results.add(new TripModel(getString(R.string.stan), getString(R.string.marsh), sdf.parse("21/02/2017-16:00"), 20));
            results.add(new TripModel(getString(R.string.kenny), getString(R.string.broflovski), sdf.parse("21/02/2017-16:30"), 16));
            results.add(new TripModel(getString(R.string.kyle), getString(R.string.mccornick), sdf.parse("21/02/2017-17:00"), 40));
            results.add(new TripModel(getString(R.string.wendy), getString(R.string.testaburger), sdf.parse("21/02/2017-17:30"), 20));
        } catch (ParseException e) {
        }
        TripAdapter adapter = new TripAdapter(this, results);
        listTrip.setAdapter(adapter);

        // du code déjà existant peut être contenu après cette ligne !
    }

}
