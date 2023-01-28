package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.improve10x.myapplication.databinding.ActivityProgressDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {

    private ActivityProgressDialogBinding binding;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleClick();
    }

    private void handleClick() {
        binding.clickBtn.setOnClickListener(view -> {
            progressDialog = new ProgressDialog(this);
            progressDialog.setTitle("Please Wait..");
            progressDialog.setMessage("Preparing to download...");
            progressDialog.show();
        });
    }
}