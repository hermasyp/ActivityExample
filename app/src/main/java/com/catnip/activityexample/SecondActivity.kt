package com.catnip.activityexample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private val TAG = SecondActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        findViewById<Button>(R.id.btn_navigate_to_third).setOnClickListener {
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)

            //mengirim data satu satu
            intent.putExtra(Constants.INTENT_ARG_NAME,"Tony Stark")

/*
            intent.putExtra(Constants.INTENT_ARG_NAME,"Tony Stark")
            intent.putExtra(Constants.INTENT_ARG_AGE,52)
            intent.putExtra(Constants.INTENT_ARG_ADDRESS,"Condet")*/

            //mengirim data dengan cara yang lebih slay
            val student = Student("Tony Stark", "Condet", 52)

/*
            val student = Student("Tony Stark", "Condet", 52)
            intent.putExtra(
                Constants.INTENT_ARG_STUDENT_OBJ,
                student
            )
            startActivity(intent)*/

            ThirdActivity.startActivity(this@SecondActivity,student)
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}