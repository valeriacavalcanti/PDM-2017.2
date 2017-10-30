package br.com.valeriacavalcanti.telasobre

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SobreActivity : AppCompatActivity() {
    lateinit var btMain: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        this.btMain = findViewById(R.id.btSobreMain)
        this.btMain.setOnClickListener({onClick(it)})
    }

    fun onClick(view: View){
        val it = Intent()
        it.putExtra("MSN", "Funciona mesmo!")

        setResult(Activity.RESULT_OK, it)
        finish()
    }
}
