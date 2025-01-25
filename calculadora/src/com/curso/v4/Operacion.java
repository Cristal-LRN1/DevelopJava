package com.curso.v4;

//NO PUEDE SER INSTANCIADA
public abstract class Operacion {
	
	int x;
	int y;
	
	public Operacion(int x, int y) {
		this.x = x;
		this.y = y;
	}

	abstract int ejecuta();

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				"[x=" + x + ", y=" + y + "]";
	}

}
