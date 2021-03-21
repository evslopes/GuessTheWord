package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.math.log

class ScoreViewModel(finalScore: Int) :ViewModel() {
    //The final score
    var score = finalScore
    init {
        Log.i("ScoreViewModel", "Final Score is $finalScore")
    }
}