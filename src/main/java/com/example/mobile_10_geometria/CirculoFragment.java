package com.example.mobile_10_geometria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import controller.CirculoController;
import model.Circulo;

public class CirculoFragment extends Fragment {

    private View view;
    private EditText etRadiusC;
    private Button btAreaC;
    private Button btPerimeterC;
    private TextView tvResC;

    public CirculoFragment() {
       super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_circulo, container, false);
        etRadiusC = view.findViewById(R.id.etRadiusC);
        btAreaC = view.findViewById(R.id.btAreaC);
        btPerimeterC = view.findViewById(R.id.btPerimeterC);
        tvResC = view.findViewById(R.id.tvResC);

        Circulo circulo = new Circulo();

        btAreaC.setOnClickListener(op -> calcularArea(circulo));
        btPerimeterC.setOnClickListener(op -> calcularPerimeter(circulo));

        return view;
    }

    private void calcularPerimeter(Circulo circulo) {

        circulo.setRadius(Float.parseFloat(etRadiusC.getText().toString()));
        CirculoController cc = new CirculoController();
        String res = "O perímetro do círculo é: "+cc.calcPerimeter(circulo);
        tvResC.setText(res);

        clear();

    }

    private void calcularArea(Circulo circulo) {

        circulo.setRadius(Float.parseFloat(etRadiusC.getText().toString()));
        CirculoController cc = new CirculoController();
        String res = "A área do círculo é: "+cc.calcArea(circulo);
        tvResC.setText(res);

        clear();

    }

    private void clear() {
        etRadiusC.setText("");
    }
}