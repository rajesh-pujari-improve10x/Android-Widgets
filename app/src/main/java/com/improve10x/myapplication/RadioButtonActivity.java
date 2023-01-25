package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityRadioButtonBinding;

public class RadioButtonActivity extends AppCompatActivity {

    private ActivityRadioButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleShowSelected();
    }

    private void handleShowSelected() {
        binding.showSelectedBtn.setOnClickListener(view -> {
            int selectedId = binding.radioGroupRg.getCheckedRadioButtonId();
            if (binding.maleRb.isChecked()) {
                Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            } else if (binding.femaleRb.isChecked()){
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
            }
        });
    }
}