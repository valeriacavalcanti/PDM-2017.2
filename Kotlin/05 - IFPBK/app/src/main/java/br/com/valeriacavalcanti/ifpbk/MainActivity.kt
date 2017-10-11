package br.com.valeriacavalcanti.ifpbk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMensagem: TextView
    lateinit var btnOk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvMensagem = findViewById(R.id.tvMainMensagem) as TextView
        this.btnOk = findViewById(R.id.btnMainOk) as Button

//        this.btnOk.setOnClickListener(View.OnClickListener {
//            this.tvMensagem.setText("IFPB")
//        })

        this.btnOk.setOnClickListener({ atualiza(it) })
    }

    fun atualiza(view: View){
        this.tvMensagem.setText("IFPB")
    }
}
