package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(){
    private var currentPos = 1
    private var questionsList:ArrayList<Question>? = null
    private var selectedOpPos:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        op1Tv.setOnClickListener{
            onClick(op1Tv)
        }
        op2Tv.setOnClickListener{
            onClick(op2Tv)
        }
        op3Tv.setOnClickListener{
            onClick(op3Tv)
        }
        op4Tv.setOnClickListener{
            onClick(op4Tv)
        }

        questionsList = Constants.getQuestions()
        setQuestion()
    }

    private fun setQuestion() {
            val question = questionsList!![currentPos-1]
            progressBar.progress = currentPos
            progressTv.text = "$currentPos/${progressBar.max}"
            questionTv.text = question.question
            imageIv.setImageResource(question.image)
            op1Tv.text = question.op1
            op2Tv.text = question.op2
            op3Tv.text = question.op3
            op4Tv.text = question.op4
            if(currentPos== questionsList!!.size){
                submitBtn.text = "FINISH"
            }else{
                submitBtn.text = "SUBMIT"
            }
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        op1Tv.let { options.add(0,it) }
        op2Tv.let { options.add(1,it) }
        op3Tv.let { options.add(2,it) }
        op4Tv.let { options.add(3,it) }
        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg

            )
        }
    }
    private fun selectedOptionView(tv:TextView,selectedOpNum:Int){
        defaultOptionsView()
        selectedOpPos = selectedOpNum
        tv.setTextColor(Color.parseColor("#3A51F9"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
        R.drawable.selected_option_border_default_bg)
    }

    private fun onClick(view: View){
        when(view.id){
            R.id.op1Tv->{
                selectedOptionView(op1Tv,1)
            }
            R.id.op2Tv->{
                selectedOptionView(op2Tv,2)
            }
            R.id.op3Tv->{
                selectedOptionView(op3Tv,3)
            }
            R.id.op4Tv->{
                selectedOptionView(op4Tv,4)
            }
            R.id.submitBtn->{

            }
        }
    }
}
