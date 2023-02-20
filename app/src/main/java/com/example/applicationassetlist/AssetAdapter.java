package com.example.applicationassetlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AssetAdapter extends RecyclerView.Adapter<AssetAdapter.AssetViewHolder> {

    private List<Asset> assetList;
    private Context context;

    public AssetAdapter(List<Asset> assetList, List<Asset> context) {
        this.assetList = assetList;
        this.context = (Context) context;
    }

    @NonNull
    @Override
    public AssetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new AssetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssetViewHolder holder, int position) {
        Asset asset = assetList.get(position);
        holder.bind(asset);
    }

    @Override
    public int getItemCount() {
        return assetList.size();
    }

    static class AssetViewHolder extends RecyclerView.ViewHolder {

        AssetViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(Asset asset) {
            // Bind data to views here
        }
    }
}
