package Bai5.vidu3;

public class PhuThuy extends NhanVat {

	
	private boolean choi;
	private boolean gay;
	public PhuThuy(String ten, String id, byte gioitinh, double nangluong, boolean choi, boolean gay) {
		super(ten, id, gioitinh, nangluong);
		this.choi = choi;
		this.gay = gay;
	}
	public boolean isChoi() {
		return choi;
	}
	public void setChoi(boolean choi) {
		this.choi = choi;
	}
	public boolean isGay() {
		return gay;
	}
	public void setGay(boolean gay) {
		this.gay = gay;
	}
	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + "]";
	}
	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
		System.out.println("bay");
	}
	@Override
	public void sucmanh() {
		// TODO Auto-generated method stub
		double energy = this.getNangluong()*1.7;
		System.out.println("suc manh cua thuy thuy la :" + energy);
	}
	
	
	
}
