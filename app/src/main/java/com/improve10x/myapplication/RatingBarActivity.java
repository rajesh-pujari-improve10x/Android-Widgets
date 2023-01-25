package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {

    private ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSubmit();
    }

    private void handleSubmit() {
        binding.submitBtn.setOnClickListener(view -> {
            String rating = String.valueOf(binding.ratingBar.getRating());
            Toast.makeText(this, rating, Toast.LENGTH_SHORT).show();
        });
    }
}