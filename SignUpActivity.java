package com.hackerhanu.chatbot.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.hackerhanu.chatbot.R;
import com.hackerhanu.chatbot.databinding.ActivitySignInBinding;
import com.hackerhanu.chatbot.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.textSingIn.setOnClickListener(v-> onBackPressed());
    }
}