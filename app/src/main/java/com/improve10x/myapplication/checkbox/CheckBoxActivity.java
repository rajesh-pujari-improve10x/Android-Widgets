package com.improve10x.myapplication.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity implements CheckBoxView {

    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleOrder();
    }

    @Override
    public void handleOrder() {
        binding.orderBtn.setOnClickListener(view -> {
            String orderDetails = new CheckBoxControllerImpl().createOrderDetails(
                    binding.pizzaCb.isChecked(),
                    binding.coffeeCb.isChecked(),
                    binding.burgerCb.isChecked());
            showOrderDetails(orderDetails);
        });
    }

    @Override
    public void showOrderDetails(String message) {
        binding.toastTxt.setText(message);
    }
}