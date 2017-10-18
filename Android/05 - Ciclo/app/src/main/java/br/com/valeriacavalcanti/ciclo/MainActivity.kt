package br.com.valeriacavalcanti.ciclo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("APP", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("APP", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("APP", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("APP", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("APP", "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("APP", "OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("APP", "OnDestroy")
    }
}
