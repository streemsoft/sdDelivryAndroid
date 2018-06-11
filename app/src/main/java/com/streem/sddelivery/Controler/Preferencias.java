package com.streem.sddelivery.Controler;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferencias {
    private Context context;
    private SharedPreferences preferences;
    private String NOME_ARQUIVO = "sdtooth_streem.conf";
    private int MODE = 0;
    private SharedPreferences.Editor editor;

    public Preferencias(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, MODE);
        editor = preferences.edit();
    }

    public void setInfo(String chave, String info){
        editor.putString(chave, info);
        editor.commit();
    }

    public String getInfo(String chave){
        return preferences.getString(chave,"#");
    }

    public void clearDados(){
        editor.clear();
        editor.commit();
    }
}
