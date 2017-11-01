package br.com.valeriacavalcanti.arrochaajuda

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class AjudaActivity : AppCompatActivity() {
    lateinit var tvTexto: TextView
    lateinit var layout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ajuda)

        this.tvTexto = findViewById(R.id.tvAjudaTexto)
        this.tvTexto.text = intent.getStringExtra("TEXTO")

        this.layout = findViewById(R.id.layoutAjuda)
        this.layout.setBackgroundColor(Color.GREEN)
    }
}
