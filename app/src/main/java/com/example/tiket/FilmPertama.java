package com.example.tiket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.widget.TextView;

public class FilmPertama extends AppCompatActivity {

    public static String EXTRA_PERSON = "extra_person";
    private TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_pertama);

        tvObject = (TextView)findViewById(R.id.tv_object_received);
        TiketFilm movie = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = ""+movie.getRating()+
                "\n"+movie.getTahun() +
                "\n"+movie.getGenre() +
                "\n"+movie.getPenjelasan();
        tvObject.setText(text);
    }
}