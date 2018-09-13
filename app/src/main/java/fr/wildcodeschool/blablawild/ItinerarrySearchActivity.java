package fr.wildcodeschool.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ItinerarrySearchActivity extends AppCompatActivity {

    public static String EXTRA_DEPART = "EXTRA_DEPART";
    public static String EXTRA_NAME = "EXTRA_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerarry_search);


        TextView textDepart = findViewById(R.id.edit_departure);
        TextView textDesti = findViewById(R.id.text_destination);
        TextView textDate = findViewById(R.id.text_date);
        EditText editDate = findViewById(R.id.edit_date);
        Button btnSearch = findViewById(R.id.button_search);



        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editDepart = findViewById(R.id.edit_departure);
                EditText editName = findViewById(R.id.edit_name);
                String editDepartValue = editDepart.getText().toString();
                String editNameValue = editName.getText().toString();

                if (editDepartValue.isEmpty() || editNameValue.isEmpty()) {
                    Toast.makeText(ItinerarrySearchActivity.this, R.string.departure_and_name_is_empty, Toast.LENGTH_SHORT).show();

                } else {

                            Intent goToItlist = new Intent(ItinerarrySearchActivity.this, ItineraryListActivity.class);
                            goToItlist.putExtra(EXTRA_DEPART, editDepartValue);
                            goToItlist.putExtra(EXTRA_NAME, editNameValue);
                            ItinerarrySearchActivity.this.startActivity(goToItlist);
                        }
                }

        });
    }
}





