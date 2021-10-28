package com.azat.aspushkinforever

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private const val My_Own_Log_TAG="MyOwnLog"

class MainActivity : AppCompatActivity() {

    private lateinit var textView1:TextView
    private lateinit var textView2:TextView
    private lateinit var textView3:TextView
    private lateinit var textView4:TextView
    private lateinit var textView5:TextView
    private lateinit var textView6:TextView
    private lateinit var textView7:TextView
    private lateinit var textView8:TextView
    private lateinit var textView9:TextView
    private lateinit var textView10:TextView
    private lateinit var textView11:TextView
    private lateinit var textView12:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(My_Own_Log_TAG, "onCreate()")
        textView1 = findViewById(R.id.text_view1)
        textView2 = findViewById(R.id.text_view2)
        textView3 = findViewById(R.id.text_view3)
        textView4 = findViewById(R.id.text_view4)
        textView5 = findViewById(R.id.text_view5)
        textView6 = findViewById(R.id.text_view6)
        textView7 = findViewById(R.id.text_view7)
        textView8 = findViewById(R.id.text_view8)
        textView9 = findViewById(R.id.text_view9)
        textView10 = findViewById(R.id.text_view10)
        textView11 = findViewById(R.id.text_view11)
        textView12 = findViewById(R.id.text_view12)
    }
    override fun onStart() {
        super.onStart()
        Log.d(My_Own_Log_TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(My_Own_Log_TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(My_Own_Log_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(My_Own_Log_TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(My_Own_Log_TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(My_Own_Log_TAG, "onDestroy()")
    }

}