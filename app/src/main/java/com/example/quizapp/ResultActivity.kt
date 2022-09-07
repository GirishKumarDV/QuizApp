package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        nameTv.text = intent.getStringExtra(Constants.USERNAME)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val numQues = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        scoreTv.text = "Your score is $correctAns out of $numQues"

        finishBtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}