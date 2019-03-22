package com.ananda.quizkuakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        // deklarasi tombol
        private Button mBtn_contact, mBtn_about;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //inisial tombol
            mBtn_contact = (Button) findViewById(R.id.btn_contact);
            mBtn_about = (Button) findViewById(R.id.btn_about);

            // function tombol
            mBtn_contact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent iContact = new Intent(getApplicationContext(), ConActivity.class);
                    startActivity(iContact);
                }
            });

            mBtn_about.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent iAbout = new Intent(getApplicationContext(), AboutActivity.class);
                    startActivity(iAbout);
                }
            });
        }
}
