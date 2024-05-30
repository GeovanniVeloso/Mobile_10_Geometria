package controller;

public interface IGeometriaController<T> {

    public float calcArea(T t);

    public float calcPerimeter(T t);
}
