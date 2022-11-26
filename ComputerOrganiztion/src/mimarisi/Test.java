package mimarisi;

import mimarisi.disp;
import mimarisi.Multiplex;
import mimarisi.Yazaclar;
import mimarisi.Aktrim;
import mimarisi.Encoder;
import mimarisi.Binary;
import mimarisi.YazacDeger;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int strSay = 4095;
		String mikroIslem = "";
		char devam ='E';
		String[] Str;
		String input;
		System.out.println();
		
		
		
		do {
			System.out.println("mikro isleminizi giriniz :");
			
			input = in.nextLine();
			Str = Str(input);
			Yazaclar.Bellek = Binary.ToBinary(strSay);
			System.out.println("sss");
			Encoder.Encoder(Str[1]);
			
			System.out.print("Ortak veri yolunun degeri : ");
			disp.disBinary(Yazaclar.OrtakVeriYol);
			Aktrim.aktarim_yol(Str[0]);
			YazacDeger.yazacDeger(Str[0]);
			System.out.println("Devam etmek istiyor musun ? ");
			devam = in.next().charAt(0);
			strSay--;
//			mikroIslem = null;
//			input  = null;
			Str[0] = null;
		    Str[1] = null;
			Str    = null ; 

		} while (devam != 'H');
//		&& input == null && Str[1] == null
		System.out.println("End ... ");

	}

	public static String[] Str(String input) {
		String mikroIslem = new String();
		mikroIslem = mikroIslem + input;
		String[] str = mikroIslem.split(" <- ");
		return str;
	}

}
