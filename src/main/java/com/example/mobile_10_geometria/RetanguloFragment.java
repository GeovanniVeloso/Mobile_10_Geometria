package com.example.mobile_10_geometria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import controller.RetanguloController;
import model.Retangulo;

public class RetanguloFragment extends Fragment {

    private View view;
    private EditText etHeightR;
    private EditText etBaseR;
    private Button btAreaR;
    private Button btPerimeterR;
    private TextView tvResR;


    public RetanguloFragment() {
        super();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        etBaseR = view.findViewById(R.id.etBaseR);
        etHeightR = view.findViewById(R.id.etHeightR);
        btAreaR = view.findViewById(R.id.btAreaR);
        btPerimeterR = view.findViewById(R.id.btPerimeterR);
        tvResR = view.findViewById(R.id.tvResR);

        Retangulo retangulo = new Retangulo();

        btAreaR.setOnClickListener(op -> calcularArea(retangulo));
        btPerimeterR.setOnClickListener(op -> calcularPerimeter(retangulo));
        return view;
    }

    private void calcularPerimeter(Retangulo retangulo) {

        retangulo.setBase(Float.parseFloat(etBaseR.getText().toString()));
        retangulo.setHeight(Float.parseFloat(etHeightR.getText().toString()));
        RetanguloController rc = new RetanguloController();
        String res = "O perímetro do retângulo é: "+rc.calcPerimeter(retangulo);
        tvResR.setText(res);

        clear();

    }

    private void calcularArea(Retangulo retangulo) {

        retangulo.setBase(Float.parseFloat(etBaseR.getText().toString()));
        retangulo.setHeight(Float.parseFloat(etHeightR.getText().toString()));
        RetanguloController rc = new RetanguloController();
        String res = "A área do retângulo é: "+rc.calcArea(retangulo);
        tvResR.setText(res);

        clear();
    }

    private void clear() {
        etBaseR.setText("");
        etHeightR.setText("");
    }
}