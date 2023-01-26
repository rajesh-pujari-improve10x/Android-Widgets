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
            boolean isSelectedPizza = binding.pizzaCb.isChecked();
            boolean isSelectedCoffee = binding.coffeeCb.isChecked();
            boolean isSelectedBurger = binding.burgerCb.isChecked();
            String orderDetails = createOrder(isSelectedPizza, isSelectedCoffee, isSelectedBurger);
            binding.toastTxt.setText(orderDetails);
        });
    }

    private String createOrder(boolean pizza, boolean coffee, boolean burger) {
        int totalAmount = 0;
        String orderDetails = "Selected Items :";
        if (pizza) {
            totalAmount += 100;
            orderDetails += "\nPizza : Rs.100";
        }
        if (coffee) {
            totalAmount += 50;
            orderDetails += "\nCoffee : Rs.50";
        }
        if (burger) {
            totalAmount += 120;
            orderDetails += "\nBurger : Rs.120";
        }
        orderDetails += "\nTotal : Rs." + totalAmount;
        return orderDetails;
    }
}