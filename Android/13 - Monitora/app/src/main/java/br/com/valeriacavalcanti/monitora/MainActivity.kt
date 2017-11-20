package br.com.valeriacavalcanti.monitora

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //lateinit var receiver: CarregadorReceiver
    lateinit var receiver: CarregadorReceiverInterno
    lateinit var filter: IntentFilter
    lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.texto = findViewById(R.id.tvMainTexto)

        //this.receiver = CarregadorReceiver()
        this.receiver = CarregadorReceiverInterno()

        this.filter = IntentFilter()
        this.filter.addAction(Intent.ACTION_POWER_CONNECTED)
        this.filter.addAction(Intent.ACTION_POWER_DISCONNECTED)
    }

    override fun onResume() {
        super.onResume()

        registerReceiver(this.receiver, this.filter)
    }

    override fun onStop() {
        super.onStop()

        unregisterReceiver(this.receiver)
    }

    inner class CarregadorReceiverInterno: BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            val msg = when(intent?.action){
                Intent.ACTION_POWER_CONNECTED -> "Conectou mesmo!"
                Intent.ACTION_POWER_DISCONNECTED -> "Desconectou mesmo!"
                else -> "Eeeeeita"
            }
            //texto.text = msg
            this@MainActivity.texto.text = msg
        }
    }
}
