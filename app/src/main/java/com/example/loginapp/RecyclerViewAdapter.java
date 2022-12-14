package com.example.loginapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder>{

    public static class  ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre,fecha;
        ImageView Uimg;

        public ViewHolder (View itemView){
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.usertv) ;
            fecha=(TextView)itemView.findViewById(R.id.userDatetv);
            Uimg=(ImageView) itemView.findViewById(R.id.userIMG);


        }
    }

    public List<UserModel> UserList;

    public RecyclerViewAdapter(List<UserModel> userList){

        this.UserList = userList;
    }


    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.nombre.setText(UserList.get(position).getNombre());
        holder.fecha.setText(UserList.get(position).getFecha());
        holder.Uimg.setImageResource(UserList.get(position).getImagen());

    }

    @Override
    public int getItemCount (){

        return UserList.size();
    }

}