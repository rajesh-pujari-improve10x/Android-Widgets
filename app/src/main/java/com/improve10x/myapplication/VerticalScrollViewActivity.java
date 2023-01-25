package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.myapplication.databinding.ActivityVerticalScroolViewBinding;

public class VerticalScrollViewActivity extends AppCompatActivity {

    private ActivityVerticalScroolViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerticalScroolViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}