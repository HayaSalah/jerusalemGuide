package com.example.finalpro21.screensFragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.finalpro21.R;
import com.example.finalpro21.places.alaqsaMosuqe;
import com.example.finalpro21.places.alburaqWall;
import com.example.finalpro21.places.alqiamaCharch;


public class places extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_home, container, false);
        root.findViewById(R.id.alaqsa_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getContext(), alaqsaMosuqe.class);
                startActivity(i);
            }
        });
        root.findViewById(R.id.alqiama_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getContext(), alqiamaCharch.class);
                startActivity(i);
            }
        });
        root.findViewById(R.id.alburaq_sheet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getContext(), alburaqWall.class);
                startActivity(i);
            }
        });
        return  root;
    }
}