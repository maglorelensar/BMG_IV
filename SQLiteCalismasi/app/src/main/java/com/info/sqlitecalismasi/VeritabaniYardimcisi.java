package com.info.sqlitecalismasi;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VeritabaniYardimcisi extends SQLiteOpenHelper{
	 
	private static final int Surum=1;

	private static String veritabaniAdi = "rehber";

	public VeritabaniYardimcisi(Context context) {
		
		super(context, veritabaniAdi, null, Surum);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
        db.execSQL("CREATE TABLE kisiler (kisi_no INTEGER PRIMARY KEY AUTOINCREMENT,kisi_ad TEXT,kisi_tel TEXT,kisi_yas INTEGER,kisi_boy DOUBLE);");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {

		db.execSQL("DROP TABLE IF EXISTS kisiler");

		onCreate(db);
		
	}
	
}