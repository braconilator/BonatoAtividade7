package br.usjt.ads20.appfilmes.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.usjt.ads20.appfilmes.model.HeroContract.HeroEntry;

public class HeroDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Heroes.db";
    public static final String SQL_CREATE_HERO =
            "CREATE TABLE " + HeroEntry.TABLE_NAME + " ( " +
                    HeroEntry._ID + " INTEGER PRIMARY KEY," +
                    HeroEntry.COLUMN_NAME_ID + " INTEGER," +
                    HeroEntry.COLUMN_NAME_NAME + " TEXT," +
                    HeroEntry.COLUMN_NAME_DESCRIPTION + " TEXT)";

    public static final String SQL_DROP_HERO =
            "DROP TABLE IF EXISTS " + HeroEntry.TABLE_NAME;

    public HeroDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_HERO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_HERO);
        db.execSQL(SQL_CREATE_HERO);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
        onUpgrade(db, newVersion, oldVersion);
    }
}
