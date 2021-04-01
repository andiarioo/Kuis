package com.example.latihankuis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton launch_btn, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launch_btn = findViewById(R.id.launch);
        phone = findViewById(R.id.phone);


        launch_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:-6.200000, 106.816666"));
                Intent chooser = Intent.createChooser(intent, "Launch Maps");
                startActivity(chooser);
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:+628131553108");
                Intent intent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(intent);
            }
        });
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


    public void ClickBiodata(View view) {
        Intent b = new Intent(MainActivity.this,Biodata.class);
        startActivity(b);
        Toast.makeText(this, "Ke Biodata", Toast.LENGTH_SHORT).show();
    }

}