package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.improve10x.myapplication.databinding.ActivityCustomAlertDialogBinding;
import com.improve10x.myapplication.databinding.CustomAlertDialogItemBinding;
import com.improve10x.myapplication.databinding.CustomListViewItemBinding;

public class CustomAlertDialogActivity extends AppCompatActivity {

    private ActivityCustomAlertDialogBinding binding;
    private CustomAlertDialogItemBinding itemBinding;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleClick();
    }

    private void handleClick() {
        binding.clickBtn.setOnClickListener(view -> {
            dialog = new Dialog(this);
            itemBinding = CustomAlertDialogItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(itemBinding.getRoot());
            itemBinding.dismissBtn.setOnClickListener(view1 -> {
                finish();
            });
            itemBinding.cancelIb.setOnClickListener(view1 -> {
                dialog.dismiss();
            });
            itemBinding.alertTextTxt.setText("ALERT....!!!!");
            dialog.show();
        });
    }
}