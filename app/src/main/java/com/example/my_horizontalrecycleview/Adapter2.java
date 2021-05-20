package com.example.my_horizontalrecycleview;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.MyAdapter> {
    Context c;
    List<Model2> list2;
    int size;

    public Adapter2(Context c, List<Model2> list2, int size) {
        this.c = c;
        this.list2 = list2;
        this.size = size;
    }

    @NonNull
    @Override
    public Adapter2.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView= LayoutInflater.from(parent.getContext()).inflate(R.layout.row2,parent,false);
        return new MyAdapter(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter2.MyAdapter holder, int position) {
        Model2 model2=list2.get(position);
        holder.profileImage.setImageResource(model2.getProfileImage());
        holder.userName.setText(model2.getUserName());
        holder.spécialité.setText(model2.getSpécialité());
        holder.rendez_vous_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(v.getRootView().getContext());
                View dialogView=LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.custom_dialog,null);
                de.hdodenhof.circleimageview.CircleImageView dialog_box_profile_image;
                TextView dilog_box_user_name;
                TextView dialog_box_doctor_specialiste;


                dialog_box_profile_image=dialogView.findViewById(R.id.dialog_box_user_image);
                dilog_box_user_name=dialogView.findViewById(R.id.dialog_box_user_name);
                dialog_box_doctor_specialiste=dialogView.findViewById(R.id.dialog_box_doctor_specialite);
                dialog_box_profile_image.setImageResource(model2.getProfileImage());
                dilog_box_user_name.setText(model2.getUserName());
                dialog_box_doctor_specialiste.setText(model2.getSpécialité());
                builder.setView(dialogView);
                builder.setCancelable(true);
                builder.show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return size;
    }
    public class MyAdapter extends RecyclerView.ViewHolder{
        de.hdodenhof.circleimageview.CircleImageView profileImage;
        TextView userName;
        TextView spécialité;
        Button rendez_vous_btn;

        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            profileImage=itemView.findViewById(R.id.imageView2);
            userName=itemView.findViewById(R.id.doctor_name);
            spécialité=itemView.findViewById(R.id.specialite_doctor);
            rendez_vous_btn=itemView.findViewById(R.id.btn);
        }
    }
}
