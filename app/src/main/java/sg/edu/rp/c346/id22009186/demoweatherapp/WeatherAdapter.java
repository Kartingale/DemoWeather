package sg.edu.rp.c346.id22009186.demoweatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    Context parent_context;
    int layout_id;
    ArrayList<Weather> al;

    public WeatherAdapter(Context context, int resource, ArrayList<Weather> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        al = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent_context);
        convertView = inflater.inflate(layout_id, parent, false);

        Weather currentWeather = al.get(position);

        TextView headerTextView = convertView.findViewById(R.id.textViewHeader);
        TextView areaTextView = convertView.findViewById(R.id.textViewArea);
        TextView forecastTextView = convertView.findViewById(R.id.textViewForecast);

        headerTextView.setText("WEATHER");
        areaTextView.setText(currentWeather.getArea());
        forecastTextView.setText(currentWeather.getForecast());

        return convertView;
    }
}
