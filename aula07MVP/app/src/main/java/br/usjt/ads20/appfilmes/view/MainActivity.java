package br.usjt.ads20.appfilmes.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.ads20.appfilmes.ListHeroesActivity;
import br.usjt.ads20.appfilmes.R;
import br.usjt.ads20.appfilmes.model.Hero;
import br.usjt.ads20.appfilmes.model.HeroNetwork;
import br.usjt.ads20.appfilmes.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {
    MainPresenter presenter = new MainPresenter(this);
    private EditText txtNome;
    private ProgressBar progressBar;
    public static final String NOME = "br.usjt.ads20.appfilmes.nome";

    public static final String HEROES = "br.usjt.ads20.appfilmes.herois";

    private String url = "https://gateway.marvel.com/v1/public/characters?ts=1601573778451&apikey=db1c3deff5b31a36ddce2ff3ca75da38&hash=209226e69ba26e2777c62415ef41b1ed";
    private Context context;

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        presenter.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = (EditText) findViewById(R.id.busca_fila);
        progressBar = findViewById(R.id.progressBar3);
        context = this;
        presenter.onCreate();
    }

    public void searchHeroes(View view) {
        progressBar.setVisibility(View.VISIBLE);
        if (HeroNetwork.isConnected(this)) {
            new DownloadJsonHeroes().execute(url);
        } else {
            new LoadHeroesFromDB().execute();
        }
    }

    private class DownloadJsonHeroes extends AsyncTask<String, Void, ArrayList<Hero>> {
        @Override
        protected ArrayList<Hero> doInBackground(String... strings) {
            ArrayList<Hero> heroes = new ArrayList<>();

            try {
                progressBar.setVisibility(View.VISIBLE);
                heroes = HeroNetwork.buscarHerois(strings[0]);
                presenter.InsertHeroes(heroes, context);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return heroes;
        }

        @Override
        protected void onPostExecute(ArrayList<Hero> heroes) {
            progressBar.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(context, ListHeroesActivity.class);
            String nome = txtNome.getText().toString();
            intent.putExtra(NOME, nome);
            intent.putExtra(HEROES, heroes);
            startActivity(intent);
        }
    }

    @SuppressLint("StaticFieldLeak")
    private class LoadHeroesFromDB extends AsyncTask<String, Void, ArrayList<Hero>> {

        @Override
        protected ArrayList<Hero> doInBackground(String... strings) {
            progressBar.setVisibility(View.VISIBLE);
            ArrayList<Hero> heroes = presenter.LoadHeroesFromDB(context);
            return heroes;
        }

        @Override
        protected void onPostExecute(ArrayList<Hero> heroes) {
            progressBar.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(context, ListHeroesActivity.class);
            String nome = txtNome.getText().toString();
            intent.putExtra(NOME, nome);
            intent.putExtra(HEROES, heroes);
            startActivity(intent);
        }
    }
}