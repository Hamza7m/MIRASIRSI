package mimarisi;
import mimarisi.Multiplex;
public class Encoder {
	public static int[] Encoder(String Str_rgt) {
		int x1 = 0, x2, x3, x4, x5, x6, x7;
		Str_rgt.trim();
		if (Str_rgt.startsWith("M")) {
			x1 = 0;
			x2 = 0;
			x3 = 0;
			x4 = 0;
			x5 = 0;
			x6 = 0;
			x7 = 1;
			System.out.println(" x7 aktif edildi ");

		} else if (Str_rgt.equals("DR")) {
			x1 = 0;
			x2 = 0;
			x3 = 1;
			x4 = 0;
			x5 = 0;
			x6 = 0;
			x7 = 0;
			System.out.println(" x3 aktif edildi ");
		} else if (Str_rgt.equals("AR")) {
			x1 = 1;
			x2 = 0;
			x3 = 0;
			x4 = 0;
			x5 = 0;
			x6 = 0;
			x7 = 0;
			System.out.println(" x1 aktif edildi ");
		} else if (Str_rgt.equals("PC")) {
			x1 = 0;
			x2 = 1;
			x3 = 0;
			x4 = 0;
			x5 = 0;
			x6 = 0;
			x7 = 0;
			System.out.println(" x2 aktif edildi ");
		} else if (Str_rgt.equals("AC")) {
			x1 = 0;
			x2 = 0;
			x3 = 0;
			x4 = 1;
			x5 = 0;
			x6 = 0;
			x7 = 0;
			System.out.println(" x4 aktif edildi ");
		} else if (Str_rgt.equals("IR")) {
			x1 = 0;
			x2 = 0;
			x3 = 0;
			x4 = 0;
			x5 = 1;
			x6 = 0;
			x7 = 0;
			System.out.println(" x5 aktif edildi ");
		} else if (Str_rgt.equals("TR")) {
			x1 = 0;
			x2 = 0;
			x3 = 0;
			x4 = 0;
			x5 = 0;
			x6 = 1;
			x7 = 0;
			System.out.println(" x6 aktif edildi ");
		} else {

			x1 = 0;
			x2 = 0;
			x3 = 0;
			x4 = 0;
			x5 = 0;
			x6 = 0;
			x7 = 0;

		}

		int s2 = x1 + x3 + x5 + x7;
		int s1 = x2 + x3 + x6 + x7;
		int s0 = x4 + x5 + x6 + x7;

		return Multiplex.multiplex(s2, s1, s0);

	}

}
