package br.com.valeriacavalcanti.login

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etLogin: EditText
    lateinit var etSenha: EditText
    lateinit var btOk: Button
    lateinit var btCancelar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.carregarComponentesInterface()
        this.carregaListenerBotao()
    }

    fun carregarComponentesInterface(){
        this.etLogin = findViewById(R.id.etMainLogin)
        this.etSenha = findViewById(R.id.etMainSenha)
        this.btOk = findViewById(R.id.btMainOk)
        this.btCancelar = findViewById(R.id.btMainCancela)
    }

    fun carregaListenerBotao(){
        this.btOk.setOnClickListener({ clicaBotao(it)})
        this.btCancelar.setOnClickListener({ clicaBotao(it)})
    }

    fun clicaBotao(view: View){
        if (view.equals(this.btOk)){
            val login = this.etLogin.text.toString()
            val senha = this.etSenha.text.toString()

            if (login.equals("admin") && senha.equals("1234")){
                val intent = Intent()
                intent.putExtra("USUARIO", login)
                setResult(Activity.RESULT_OK, intent)
                finish()
            }else{
                Toast.makeText(this, "Login/Senha errado", Toast.LENGTH_SHORT).show()
            }
        }else{
            setResult(Activity.RESULT_CANCELED)
            finish()
        }
    }
}
