package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrder();
    }

    private void handleOrder() {
        binding.orderBtn.setOnClickListener(view -> {
            int totalAmount = 0;
            if (binding.pizzaCb.isChecked()) {
                totalAmount += 100;
            }
            if (binding.coffeeCb.isChecked()) {
                totalAmount += 50;
            }
            if (binding.burgerCb.isChecked()) {
                totalAmount += 120;
            }
            Toast.makeText(this, "Selected Items Total : " + totalAmount + " Rs", Toast.LENGTH_SHORT).show();
        });
    }
}