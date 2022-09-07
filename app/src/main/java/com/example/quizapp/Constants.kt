package com.example.quizapp

object Constants {

    const val USERNAME:String = "username"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val q1 = Question(
            1,"Who is this freedom fighter?", R.drawable.bose,
            "Gandhi","Nehru","Subhash Chandra Bose","Lokmanya Tilak",3
        )
        questionsList.add(q1)

        val q2 = Question(
            1,"Who is this freedom fighter?", R.drawable.gokhale,
            "Gandhi","KG Gokhale","Bhagath Singh","Lokmanya Tilak",2
        )
        questionsList.add(q2)

        val q3 = Question(
            1,"Who is this freedom fighter?", R.drawable.kamala,
            "Kamala Devi","Umbai Kunapur","Jhansi ki Rani","Rani Lakshmi Bai",1
        )
        questionsList.add(q3)

        val q4 = Question(
            1,"Who is this freedom fighter?", R.drawable.shastri,
            "None Of These","Nehru","Lal Bahadur Shastry","Lokmanya Tilak",3
        )
        questionsList.add(q4)

        val q5 = Question(
            1,"Who is this freedom fighter?", R.drawable.karnad,
            "Dadabhai Naoroji","Nehru","Karnad Sadashiva Rao","Sukhdev",3
        )
        questionsList.add(q5)

        val q6 = Question(
            1,"Who is this freedom fighter?", R.drawable.azad,
            "Gandhi","Bhagath Singh","Chandrashekhar Azad","Lokmanya Tilak",3
        )
        questionsList.add(q6)

        val q7 = Question(
            1,"Who is this freedom fighter?", R.drawable.tilak,
            "Gandhi","Vallabhai Patel","Subhash Chandra Bose","Lokmanya Tilak",4
        )
        questionsList.add(q7)

        return questionsList
    }
}