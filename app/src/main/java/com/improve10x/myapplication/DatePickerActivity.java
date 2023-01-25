package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityDatePickerBinding;

public class DatePickerActivity extends AppCompatActivity {

    private ActivityDatePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("DatePicker");
        handleChangeDate();
    }

    private void handleChangeDate() {
        binding.changeDateBtn.setOnClickListener(view -> {
            int month = binding.datePickerDp.getMonth() + 1;
            int dayOfMonth = binding.datePickerDp.getDayOfMonth();
            int year = binding.datePickerDp.getYear();
            Toast.makeText(this, String.valueOf(dayOfMonth) + "/" + String.valueOf(month) + "/" + String.valueOf(year), Toast.LENGTH_SHORT).show();
        });
    }
}