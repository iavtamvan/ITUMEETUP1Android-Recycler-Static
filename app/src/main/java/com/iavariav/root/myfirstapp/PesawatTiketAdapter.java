package com.iavariav.root.myfirstapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PesawatTiketAdapter extends
        RecyclerView.Adapter<PesawatTiketAdapter.ViewHolder>{

    private Context context;
    private ArrayList<TiketPesawatModel> listTiketPesawat;

    public ArrayList<TiketPesawatModel> getListPesawat(){
        return listTiketPesawat;
    }



    public void setListTiketPesawat(ArrayList<TiketPesawatModel> listTiketPesawat){
        this.listTiketPesawat = listTiketPesawat;
    }

    public PesawatTiketAdapter(Context context) {
        this.context = context;
    }





    @NonNull
    @Override
    public PesawatTiketAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_tiket_pesawat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PesawatTiketAdapter.ViewHolder holder, int position) {

        holder.tvNamaPesawat.setText(getListPesawat().get(position).getNama());

        Glide.with(context)
                .load(getListPesawat().get(position).getFoto())
                .into(holder.ivGambarPesawat);

        holder.cvKKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, MainActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPesawat().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivGambarPesawat;
        private TextView tvNamaPesawat;
        private CardView cvKKlik;

        public ViewHolder(View itemView) {
            super(itemView);
            ivGambarPesawat = (ImageView) itemView.findViewById(R.id.iv_row_gambar_pesawat);
            tvNamaPesawat = (TextView) itemView.findViewById(R.id.tv_nama_pesawat);
            cvKKlik = itemView.findViewById(R.id.cvKlik);

        }
    }
}
