package mimarisi;

import mimarisi.Yazaclar;
import mimarisi.disp;

public class YazacDeger {
	public static void yazacDeger(String Str) {
		System.out.print(Str + " degeri : ");
		if (Str.startsWith("M")) {
			disp.disBinary(Yazaclar.Bellek);
		} else if (Str.equals("AR")) {
			disp.disBinary(Yazaclar.AR);
		} else if (Str.equals("DR")) {
			disp.disBinary(Yazaclar.DR);
		} else if (Str.equals("IR")) {
			disp.disBinary(Yazaclar.IR);
		} else if (Str.equals("TR")) {
			disp.disBinary(Yazaclar.TR);
		} else if (Str.equals("AC")) {
			disp.disBinary(Yazaclar.AC);
		} else if (Str.equals("PC")) {
			disp.disBinary(Yazaclar.PC);
		} else if (Str.equals("OUTR")) {
			disp.disBinary(Yazaclar.OUTR);
		} else if (Str.equals("INTR")) {
			disp.disBinary(Yazaclar.INTR);
		} else {

		}
	}
}
