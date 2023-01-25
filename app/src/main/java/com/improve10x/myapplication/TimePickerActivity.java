package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityTimePickerBinding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimePickerActivity extends AppCompatActivity {

    private ActivityTimePickerBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("TimePicker");
        handleChangeTime();
    }

    private void handleChangeTime() {
        binding.changeTimeBtn.setOnClickListener(view -> {
            Toast.makeText(this, binding.timePickerTp.getCurrentHour(), Toast.LENGTH_SHORT).show();
        });
    }
}