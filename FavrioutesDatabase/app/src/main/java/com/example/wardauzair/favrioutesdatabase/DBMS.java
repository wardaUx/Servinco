package com.example.wardauzair.favrioutesdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBMS extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "W.db";
    public static final String TABLE_NAME = "Users_tABLE";
    public static final String ID_COL1 = "ID";
    public static final String USERNAME_COL2 = "USERNAME";
    public static final String EMAIL_COL3 = "EMAIL";
    public static final String PASSWORD_COL4 = "PASSWORD";
    public String query = "create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, USERNAME TEXT, EMAIL TEXT, PASSWORD TEXT )" ;



    public  boolean inserData(String name, String email ,String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(USERNAME_COL2, name);
        cv.put(EMAIL_COL3, email);
        cv.put(PASSWORD_COL4, password);
    long result =        db.insert(TABLE_NAME,null,cv);
    if(result == -1)
        return false;
    else
        return  true;
    }

    public DBMS(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    
     @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_NAME);
    }

    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor resultFromCursor = db.rawQuery("select * from "+ TABLE_NAME, null );

        return resultFromCursor;

    }
        public boolean loginCheck(String email, String pas){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor resultFromCursor = db.rawQuery("select * from "+ TABLE_NAME+ " WHERE " +EMAIL_COL3 +"= '" +"email "+" AND "+PASSWORD_COL4+"='"+pas +"'", null );

        if (resultFromCursor.getCount() > 0){
            return true;
        }else {
            return false;
    }
    }
}
