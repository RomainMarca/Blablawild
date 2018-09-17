package fr.wildcodeschool.blablawild;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

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


        final Calendar myCalendar = Calendar.getInstance();

        final EditText edittext= (EditText) findViewById(R.id.Birthday);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel(edittext, myCalendar);
            }

        };

        edittext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(ItinerarrySearchActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

    }

    private void updateLabel(EditText edittext, Calendar myCalendar) {
        String myFormat = getString(R.string.dateDMY); //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        edittext.setText(sdf.format(myCalendar.getTime()));
    }

}





