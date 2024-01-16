package digi.coders.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import digi.coders.quizapp.databinding.ActivityQuizOptionBinding;

public class QuizOptionActivity extends AppCompatActivity {

    ActivityQuizOptionBinding quizOptionBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        quizOptionBinding=ActivityQuizOptionBinding.inflate(getLayoutInflater());
        setContentView(quizOptionBinding.getRoot());

        quizOptionBinding.back.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
               startActivity(new Intent(QuizOptionActivity.this, MainActivity.class));
               return true;
            }
        });

        quizOptionBinding.takequiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizOptionActivity.this, QuizActivity.class));
                finish();
            }
        });
    }
}