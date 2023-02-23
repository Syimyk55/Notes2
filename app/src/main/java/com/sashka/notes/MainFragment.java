package com.sashka.notes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view ,Bundle savedInstanceState) {
        super.onViewCreated(view , savedInstanceState);


       view.findViewById(R.id.btn_add).setOnClickListener(view1 -> {
           AddFragment addFragment = new AddFragment();
           Bundle bundle = new Bundle();
           EditText search = view.findViewById(R.id.edt_text);
           bundle.putString("key",search.getText().toString());
           addFragment.setArguments(bundle);
     requireActivity()
             .getSupportFragmentManager()
             .beginTransaction()
             .replace(R.id.conteiner , new AddFragment())
             .commit();
       });
    }
}
