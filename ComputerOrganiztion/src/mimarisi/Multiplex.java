package mimarisi;

import mimarisi.Yazaclar;

public class Multiplex {
	public static int[] multiplex(int s2, int s1, int s0) {
		if (s2 == 0 && s1 == 0 && s0 == 1) {
			Yazaclar.OrtakVeriYol = Yazaclar.AR;
			System.out.println(" veri yoluna " + s2 + " " + s1 + " " + s0 + " uygulandi");
		} else if (s2 == 0 && s1 == 1 && s0 == 0) {
			Yazaclar.OrtakVeriYol = Yazaclar.PC;
			System.out.println(" veri yoluna " + s2 + " " + s1 + " " + s0 + " uygulandi");
		} else if (s2 == 0 && s1 == 1 && s0 == 1) {
			Yazaclar.OrtakVeriYol = Yazaclar.DR;
			System.out.println(" veri yoluna " + s2 + " " + s1 + " " + s0 + " uygulandi");
		} else if (s2 == 1 && s1 == 0 && s0 == 0) {
			Yazaclar.OrtakVeriYol = Yazaclar.AC;
			System.out.println(" veri yoluna " + s2 + " " + s1 + " " + s0 + " uygulandi");
		} else if (s2 == 1 && s1 == 0 && s0 == 1) {
			Yazaclar.OrtakVeriYol = Yazaclar.IR;
			System.out.println(" veri yoluna " + s2 + " " + s1 + " " + s0 + " uygulandi");
		} else if (s2 == 1 && s1 == 1 && s0 == 0) {
			Yazaclar.OrtakVeriYol = Yazaclar.TR;
			System.out.println(" veri yoluna " + s2 + " " + s1 + " " + s0 + " uygulandi");
		} else if (s2 == 1 && s1 == 1 && s0 == 1) {
			Yazaclar.OrtakVeriYol = Yazaclar.Bellek;
			System.out.println(" veri yoluna " + s2 + " " + s1 + " " + s0 + " uygulandi");
		} else {
			Yazaclar.OrtakVeriYol = null;
		}
		return Yazaclar.OrtakVeriYol;
	}

}
