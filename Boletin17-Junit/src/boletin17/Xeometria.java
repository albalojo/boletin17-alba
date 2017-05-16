package boletin17;
/*
 * Alba Lojo Paz
 */

import java.lang.Math;

public class Xeometria {
	//Per�metro
	public static int perimetroCadrado(int lado) {
		int perimetro;
		perimetro = lado * 4;
		return perimetro;
	}
	//�rea
	public int areaCadrado(int lado) {
		if (lado < 0)
			return -1;
		return lado * 2;
	}
	//Hipotenusa
	public double teoremaPitagoras(int catetoA, int catetoB) {
		return Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));
	}
	//Catetos
	public double teoremaPitagoras(double catetoA, double hipotenusaC) {
		return Math.sqrt((hipotenusaC * hipotenusaC) - (catetoA * catetoA));

	}
}