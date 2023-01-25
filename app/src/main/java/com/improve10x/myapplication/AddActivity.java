package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityAddBinding;

public class AddActivity extends AppCompatActivity {

    private ActivityAddBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAddBtn();
    }

    private void handleAddBtn() {
        binding.addBtn.setOnClickListener(view -> {
            String num1 = binding.numberOneTxt.getText().toString();
            String num2 = binding.numberTwoTxt.getText().toString();
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int sum = a + b;
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }
}