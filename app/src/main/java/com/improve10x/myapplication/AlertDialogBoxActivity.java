package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;

import com.improve10x.myapplication.databinding.ActivityAlertDailogBoxBinding;

public class AlertDialogBoxActivity extends AppCompatActivity {

    private ActivityAlertDailogBoxBinding binding;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDailogBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleCloseApp();
    }

    private void handleCloseApp() {
        binding.closeAppBtn.setOnClickListener(view -> {
            builder = new AlertDialog.Builder(this);
            builder.setTitle("Alert")
                    .setMessage("Do you want to close this application ?")
                    .setPositiveButton("Yes", (dialogInterface, i) -> {
                        finish();
                    })
                    .setNegativeButton("No", (dialogInterface, i) -> {
                        dialogInterface.cancel();
                    })
                    .setCancelable(false);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        });
    }
}