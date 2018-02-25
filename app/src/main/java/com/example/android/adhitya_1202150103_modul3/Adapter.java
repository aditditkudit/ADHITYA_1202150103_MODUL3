package com.example.android.adhitya_1202150103_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tavs on 25/02/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {
    public ArrayList<modelMinuman> data;

    public Adapter(ArrayList<modelMinuman> data){
        this.data = data;

        Log.d("JUMLAH_ARRAYLIST","Items: "+getItemCount());
    }
    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_menu, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        final modelMinuman item = data.get(position);
        holder.bindTo(item);
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent go = new Intent(view.getContext().getApplicationContext(),MenuDetail.class);
                go.putExtra("etitle",item.getNama_merk());
                go.putExtra("edesc",item.getDeskripsi());
                go.putExtra("eimg",item.getGambar());
                view.getContext().startActivity(go);
            }
        });



    }

    @Override
    public int getItemCount() {
        return data.size();
    }


     class AdapterViewHolder extends RecyclerView.ViewHolder {
         private TextView mLblMinumanJudul;
         private TextView mLblMinumanInfo;
         private ImageView mLblMinumanImg;
         private Context mContext;
         private modelMinuman mMinuman;

         public AdapterViewHolder(View itemView) {
             super(itemView);
             mLblMinumanJudul = (TextView)itemView.findViewById(R.id.lblItemJudul);
             mLblMinumanInfo = (TextView)itemView.findViewById(R.id.lblItemDeskripsi);
             mLblMinumanImg = (ImageView)itemView.findViewById(R.id.lblItemImg);

         }


        public void bindTo(modelMinuman item) {
            mMinuman = item;
            mLblMinumanImg.setImageResource(item.getGambar());
            mLblMinumanJudul.setText(item.getNama_merk());
            mLblMinumanInfo.setText(item.getInfo());

        }
    }
}
