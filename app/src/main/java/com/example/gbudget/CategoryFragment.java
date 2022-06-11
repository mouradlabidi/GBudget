package com.example.gbudget;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Objects;

public class CategoryFragment extends Fragment {
    ImageView home,car,gorceries,clothing,eating_out,education,utilities,taxes,sport,health,travel,others;
    public CategoryFragment() {
        // Required empty public constructor
    }

    public static CategoryFragment newInstance(String param1, String param2) {
        CategoryFragment fragment = new CategoryFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        home=view.findViewById(R.id.home);
        car=view.findViewById(R.id.car);
        gorceries=view.findViewById(R.id.gorceries);
        clothing=view.findViewById(R.id.clothing);
        eating_out=view.findViewById(R.id.eating_out);
        education=view.findViewById(R.id.education);
        utilities=view.findViewById(R.id.utilities);
        taxes=view.findViewById(R.id.taxes);
        sport=view.findViewById(R.id.sport);
        health=view.findViewById(R.id.health);
        travel=view.findViewById(R.id.travel);
        others=view.findViewById(R.id.others);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }


        });
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        gorceries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        eating_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        utilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        taxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
           }
        });
          sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot_category dialog = new tot_category();
                dialog.setFragmentResultListener(CategoryFragment.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyCustomDialog");
            }
        });

    }

}