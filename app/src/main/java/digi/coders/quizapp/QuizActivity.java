package digi.coders.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import digi.coders.quizapp.databinding.ActivityQuizBinding;

public class QuizActivity extends AppCompatActivity {

    ActivityQuizBinding quizBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        quizBinding=ActivityQuizBinding.inflate(getLayoutInflater());
        setContentView(quizBinding.getRoot());
    }
}