package com.verzeo.medicinemajorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class dr_num2 extends AppCompatActivity {
    TextView mail;
    TextView phone, location;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dr_num2);

        mail = findViewById(R.id.mail);
        phone = findViewById(R.id.phone);
        imageView = findViewById(R.id.imageView7);
        location = findViewById(R.id.mylocation);

        mail.setPaintFlags(mail.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        phone.setPaintFlags(phone.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        imageView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://wa.me/918338941965");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        }));



        phone.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("tel:917645061002");
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

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dr_num2.this, MainActivity5.class);
                startActivity(intent);

            }
        });
    }
}