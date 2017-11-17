package com.example.kamalk.internship;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.content.Context.MODE_PRIVATE;


/**
 * Created by kamalk on 10/11/2017.
 */


public class Dataview extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout, container, false);
        TextView a = (TextView) view.findViewById(R.id.editText);
        TextView b = (TextView) view.findViewById(R.id.editText2);
        SharedPreferences PREFS= getContext().getSharedPreferences("my_pref",MODE_PRIVATE);
        String u= PREFS.getString("email","email not found");
        String k= PREFS.getString("phoneno","phoneno not found");
        a.setText(u);
        b.setText(k);


        return view;
    }


}
