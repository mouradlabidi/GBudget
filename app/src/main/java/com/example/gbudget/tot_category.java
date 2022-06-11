package com.example.gbudget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;

public class tot_category extends  DialogFragment {

    private static final String TAG = "MyCustomDialog";

    public void setFragmentResultListener(CategoryFragment categoryFragment, int i) {
    }


    public interface OnInputSelected {
        void sendInput(String input);
    }

    public OnInputSelected mOnInputSelected;

    //widgets
    private ImageView add;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tot_category, container, false);
        add = view.findViewById(R.id.imageView2);
        view.setMinimumHeight(500);
        view.setMinimumWidth(100);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Log.d(TAG, "onClick: closing dialog");
                getDialog().dismiss();*/
                add dialog = new add();
                dialog.setFragmentResultListener(tot_category.this, 1);
                dialog.show(getActivity().getSupportFragmentManager(), "MyAddDialog");
            }
        });


        return view;
    }


}