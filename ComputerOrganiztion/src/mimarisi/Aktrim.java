package mimarisi;

import mimarisi.Yazaclar;

public class Aktrim {
	public static void aktarim_yol(String Str_lft) {
		Str_lft.trim();
		System.out.println(Str_lft + " LD giris aktif edildi ");
		if (Str_lft.startsWith("M")) {
			Yazaclar.Bellek = Yazaclar.OrtakVeriYol;
		} else if (Str_lft.equals("AC")) {
			Yazaclar.AC = Yazaclar.OrtakVeriYol;
		} else if (Str_lft.equals("AR")) {
			Yazaclar.AR = Yazaclar.OrtakVeriYol;
		} else if (Str_lft.equals("DR")) {
			Yazaclar.DR = Yazaclar.OrtakVeriYol;
		} else if (Str_lft.equals("IR")) {
			Yazaclar.IR = Yazaclar.OrtakVeriYol;
		} else if (Str_lft.equals("TR")) {
			Yazaclar.TR = Yazaclar.OrtakVeriYol;
		} else if (Str_lft.equals("PC")) {
			Yazaclar.PC = Yazaclar.OrtakVeriYol;
		} else {
			System.out.println("yazac bulunmadi ");
		}
	}
}
