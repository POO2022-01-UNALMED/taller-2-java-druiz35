package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int nuevoRegistro) {
		this.registro = nuevoRegistro;
	}
	
	void asignarTipo(String nuevoTipo) {
		if (nuevoTipo == "electrico" || nuevoTipo == "gasolina") {
			this.tipo = nuevoTipo;
		}
	}
}
