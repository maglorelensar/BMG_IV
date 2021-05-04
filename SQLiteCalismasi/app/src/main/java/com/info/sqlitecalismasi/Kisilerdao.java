package com.info.sqlitecalismasi;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by kasimadalan on 16.01.2017.
 */

public class Kisilerdao {

    public ArrayList<Kisiler> tumKisiler(VeritabaniYardimcisi vt){

        ArrayList<Kisiler> kisilerArrayList=new ArrayList<>();
        SQLiteDatabase dbx=vt.getWritableDatabase();
        Cursor cursor=dbx.rawQuery("SELECT * FROM kisiler ORDER BY ASC", null);

        while(cursor.moveToNext()){
            Kisiler kisi = new Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),cursor.getString(cursor.getColumnIndex("kisi_ad")),cursor.getString(cursor.getColumnIndex("kisi_tel")),cursor.getInt(cursor.getColumnIndex("kisi_yas")),cursor.getDouble(cursor.getColumnIndex("kisi_boy")));
            kisilerArrayList.add(kisi);
        }
        return kisilerArrayList;

    }

    public ArrayList<Kisiler> tumKisilerYasaGore(VeritabaniYardimcisi vt,int kisi_yas){

        ArrayList<Kisiler> kisilerArrayList=new ArrayList<>();
        SQLiteDatabase dbx=vt.getWritableDatabase();
        Cursor cursor=dbx.rawQuery("SELECT * FROM kisiler WHERE kisi_yaa = "+kisi_yas, null);

        while(cursor.moveToNext()){
            Kisiler kisi = new Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),cursor.getString(cursor.getColumnIndex("kisi_ad")),cursor.getString(cursor.getColumnIndex("kisi_tel")),cursor.getInt(cursor.getColumnIndex("kisi_yas")),cursor.getDouble(cursor.getColumnIndex("kisi_boy")));
            kisilerArrayList.add(kisi);
        }
        return kisilerArrayList;

    }

    public ArrayList<Kisiler> ara(VeritabaniYardimcisi vt,String keyWord){

        ArrayList<Kisiler> kisilerArrayList=new ArrayList<>();
        SQLiteDatabase dbx=vt.getWritableDatabase();
        Cursor cursor=dbx.rawQuery("SELECT * FROM kisiler WHERE kisi_ad like '%"+keyWord+"%' ", null);

        while(cursor.moveToNext()){
            Kisiler kisi = new Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),cursor.getString(cursor.getColumnIndex("kisi_ad")),cursor.getString(cursor.getColumnIndex("kisi_tel")),cursor.getInt(cursor.getColumnIndex("kisi_yas")),cursor.getDouble(cursor.getColumnIndex("kisi_boy")));
            kisilerArrayList.add(kisi);
        }
        return kisilerArrayList;
    }

    public ArrayList<Kisiler> rasgele5KelimeGetir(VeritabaniYardimcisi vt){

        ArrayList<Kisiler> kisilerArrayList=new ArrayList<>();
        SQLiteDatabase dbx=vt.getWritableDatabase();
        Cursor cursor=dbx.rawQuery("SELECT * FROM kisiler ORDER BY RANDOM() LIMIT 5", null);

        while(cursor.moveToNext()){
            Kisiler kisi = new Kisiler(cursor.getInt(cursor.getColumnIndex("kisi_no")),cursor.getString(cursor.getColumnIndex("kisi_ad")),cursor.getString(cursor.getColumnIndex("kisi_tel")),cursor.getInt(cursor.getColumnIndex("kisi_yas")),cursor.getDouble(cursor.getColumnIndex("kisi_boy")));
            kisilerArrayList.add(kisi);
        }
        return kisilerArrayList;

    }

    public void kelimeSil(VeritabaniYardimcisi vt,int kisi_no){
        SQLiteDatabase dbx=vt.getWritableDatabase();
        dbx.delete("kisiler", "kisi_no=?",new String[] {String.valueOf(kisi_no)} );
        dbx.close();

    }


    public void kisiEkle(VeritabaniYardimcisi vt,String kisi_ad,String kisi_tel,int kisi_yas,Double kisi_boy){

        SQLiteDatabase dbx=vt.getWritableDatabase();

        ContentValues values=new ContentValues();

        values.put("kisi_ad",kisi_ad );
        values.put("kisi_tel",kisi_tel );
        values.put("kisi_yas",kisi_yas );
        values.put("kisi_boy",kisi_boy );

        dbx.insertOrThrow("kisiler", null, values);
        dbx.close();

    }

    public void kisiGuncelle(VeritabaniYardimcisi vt,int kisi_no,String kisi_ad,String kisi_tel,int kisi_yas,Double kisi_boy){

        SQLiteDatabase dbx=vt.getWritableDatabase();

        ContentValues values=new ContentValues();

        values.put("kisi_ad",kisi_ad );
        values.put("kisi_tel",kisi_tel );
        values.put("kisi_yas",kisi_yas );
        values.put("kisi_boy",kisi_boy );

        dbx.update("kisiler", values,"kisi_no=?",new String[] {String.valueOf(kisi_no)});
        dbx.close();

    }

    public int kayitKontrol(VeritabaniYardimcisi vt,String kisi_ad){
        int sonuc=0;

        SQLiteDatabase dbx=vt.getWritableDatabase();

        Cursor cr=dbx.rawQuery("select count(*) as sonuc from  kisiler where  kisi_ad='"+kisi_ad+"'  ", null);

        if(cr.moveToFirst()){

            do {

                sonuc=cr.getInt(cr.getColumnIndex("sonuc"));

            } while (cr.moveToNext());


        }
        return sonuc;
    }


}
