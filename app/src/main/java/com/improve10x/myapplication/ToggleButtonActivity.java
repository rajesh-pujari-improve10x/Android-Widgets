package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityToggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    private ActivityToggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSubmit();
    }

    private void handleSubmit() {
        binding.submitBtn.setOnClickListener(view -> {
            String toggleButton1 = binding.toggleOneBtn.getText().toString();
            String toggleButton2 = binding.toggleTwoBtn.getText().toString();
            Toast.makeText(this, "ToggleButton 1 : " + toggleButton1 + "\n" + "ToggleButton 2 : " + toggleButton2, Toast.LENGTH_SHORT).show();
        });
    }
}