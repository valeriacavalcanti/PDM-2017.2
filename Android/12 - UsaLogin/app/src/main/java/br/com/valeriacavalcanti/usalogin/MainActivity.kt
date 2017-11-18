package br.com.valeriacavalcanti.usalogin

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val AUTENTICACAO = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent("AUTENTICA_USUARIO")
        startActivityForResult(intent, AUTENTICACAO)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK){
            if (requestCode == AUTENTICACAO){
                setContentView(R.layout.activity_main)
                val login = data?.getStringExtra("USUARIO")
                Toast.makeText(this, login, Toast.LENGTH_SHORT).show()
            }
        }else{
            finish()
        }
    }
}
