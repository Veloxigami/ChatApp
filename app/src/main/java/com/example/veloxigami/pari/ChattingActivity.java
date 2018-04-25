package com.example.veloxigami.pari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ChattingActivity extends AppCompatActivity {

    private RecyclerView chattingRecycler;
    private MessageListAdapter messageListAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Message> messages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting_interface);
        chattingRecycler = findViewById(R.id.chattingRecycler);
        layoutManager = new LinearLayoutManager(this);
        chattingRecycler.setLayoutManager(layoutManager);

        messageListAdapter = new MessageListAdapter(this,messages);
        chattingRecycler.setAdapter(messageListAdapter);
    }
}
