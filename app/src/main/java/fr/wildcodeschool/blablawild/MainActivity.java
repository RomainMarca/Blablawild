package fr.wildcodeschool.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChangeAct = findViewById(R.id.btn_changeact);
        btnChangeAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToItSearch = new Intent(MainActivity.this, ItinerarrySearchActivity.class);
                MainActivity.this.startActivity(goToItSearch);
            }
        });
    }
}