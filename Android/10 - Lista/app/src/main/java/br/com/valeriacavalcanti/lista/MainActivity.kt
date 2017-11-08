package br.com.valeriacavalcanti.lista

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var lista: ListView
    lateinit var etNome: EditText
    lateinit var btAdd: Button
    var nomes = arrayListOf<String>("Thalita", "Gilberto", "Alex", "Júnior", "Lucas", "Raimundo", "Mateus")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.lista = findViewById(R.id.lista)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes)
        this.lista.adapter = adapter

        this.etNome = findViewById(R.id.etNome)
        this.btAdd = findViewById(R.id.btAdd)
        this.btAdd.setOnClickListener({ add(it)})

        // click curto
        this.lista.setOnItemClickListener({parent, view, position, id ->
            Log.i("APP", this.nomes[position])
        })

        // click longo
        this.lista.setOnItemLongClickListener({parent, view, position, id ->
            Log.i("APP", "LongPress: " + this.nomes[position])
            true
        })
    }

    fun add(view: View){
        val st = this.etNome.text.toString()
        (this.lista.adapter as ArrayAdapter<String>).add(st)
        Log.i("APP", this.nomes.toString())
        //this.nomes.add(st)
    }
}
