package laporan7;

import laporan7.bentuk.BujurSangkar;
import laporan7.bentuk.bentuk;
import laporan7.bentuk.segitigaSamaKaki;
import laporan7.bentuk.segitigaSamaSisi;

public class cobaBentuk {
	public static void cetakBangun(bentuk b){
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	public static void main(String[] args) {
		cetakBangun(new BujurSangkar());
		cetakBangun(new segitigaSamaKaki());
		cetakBangun(new segitigaSamaSisi());
	}

}