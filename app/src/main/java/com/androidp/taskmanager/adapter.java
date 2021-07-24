package com.androidp.taskmanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewHolder> {
    private ArrayList<String> data;
    public adapter(ArrayList<String> data){
        this.data = data;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View view = inflator.inflate(R.layout.i_view,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        String title = data.get(position);
        holder.tasktxt.setText(title);
        holder.chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.chk.isChecked()){
                }
            }
        });
        //holder.chk.isChecked();


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tasktxt;
        CheckBox chk;
        public viewHolder(View itemView){
            super(itemView);
            tasktxt = itemView.findViewById(R.id.view1);
            chk = itemView.findViewById(R.id.chk);

            tasktxt.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            showpopup(v);
        }

        private void showpopup(View view){
            PopupMenu popupMenu = new PopupMenu(view.getContext(),view);
            popupMenu.inflate(R.menu.popup);
            popupMenu.show();
        }



    }
}
