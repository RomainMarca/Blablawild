package fr.wildcodeschool.blablawild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import fr.wildcodeschool.blablawild.MainActivity;
import fr.wildcodeschool.blablawild.R;



public class TripAdapter extends ArrayAdapter {

    public TripAdapter(Context context, ArrayList<TripModel> trips) {
        super(context, 0, trips);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // Get the data item for this position
        TripModel trip = (TripModel) getItem(position);
       // Check if an existing view is being reused, otherwise inflate the view
       if (convertView == null) {
          convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_trip, parent, false);
       }
       // Lookup view for data population
       TextView textFirstname = (TextView) convertView.findViewById(R.id.text_firstname);
       TextView textLastname = (TextView) convertView.findViewById(R.id.text_lastname);
       TextView textDate = (TextView) convertView.findViewById(R.id.text_date);
       TextView textPrice = (TextView) convertView.findViewById(R.id.text_price);

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd-kk:mm");


        // Populate the data into the template view using the data object
       textFirstname.setText(trip.getDriverfirstname());
       textLastname.setText(trip.getDriverLastname());
       textDate.setText(fmt.format(trip.getDate()));
       textPrice.setText(String.valueOf(trip.getPrice()));
       // Return the completed view to render on screen
       return convertView;
    }
}
