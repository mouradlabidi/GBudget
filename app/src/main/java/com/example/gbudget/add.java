package com.example.gbudget;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;

public class add extends AppCompatDialogFragment {

    private static final String TAG = "MyAddDialog";

    public void setFragmentResultListener(tot_category tot_category, int i) {
    }


    public interface OnInputSelected {
        void sendInput(String input);
    }

    public add.OnInputSelected mOnInputSelected;

    //widgets
    private EditText editTextNumber,editTextTextPersonName;
    private ImageView textView9,textView6,categoryadd,categorybar2;
    private Button buttonadd;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add, container, false);
        buttonadd = view.findViewById(R.id.button2);
        view.setMinimumHeight(500);
        view.setMinimumWidth(100);


        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: closing dialog");
                getDialog().dismiss();
            }
        });


        return view;
    }


}