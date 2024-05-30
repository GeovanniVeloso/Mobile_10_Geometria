package controller;

import model.Retangulo;

public class RetanguloController implements IGeometriaController<Retangulo> {

    @Override
    public float calcArea(Retangulo retangulo) {
        return retangulo.getBase()* retangulo.getHeight();
    }

    @Override
    public float calcPerimeter(Retangulo retangulo) {
        return (retangulo.getBase()+retangulo.getHeight()) * 2;
    }

}
