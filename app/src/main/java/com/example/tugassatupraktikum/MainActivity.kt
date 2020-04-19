package com.example.tugassatupraktikum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.annotations.NotNull

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn)
        findViewById<EditText>(R.id.isi)
        findViewById<EditText>(R.id.inputan)




        btn.setOnClickListener {
            val Btn = btn.text.toString()
            val Isi = isi.text.toString()
            val input = inputan.text.toString()
            var hasil = 0
            if (input != null) {


                if (input == null) {


                }





            }
            isi.setText("$input")
        }
    }
}
