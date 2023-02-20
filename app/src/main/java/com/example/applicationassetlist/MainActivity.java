package com.example.applicationassetlist;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view_assets);
        recyclerView.setHasFixedSize(true);

        // Atur layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Inisialisasi adapter dan tambahkan beberapa data asset
        List<Asset> assetList = new ArrayList<>();
        assetList.add(new Asset("Laptop", "Acer Aspire 5", R.drawable.ic_launcher_background, "Electronics"));
        assetList.add(new Asset("Headset", "JBL Quantum 800", R.drawable.ic_launcher_background, "Electronics"));
        assetList.add(new Asset("Kursi", "Office Chair", R.drawable.ic_launcher_background, "Furniture"));

        AssetAdapter assetAdapter = new AssetAdapter((List<Asset>) this, assetList);
        recyclerView.setAdapter(assetAdapter);
    }
}
