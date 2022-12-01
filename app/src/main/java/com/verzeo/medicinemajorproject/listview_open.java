package com.verzeo.medicinemajorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class listview_open extends AppCompatActivity {
    TextView mail;
    TextView phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_listview_open);
        mail = findViewById(R.id.mail);
        phone = findViewById(R.id.phone);

        mail.setPaintFlags(mail.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        phone.setPaintFlags(phone.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


        phone.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://wa.me/917645061002");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));

        mail.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("mailto:chattarsunidhi@gmail.com");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));
    }
}