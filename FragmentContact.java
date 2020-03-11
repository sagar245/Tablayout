package com.example.tablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
        View v;
        private RecyclerView recyclerView;
        private List<Contact> lstContact;

    public FragmentContact() {
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            v= inflater.inflate(R.layout.contact_fragment,container,false);
            recyclerView=v.findViewById(R.id.contact_rv);
            RecyclerViewAdapter recyclerviewAdapter=new RecyclerViewAdapter(getContext(),lstContact);
            recyclerView.setLayoutManager(new LinearLayoutManager((getActivity())));
            recyclerView.setAdapter(recyclerviewAdapter);
            return v;
        }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            lstContact=new ArrayList<>();
            lstContact.add(new Contact("A","123456789",R.drawable.contact));
            lstContact.add(new Contact("B","123456789",R.drawable.contact2));
            lstContact.add(new Contact("C","123456789",R.drawable.contact3));
            lstContact.add(new Contact("D","123456789",R.drawable.contact4));
            lstContact.add(new Contact("E","123456789",R.drawable.contact5));
            lstContact.add(new Contact("F","123456789",R.drawable.contact6));
            lstContact.add(new Contact("A","123456789",R.drawable.contact));
            lstContact.add(new Contact("A","123456789",R.drawable.contact));
            lstContact.add(new Contact("A","123456789",R.drawable.contact));
            lstContact.add(new Contact("A","123456789",R.drawable.contact));
            lstContact.add(new Contact("A","123456789",R.drawable.contact));
            lstContact.add(new Contact("A","123456789",R.drawable.contact));
}}
