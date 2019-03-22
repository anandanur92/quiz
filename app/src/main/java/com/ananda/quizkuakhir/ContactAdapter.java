package com.ananda.quizkuakhir;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private ArrayList<Contact> dataList;
    private Context context;
    private OnAdapterClickListener listener;

    interface OnAdapterClickListener{
        void onClick(Contact contact);
    }

    public ContactAdapter(ArrayList<Contact> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);
        return new ViewHolder(view);
    }





    public void setListener(OnAdapterClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Contact contact = dataList.get(i);
        viewHolder.nameText.setText(contact.getName());
        viewHolder.noText.setText(contact.getNohp());


        if (contact.getJK().equalsIgnoreCase("P")) {
            viewHolder.imgFoto.setImageResource(R.drawable.ic_android_black_24dp);
        }
        if (contact.getJK().equalsIgnoreCase("P")){
            viewHolder.imageView2.setImageResource(R.drawable.ic_star_black_24dp);
        }
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText;
        TextView noText;
        ImageView imgFoto;
        ImageView imageView2;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.name);
            noText = itemView.findViewById(R.id.no);
            imgFoto = itemView.findViewById(R.id.img_foto);
            imageView2=itemView.findViewById(R.id.imageView2);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(dataList.get(getAdapterPosition()));

                    }
                }
            );
        }
    }
}
