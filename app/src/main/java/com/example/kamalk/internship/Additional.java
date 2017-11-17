package com.example.kamalk.internship;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by kamalk on 10/11/2017.
 */


public class Additional extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.k, container, false);
        EditText a = (EditText)view.findViewById(R.id.editText);
        EditText b = (EditText)view.findViewById(R.id.editText2);
        Button g=(Button)view.findViewById(R.id.button3);

        return view;
    }


}
