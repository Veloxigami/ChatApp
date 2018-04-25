package com.example.veloxigami.pari;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Chat extends Fragment {


    private RecyclerView chatRecyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Context context;

    public Chat(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);
        chatRecyclerView = rootView.findViewById(R.id.chat_recycler);
        return rootView;
    }


}
