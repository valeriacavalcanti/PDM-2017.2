package br.com.valeriacavalcanti.banco

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by Valéria on 29/11/2017.
 */

val VERSAO = 1

class BancoHelper(context: Context?) : SQLiteOpenHelper(context, "pessoa.sql3", null, VERSAO) {

    override fun onCreate(db: SQLiteDatabase?) {
        val sql = "create table pessoa(id integer primary key autoincrement, nome text, idade integer);"
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("drop table pessoa")
        this.onCreate(db)
    }

}