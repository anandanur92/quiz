package com.ananda.quizkuakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ConActivity extends AppCompatActivity implements ContactAdapter.OnAdapterClickListener{

    private RecyclerView recyclerView;
    private ArrayList<Contact> dataList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con);

        recyclerView = findViewById(R.id.rv_con);
        isiData();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        ContactAdapter adapter = new ContactAdapter(dataList,this);
        adapter.setListener(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }

    private void isiData(){
        dataList.add(new Contact("Sidik","123","Iyo","L"));
        dataList.add(new Contact("Ruri","123","Nggak","P"));
        dataList.add(new Contact("Rida","123","Gatau","L"));
    }

    @Override
    public void onClick(Contact contact) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("NAMA",contact.getName());
        intent.putExtra("NOMOR",contact.getNohp());
        intent.putExtra("JK",contact.getJK());
        startActivity(intent);
    }
}
