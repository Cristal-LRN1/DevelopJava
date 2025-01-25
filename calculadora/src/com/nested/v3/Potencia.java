package com.nested.v3;

public class Potencia implements Operacion {
	
	int x;
	int y;
	
	Potencia(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int ejecuta() {
		return (int)Math.pow(x, y);
	}

	@Override
	public String toString() {
		return "Pontencia [x=" + x + ", y=" + y + "]";
	}
	
}

