package br.com.valeriacavalcanti.arrochaajuda

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etTexto: EditText
    lateinit var btEnviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etTexto = findViewById(R.id.etMainTexto)
        this.btEnviar = findViewById(R.id.btMainEnviar)

        this.btEnviar.setOnClickListener({onClick(it)})
    }

    fun onClick(view: View){
        val texto = this.etTexto.text.toString()
        val it = Intent(this, AjudaActivity::class.java)
        it.putExtra("TEXTO", texto)
        startActivity(it)
    }
}
