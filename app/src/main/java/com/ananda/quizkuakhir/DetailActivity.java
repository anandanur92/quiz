package com.ananda.quizkuakhir;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.ananda.quizkuakhir.R.id.imageView;
import static com.ananda.quizkuakhir.R.id.img_foto;
import static com.ananda.quizkuakhir.R.id.text;
import static com.ananda.quizkuakhir.R.id.textView;
import static com.ananda.quizkuakhir.R.id.txtName;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAMA");
        String nomor = intent.getStringExtra("NOMOR");
        String JK = intent.getStringExtra("JK");

        TextView txtName = findViewById(R.id.txtName);
        TextView txtNo = findViewById(R.id.txtNo);
        ImageView logo =findViewById(R.id.imageView);
        ImageView bintang=findViewById(R.id.imageView2);

        if(JK.equalsIgnoreCase("L")){
            logo.setImageResource(R.drawable.ic_group_add_black_24dp);
        }
        if (JK.equalsIgnoreCase("P")){
            bintang.setImageResource(R.drawable.ic_star_black_24dp);
        }
        txtName.setText(name);
        txtNo.setText(nomor);
    }
}
