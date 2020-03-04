package com.example.forbesmillioneres;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonAdapter extends ArrayAdapter<Person> {
    public PersonAdapter(Context context, Person[] mil) {
        super(context, R.layout.milloner, mil);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.milloner, null);
        }
        ((TextView) convertView.findViewById(R.id.name)).setText(person.name);
        ((TextView) convertView.findViewById(R.id.money)).setText(String.valueOf(person.money));

        if (person.country == "United States")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_united_states);
        else if (person.country == "Spain")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_spain);
        else if (person.country == "Mexico")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_mexico);
        else if (person.country == "France")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_france);
        else if (person.country == "China")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_china);
        else if (person.country == "Hong Kong")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_hong_kong);
        else if (person.country == "Brazil")
            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.flag_brazil);

        return convertView;
    }
}
