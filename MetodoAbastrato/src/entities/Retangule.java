package entities;

import entities.enums.Color;

public class Retangule  extends Shape{
    private Double width;
    private Double height;

    public Retangule(){
        super();
    }

    public Retangule(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public  double area(){
        return width*height;

    }
}
