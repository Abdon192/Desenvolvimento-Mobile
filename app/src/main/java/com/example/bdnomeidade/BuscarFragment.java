package com.example.bdnomeidade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BuscarFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            , Bundle saveInstanece){
        View v = inflater.inflate(R.layout.conteudo_buscar, container, false);

        return v;
    }
}
