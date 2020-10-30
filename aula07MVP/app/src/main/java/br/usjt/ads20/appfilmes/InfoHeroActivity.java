package br.usjt.ads20.appfilmes;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import br.usjt.ads20.appfilmes.model.Hero;

public class InfoHeroActivity extends AppCompatActivity {
    private TextView titulo;
    private TextView descricao;
    private Hero hero;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_hero);
        Intent intent = getIntent();

        hero = (Hero) intent.getSerializableExtra(ListHeroesActivity.DESCRICAO);

        titulo = findViewById(R.id.titulo);

        descricao = findViewById(R.id.descricao);

        titulo.setText(hero.getTitulo());

        descricao.setText(hero.getDescricao());

        imageView = findViewById(R.id.imageView);

        descricao.setText(hero.getDescricao());

        setImageCharacter setImageCharacter = new setImageCharacter();
        setImageCharacter.execute(hero.getPosterPath());
        Log.d("posterpath", hero.getPosterPath());
    }

    private class setImageCharacter extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... urlS) {
            try {
                URL url = new URL(urlS[0]);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                InputStream inputStream = connection.getInputStream();
                Bitmap imageCharacter = BitmapFactory.decodeStream(inputStream);

                return imageCharacter;

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(Bitmap characterView) {
            imageView.setImageBitmap(characterView);
        }
    }
}