package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    private val _playAgainEvent = MutableLiveData<Boolean>()
    val playAgainEvent: LiveData<Boolean>
        get() = _playAgainEvent

    init {
        Log.i("ScoreViewModel", "The final score was $finalScore")
        _score.value = finalScore
        _playAgainEvent.value = false
    }

    fun onPlayAgainRequest() {
        _playAgainEvent.value = true
    }

    fun onPlayAgainRequestAck() {
        _playAgainEvent.value = false
    }

}