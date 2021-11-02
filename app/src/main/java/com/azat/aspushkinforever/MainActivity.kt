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

        //Log.d(My_Own_Log_TAG, "onCreate()")

    }
    override fun onStart() {
        super.onStart()
        //Log.d(My_Own_Log_TAG, "onStart()")
        Log.d(My_Own_Log_TAG, textView1.text.toString())
        Log.d(My_Own_Log_TAG, textView2.text.toString())
        Log.d(My_Own_Log_TAG, textView3.text.toString())

    }

    override fun onResume() {
        super.onResume()
        //Log.d(My_Own_Log_TAG, "onResume()")
        Log.d(My_Own_Log_TAG, textView4.text.toString())
        Log.d(My_Own_Log_TAG, textView5.text.toString())
        Log.d(My_Own_Log_TAG, textView6.text.toString())
    }

    override fun onPause() {
        super.onPause()
        //Log.d(My_Own_Log_TAG, "onPause()")
        Log.d(My_Own_Log_TAG, textView7.text.toString())
        Log.d(My_Own_Log_TAG, textView8.text.toString())
        Log.d(My_Own_Log_TAG, textView9.text.toString())
    }

    override fun onStop() {
        super.onStop()
        //Log.d(My_Own_Log_TAG, "onStop()")
        Log.d(My_Own_Log_TAG, textView10.text.toString())
        Log.d(My_Own_Log_TAG, textView11.text.toString())
        Log.d(My_Own_Log_TAG, textView12.text.toString())
    }

    override fun onRestart() {
        super.onRestart()
        //Log.d(My_Own_Log_TAG, "onRestart()")
           }

    override fun onDestroy() {
        super.onDestroy()
        //Log.d(My_Own_Log_TAG, "onDestroy()")


    }

}