package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = this.asientos.length;
		return cantidad;
	}
	
	String verificarIntegridad() {
		boolean asientosOriginales = true;
		for (int i=0; i < this.asientos.length; i++) {
			if (this.registro != this.asientos[i].registro) {
				asientosOriginales = false;
				break;
			}
		}
		boolean motorOriginal = (this.motor.registro == this.registro);
		if (motorOriginal && asientosOriginales) {
			String autoOriginal = "Auto original";
			return autoOriginal;
		} else {
			String autoNoOriginal = "Las piezas no son originales";
			return autoNoOriginal;
		}
	}
}
