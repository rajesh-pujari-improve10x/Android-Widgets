package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityCustomizeToastBinding;
import com.improve10x.myapplication.databinding.CustomizeToastItemBinding;

public class CustomizeToastActivity extends AppCompatActivity {

    private ActivityCustomizeToastBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomizeToastBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showCustomizeToast();
    }

    private void showCustomizeToast() {
        CustomizeToastItemBinding customizeToastItemBinding = CustomizeToastItemBinding.inflate(getLayoutInflater());
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(customizeToastItemBinding.getRoot());
        toast.show();
    }
}