package com.androidp.taskmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class datab extends SQLiteOpenHelper {
    private static final String dbname = "taskdb";
    private static final int version = 1;
    public datab(Context context){
       super(context,dbname,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
