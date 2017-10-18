package br.com.valeriacavalcanti.grid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.GridLayout

class MainActivity : AppCompatActivity() {
    lateinit var layout: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.layout = findViewById(R.id.layoutMain) as GridLayout
        this.criaBotoes()
    }

    fun criaBotoes(){
        for (i in 1 .. 40){
            val bt = Button(this)
            bt.setOnClickListener({ clickBotao(it) })
            bt.text = "Botão ${i}"
            this.layout.addView(bt)
        }
    }

    fun clickBotao(view: View){
        Log.i("APP", "${(view as Button).text} foi clicado")
        (view as Button).text = "Eita"
    }
}
