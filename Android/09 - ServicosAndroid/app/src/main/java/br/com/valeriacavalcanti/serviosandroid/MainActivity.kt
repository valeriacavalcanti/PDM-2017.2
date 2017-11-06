package br.com.valeriacavalcanti.serviosandroid

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btHttp: Button
    lateinit var btCamera: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btHttp = findViewById(R.id.btHTTP)
        this.btHttp.setOnClickListener({ http(it)})

        this.btCamera = findViewById(R.id.btCamera)
        this.btCamera.setOnClickListener({ camera(it)})
    }

    fun http(view: View){
        val uri = Uri.parse("http://pdm.valeriacavalcanti.com.br")
        val it = Intent(Intent.ACTION_VIEW, uri)
        startActivity(it)
    }

    fun camera(view: View){
        val it = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(it)
    }
}
