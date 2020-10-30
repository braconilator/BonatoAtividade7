package br.usjt.ads20.appfilmes.presenter;

import android.content.Context;

import java.util.ArrayList;

import br.usjt.ads20.appfilmes.model.Hero;
import br.usjt.ads20.appfilmes.model.HeroDatabase;
import br.usjt.ads20.appfilmes.view.MainView;

public class MainPresenter implements Presenter {

    MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public ArrayList<Hero> LoadHeroesFromDB(Context context) {
        HeroDatabase db = new HeroDatabase(context);
        return db.loadHeroes();
    }

    public void InsertHeroes(ArrayList<Hero> heroes, Context context) {
        HeroDatabase database = new HeroDatabase(context);
        database.insertAllHeroes(heroes);
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }
}
