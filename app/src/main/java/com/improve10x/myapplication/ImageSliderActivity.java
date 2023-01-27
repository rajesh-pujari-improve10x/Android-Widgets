package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.myapplication.databinding.ActivityImageSliderBinding;

public class ImageSliderActivity extends AppCompatActivity {

    private ActivityImageSliderBinding binding;
    private ImageSliderAdapter adapter = new ImageSliderAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSliderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        imageSlider();
    }

    private void imageSlider() {
        binding.imageSliderIs.setAdapter(adapter);
    }
}