package laporan7.extend;

import laporan7.interfaces.BentukKeliling;
import laporan7.interfaces.BentukLuas;

public interface BentukInterface extends BentukKeliling, BentukLuas{
	public static final double PHI=3.14;
	public void tulis();
}