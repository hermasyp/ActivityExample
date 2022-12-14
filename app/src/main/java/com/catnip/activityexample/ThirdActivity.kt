package com.catnip.activityexample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    private val TAG = ThirdActivity::class.simpleName

    private val student : Student? by lazy {
        intent.getParcelableExtra(INTENT_ARG_STUDENT)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        findViewById<Button>(R.id.btn_navigate_to_first).setOnClickListener {
            val intent = Intent(this@ThirdActivity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

/*        val name = intent.getStringExtra(Constants.INTENT_ARG_NAME)
        val age = intent.getIntExtra(Constants.INTENT_ARG_AGE,-1)
        val address = intent.getStringExtra(Constants.INTENT_ARG_ADDRESS)*/


        Toast.makeText(
            this@ThirdActivity,
            "${student?.name} ${student?.address} ${student?.age}",
            Toast.LENGTH_SHORT
        ).show()

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

    companion object {
        private const val INTENT_ARG_STUDENT = "INTENT_ARG_STUDENT"

        fun startActivity(context: Context, student: Student) {
            context.startActivity(Intent(context,ThirdActivity::class.java).apply {
                putExtra(INTENT_ARG_STUDENT,student)
            })
        }
    }
}