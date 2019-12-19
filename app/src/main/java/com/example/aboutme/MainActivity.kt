package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken, 0)
        }


    }

    private fun addNickname(it: View?) {

        val getnickname = findViewById<EditText>(R.id.editText)

        val mtextview = findViewById<TextView>(R.id.nickname_text)
        mtextview.setText(getnickname.text)
        mtextview.setVisibility(TextView.VISIBLE)
        getnickname.setVisibility(EditText.GONE)
    }
}
