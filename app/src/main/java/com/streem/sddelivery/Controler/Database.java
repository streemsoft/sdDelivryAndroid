package com.streem.sddelivery.Controler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Database {

    private SQLiteDatabase db;

    public Database(Context context){
        SQLite auxBD = new SQLite(context);
        db = auxBD.getWritableDatabase();
    }

    public void close(){
        db.close();
    }
}
