package com.example.veloxigami.pari;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anil on 25-04-2018.
 */

public class ChatListAdapter extends RecyclerView.Adapter {

    List<Message> lastMessages = new ArrayList<>();
    Context context;

    public ChatListAdapter(Context context, List<Message> lastMessages) {
        this.context = context;
        this.lastMessages = lastMessages;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_list_item,parent,false);
        return new ChatListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Message message = lastMessages.get(position);
        ((ChatListViewHolder)holder).bind(message);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class ChatListViewHolder extends RecyclerView.ViewHolder{

        ImageView profilePic;
        TextView userName, lastMessage;

        public ChatListViewHolder(View itemView) {
            super(itemView);
            //profilepic from database
            userName = itemView.findViewById(R.id.user_name);
            lastMessage = itemView.findViewById(R.id.last_message);
        }

        void bind(Message message){
            userName.setText(message.getSender().getNickname());
            lastMessage.setText(message.getMessage());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
