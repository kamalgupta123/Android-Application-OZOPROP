package com.example.kamalk.internship;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static android.content.Context.MODE_PRIVATE;


/**
 * Created by kamalk on 10/11/2017.
 */


public class Dataentry extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout2, container, false);
       final  EditText a = (EditText)view.findViewById(R.id.editText);
       final  EditText b = (EditText)view.findViewById(R.id.editText2);
          Button g=(Button)view.findViewById(R.id.button3);
        final SharedPreferences PREFS= getContext().getSharedPreferences("my_pref",MODE_PRIVATE);
          g. setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  SharedPreferences.Editor editor = PREFS.edit();
                  String n=a.getText().toString();
                  String o=b.getText().toString();
                  editor.putString("email",n);
                  editor.putString("phoneno",o);
                  editor.commit();
              }
          });
        return view;
    }
}