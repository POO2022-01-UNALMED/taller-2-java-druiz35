package test;
public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String nuevoColor) {
		if (nuevoColor == "rojo" || nuevoColor == "verde" || nuevoColor == "amarillo" || nuevoColor == "negro" || nuevoColor == "blanco") {
			this.color = nuevoColor;
		}
	}
}
