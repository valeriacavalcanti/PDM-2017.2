package br.com.valeriacavalcanti.banco

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var etNome: EditText
    lateinit var etIdade: EditText
    lateinit var btCadastrar: Button
    lateinit var lvPessoas: ListView
    lateinit var dao: PessoaDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.dao = PessoaDAO(this)

        this.etNome = findViewById(R.id.etNome)
        this.etIdade = findViewById(R.id.etIdade)
        this.btCadastrar = findViewById(R.id.btCadastrar)
        this.lvPessoas = findViewById(R.id.listaPessoas)

        this.btCadastrar.setOnClickListener({ onClick(it)})

        this.atualizaLista()
    }

    fun atualizaLista(){
        val adapter = ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1, this.dao.select())
        this.lvPessoas.adapter = adapter
    }

    fun onClick(view: View){
        val nome = this.etNome.text.toString()
        val idade = this.etIdade.text.toString().toInt()
        val p = Pessoa(nome = nome, idade = idade)

        this.etNome.text.clear()
        this.etIdade.text.clear()

        this.etNome.requestFocus()

        Log.i("APP", p.toString())

        // armazenar pessoa no banco
        this.dao.insert(p)

        // ver select
        Log.i("APP", this.dao.select().toString())

        this.atualizaLista()
    }
}
