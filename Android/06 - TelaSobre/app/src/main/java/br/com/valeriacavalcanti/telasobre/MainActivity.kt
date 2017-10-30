package br.com.valeriacavalcanti.telasobre

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnSobre: Button
    val SOBRE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnSobre = findViewById(R.id.btMainSobre)
        this.btnSobre.setOnClickListener({onClick(it)})
    }

    fun onClick(view: View){
        val it = Intent(this, SobreActivity::class.java)
        //startActivity(it)
        startActivityForResult(it, SOBRE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == SOBRE){
            if (resultCode == Activity.RESULT_OK){
                val msg = data?.getStringExtra("MSN")
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
            }
        }

    }
}
