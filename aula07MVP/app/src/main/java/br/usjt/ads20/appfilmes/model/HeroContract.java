package br.usjt.ads20.appfilmes.model;

import android.provider.BaseColumns;

public class HeroContract {
    public static abstract class HeroEntry implements BaseColumns {
        public static final String TABLE_NAME = "hero";
        public static final String COLUMN_NAME_ID = "id";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_DESCRIPTION = "description";
    }
}
