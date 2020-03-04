package com.example.forbesmillioneres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonAdapter adapter = new PersonAdapter(this, createPerson());
        ListView lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(adapter);
    }

    Person[] createPerson(){
        Person[] mil = new Person[10];
        String[] nameArr = {"Bill Gates", "Warren Buffet", "Jeff Bezos","Amancio Ortega", "Mark Zuckerberg", "Carlos Slim Helu","Larry Ellison","Charles Koch","David Koch","Michael Bloomberg","Bernard Arnault","Larry Page","Sergey Brin","Liliane Bettencourt","S. Robson Walton","Jim Walton","Alice Walton","Wang Jianlin","Li Ka-shing","Sheldon Adelson","Steve Ballmer","Jorge Paulo Lemann","Jack Ma"};
        String[] moneyArr = {"$86 B","$75.6 B","$72.8 B","$31.3 B","$31.2 B","$30.4 B","$30 B","$29.2 B","$28.3 B", "$31.2 B","$30.4 B","$30 B","$29.2 B","$28.3 B","$31.2 B","$30.4 B","$30 B","$29.2 B","$28.3 B"};
        String[] countryArr={"United States","United States","United States","Spain","United States","Mexico","United States","United States","United States","United States","France","United States","United States","France","United States","United States","United States","China","Hong Kong","United States","United States","Brazil","China"};
        for (int i = 0; i < mil.length; i++) {
            Person person = new Person();
            person.name = nameArr[i];
            person.country = countryArr[i];
            person.money = moneyArr[i];
            mil[i] = person;
        }
        return mil;
    }
}
