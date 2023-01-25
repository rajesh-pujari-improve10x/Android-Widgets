package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAddition();
        handleCustomizeToast();
        handleToggle();
        handleCheckBox();
        handleRadioButton();
        handleRatingBar();
        handleSeekBar();
        handleDatePicker();
        handleTimePicker();
        handleVerticalScrollView();
        handleHorizontalScrollView();
    }

    private void handleAddition() {
        binding.additionBtn.setOnClickListener(view -> {
            intent = new Intent(this, AddActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomizeToast() {
        binding.customizeToastBtn.setOnClickListener(view -> {
            intent = new Intent(this, CustomizeToastActivity.class);
            startActivity(intent);
        });
    }

    private void handleToggle() {
        binding.toggleBtn.setOnClickListener(view -> {
            intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleCheckBox() {
        binding.checkBoxBtn.setOnClickListener(view -> {
            intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }

    private void handleRadioButton() {
        binding.radioBtnRb.setOnClickListener(view -> {
            intent = new Intent(this, RadioButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleRatingBar() {
        binding.ratingBarBtn.setOnClickListener(view -> {
            intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleSeekBar() {
        binding.seekBarBtn.setOnClickListener(view -> {
            intent = new Intent(this, SeekBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleDatePicker() {
        binding.datePickerBtn.setOnClickListener(view -> {
            intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleTimePicker() {
        binding.timePickerBtn.setOnClickListener(view -> {
            intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleVerticalScrollView() {
        binding.verticalScrollViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, VerticalScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleHorizontalScrollView() {
        binding.horizontalScrollViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, HorizontalScrollViewActivity.class);
            startActivity(intent);
        });
    }
}