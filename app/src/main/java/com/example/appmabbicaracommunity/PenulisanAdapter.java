package com.example.appmabbicaracommunity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class PenulisanAdapter extends RecyclerView.Adapter<PenulisanAdapter.PenulisanViewHolder> {


    private ArrayList<Penulisan> dataList;

    public PenulisanAdapter(ArrayList<Penulisan> dataList) {
        this.dataList = dataList;
    }



    @Override
    public PenulisanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_penulisan, parent, false);
        return new PenulisanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PenulisanViewHolder holder, int position) {
        holder.text1.setText(dataList.get(position).getText1());
        holder.text2.setText(dataList.get(position).getText2());
        holder.text3.setText(dataList.get(position).getText3());
        holder.text4.setText(dataList.get(position).getText4());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class PenulisanViewHolder extends RecyclerView.ViewHolder{
        private TextView text1, text2, text3, text4;

        public PenulisanViewHolder(View itemView) {
            super(itemView);
            text1 = (TextView) itemView.findViewById(R.id.Text1);
            text2 = (TextView) itemView.findViewById(R.id.Text2);
            text3 = (TextView) itemView.findViewById(R.id.Text3);
            text4 = (TextView) itemView.findViewById(R.id.Text4);
        }
    }
}