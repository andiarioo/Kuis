package com.example.latihankuis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void ClickLogout(View view) {
        ClickLogout(this);
    }

    public void ClickLogout(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Keluar");
        builder.setMessage("Yakin ingin keluar?");
        builder.setPositiveButton("IYE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                activity.finishAffinity();
                System.exit(0);
            }
        });
        builder.setNegativeButton("NDAJI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    public void ClickBack(View view) {
        Intent a =new Intent(Biodata.this, MainActivity.class);
        startActivity(a);
        Toast.makeText(this, "Kembali ke Home", Toast.LENGTH_SHORT).show();
    }
}