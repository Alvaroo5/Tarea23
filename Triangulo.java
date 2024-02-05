package Ej23;

public class Triangulo extends PoligonoRegular{

	private double altura;
	
	public Triangulo() {
        super(10, "azul");
        this.altura = 10;
    }
	
	@Override
    public double getArea() {
        return (lado * altura) / 2;
    }
}