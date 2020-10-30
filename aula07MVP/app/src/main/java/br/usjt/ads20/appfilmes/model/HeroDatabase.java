package br.usjt.ads20.appfilmes.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import br.usjt.ads20.appfilmes.model.HeroContract.HeroEntry;

public class HeroDatabase {
    HeroDbHelper dbHelper;

    public HeroDatabase(Context context) {
        dbHelper = new HeroDbHelper(context);
    }

    public void insertAllHeroes(ArrayList<Hero> heroes) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.delete(HeroContract.HeroEntry.TABLE_NAME, null, null);

        for (Hero heroi : heroes) {
            ContentValues values = new ContentValues();
            values.put(HeroEntry.COLUMN_NAME_ID, heroi.getId());
            values.put(HeroEntry.COLUMN_NAME_NAME, heroi.getTitulo());
            values.put(HeroEntry.COLUMN_NAME_DESCRIPTION, heroi.getDescricao());
            db.insert(HeroEntry.TABLE_NAME, null, values);
        }
        db.close();
    }

    public ArrayList<Hero> loadHeroes() {
        ArrayList<Hero> heroes = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] colunas = {
                HeroEntry.COLUMN_NAME_ID,
                HeroEntry.COLUMN_NAME_NAME,
                HeroEntry.COLUMN_NAME_DESCRIPTION,
        };
        String where = null;
        String[] conditions = null;
        String order = HeroEntry.COLUMN_NAME_NAME;
        Cursor c = db.query(HeroEntry.TABLE_NAME, colunas, where, conditions, order, null, null);

        while (c.moveToNext()) {
            Hero hero = new Hero();
            hero.setId(c.getInt(c.getColumnIndex(HeroEntry.COLUMN_NAME_ID)));
            hero.setTitulo(c.getString(c.getColumnIndex(HeroEntry.COLUMN_NAME_NAME)));
            hero.setDescricao(c.getString(c.getColumnIndex(HeroEntry.COLUMN_NAME_DESCRIPTION)));
            hero.setPosterPath(c.getString(c.getColumnIndex(HeroEntry.COLUMN_NAME_ID)));

            heroes.add(hero);
        }
        c.close();
        db.close();
        return heroes;
    }

}
