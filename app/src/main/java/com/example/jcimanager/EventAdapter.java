package com.example.jcimanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventHolder> {
    ArrayList<Event> events;

    public EventAdapter(ArrayList<Event> events) {
        this.events = events;
    }

    @NonNull
    @Override
    public EventHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item,null,false);
        EventHolder viewHolder=new EventHolder(view);
        
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventHolder holder, int position) {
        Event event =this.events.get(position);
        holder.eventImage.setImageResource(event.getImg());
        holder.eventTitle.setText(event.getTitle());
        holder.eventDrscription.setText(event.getDescription());

    }

    @Override
    public int getItemCount() {
        return this.events.size();
    }

    static class EventHolder extends RecyclerView.ViewHolder{
        ImageView eventImage;
        TextView eventTitle;
        TextView eventDrscription;
        Button infoButton;
        public EventHolder(@NonNull View itemView) {
            super(itemView);
            this.eventImage =itemView.findViewById(R.id.event_image);
            this.eventTitle =itemView.findViewById(R.id.event_title);
            this.eventDrscription =itemView.findViewById(R.id.event_description);
            this.infoButton =itemView.findViewById(R.id.info_button);

        }
    }

}
