package com.example.attendanceapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ClassViewHolder> {
    public static class ClassViewHolder extends RecyclerView.ViewHolder{
    TextView className;
    TextView subjectName;
        public ClassViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.class_item,parent, false);
        return new ClassViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}