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
        handleAdd();
    }

    private void handleAdd() {
        binding.addBtn.setOnClickListener(view -> {
            String number1 = binding.numberOneTxt.getText().toString();
            String number2 = binding.numberTwoTxt.getText().toString();
            String sum = add(number1, number2);
            Toast.makeText(this, sum, Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String num1, String num2) {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int sum = a + b;
        return String.valueOf(sum);
    }
}