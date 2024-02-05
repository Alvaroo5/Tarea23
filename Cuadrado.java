package Ej23;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(double lado, String color) {
		super(lado, color);
	}

	@Override
	public double getArea() {
		return lado * lado;
	}
	
}
