package laporan7.extend;

import laporan7.interfaces.BentukKeliling;
import laporan7.interfaces.BentukLuas;

public class cobaInterfaces {
	public static double hitungLuasBentuk(BentukLuas b){
		return b.hitungLuas();
	}
	public static double hitungLuasKeliling(BentukKeliling b){
		return b.hitungKeliling();
	}
	public static void main(String args[]){
		BentukInterface bentuk = new Lingkaran(3.0);
		System.out.println(hitungLuasBentuk((BentukLuas) bentuk));
		System.out.println(hitungLuasKeliling((BentukKeliling) bentuk));
	}
}