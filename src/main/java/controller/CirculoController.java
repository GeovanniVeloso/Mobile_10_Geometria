package controller;

import model.Circulo;

public class CirculoController implements IGeometriaController<model.Circulo> {
    @Override
    public float calcArea(Circulo circulo) {
        return (float)(Math.PI * (Math.pow(circulo.getRadius(), 2)));
    }

    @Override
    public float calcPerimeter(Circulo circulo) {
        return (float)(2*Math.PI* circulo.getRadius());
    }
}
