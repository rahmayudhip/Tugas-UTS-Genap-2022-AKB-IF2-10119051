package com.example.uts_10119051.ui.gallery;
//Nama :Rahmayudhi Prakoso
//Nim  :10119051
//Kelas:IF-2

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "catatan_db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

@Override
public void onCreate (SQLiteDatabase db){
        String sql = "create table catatan(no integer primary key, tanggal text null, tgl text null, kategori text null, alamat isi null );";
        Log.d("Data", "onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }


}
