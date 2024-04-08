package com.example.collegeproject.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.collegeproject.MainActivity2;
import com.example.collegeproject.R;
import com.example.collegeproject.RecyclerViewInterface;
import com.example.collegeproject.models.ShopModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ShopAdapter  extends RecyclerView.Adapter<ShopAdapter.viewHolder>{
    private final RecyclerViewInterface recyclerViewInterface;

    ArrayList<ShopModel> list;
    Context context;

    public ShopAdapter(ArrayList<ShopModel> list, Context context, RecyclerViewInterface recyclerViewInterface) {
        this.list = list;
        this.context = context;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclarview, parent, false);
        return new viewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
         final ShopModel model = list.get(position);
        holder.imageView.setImageResource(list.get(position).getPic());
        holder.textView.setText(list.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(recyclerViewInterface!= null){
                        int pos = getAdapterPosition();
                        if(pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }

                    }
                }
            });
        }
    }

}
