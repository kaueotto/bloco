package com.example.blocodenotas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterNota extends ArrayAdapter {

    private Context context;
    private ArrayList<Nota> notas;

    public AdapterNota(Context context,ArrayList<Nota> notas) {
        super(context, R.layout.layout_nota,notas);
        this.context=context;
        this.notas = new ArrayList<Nota>(notas);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.layout_nota,null);

        TextView txtNota = (TextView)view.findViewById(R.id.txtLayoutNota);
        txtNota.setText(notas.get(position).getTitulo());

        return  view;
    }
}
