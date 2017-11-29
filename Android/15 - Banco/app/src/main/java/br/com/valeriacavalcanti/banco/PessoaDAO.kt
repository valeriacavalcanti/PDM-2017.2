package br.com.valeriacavalcanti.banco

import android.content.ContentValues
import android.content.Context
import android.util.Log

/**
 * Created by Valéria on 29/11/2017.
 */
class PessoaDAO {
    lateinit var bancoHelper: BancoHelper
    val TABELA = "pessoa"

    constructor(contexto: Context){
        this.bancoHelper = BancoHelper(contexto)
    }

    fun insert(p: Pessoa){
        val banco = this.bancoHelper.writableDatabase // SQLiteDabatase
        val cv = ContentValues()
        cv.put("nome", p.nome)
        cv.put("idade", p.idade)
        banco.insert(TABELA, null, cv)
    }

    fun select(): List<Pessoa>{
        val lista = arrayListOf<Pessoa>()
        val banco = this.bancoHelper.readableDatabase
        val colunas = arrayOf("id", "nome", "idade")
        val c = banco.query(TABELA, colunas, null, null, null, null, null)

        c.moveToFirst()

        do{
            // recuperar id, nome, idade
            val id = c.getInt(c.getColumnIndex("id"))
            val nome = c.getString(c.getColumnIndex("nome"))
            val idade = c.getInt(c.getColumnIndex("idade"))

            // instanciar uma pessoa
            val p = Pessoa(id, nome, idade)
            Log.i("APP", p.toString())

            // add pessoa na lista
            lista.add(p)
        }while(c.moveToNext())

        return lista
    }

    fun delete(id: Int){

    }

    fun update(p: Pessoa){

    }
}