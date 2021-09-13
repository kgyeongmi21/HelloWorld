package com.example.helloandriod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView
import android.widget.Toast;


class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById<ImageView>(R.id.imageView)
    }

    fun onClick(view: View) {
        imageView.setImageResource(R.drawable.mountain)

        Toast.makeText(this, "이미지를 보여줍니다", Toast.LENGTH_LONG).show()
    }
}
