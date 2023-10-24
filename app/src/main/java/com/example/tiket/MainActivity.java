package com.example.tiket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textQuiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textQuiet = (TextView)findViewById(R.id.Quiet);
        textQuiet.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.Quiet) {
            Intent moveIntent = new Intent(MainActivity.this, FilmPertama.class);
            startActivity(moveIntent);

            TiketFilm movie= new TiketFilm();
            movie.setName("A Quiet Place");
            movie.setRating(90);
            movie.setTahun("2018");
            movie.setGenre("Horror/Fiksi");
            movie.setPenjelasan("Sebuah keluarga hidup dalam ketakutan, dan harus hidup dalam keheningan agar terhindar dari mahluk misterius.");
            Intent moveWithObjectIntent = new Intent(MainActivity.this, FilmPertama.class);

            moveWithObjectIntent.putExtra(FilmPertama.EXTRA_PERSON, movie);
            startActivity(moveWithObjectIntent);
        }
    }
}