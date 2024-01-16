package digi.coders.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import digi.coders.quizapp.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding registerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerBinding=ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(registerBinding.getRoot());


    }
}