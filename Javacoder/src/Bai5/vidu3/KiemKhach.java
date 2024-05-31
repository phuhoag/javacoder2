package Bai5.vidu3;

public class KiemKhach extends NhanVat {

	private int so_kiem;
	private int cap_do_su_dung;
	
	public KiemKhach(String ten, String id, byte gioitinh, double nangluong, int so_kiem, int cap_do_su_dung) {
		super(ten, id, gioitinh, nangluong);
		this.so_kiem = so_kiem;
		this.cap_do_su_dung = cap_do_su_dung;
	}

	public int getSo_kiem() {
		return so_kiem;
	}

	public void setSo_kiem(int so_kiem) {
		this.so_kiem = so_kiem;
	}

	public int getCap_do_su_dung() {
		return cap_do_su_dung;
	}

	public void setCap_do_su_dung(int cap_do_su_dung) {
		this.cap_do_su_dung = cap_do_su_dung;
	}

	@Override
	public String toString() {
		return "KiemKhach [so_kiem=" + so_kiem + ", cap_do_su_dung=" + cap_do_su_dung + "]";
	}

	@Override
	public void hanhdong() {
		// TODO Auto-generated method stub
	System.out.println("vung kiem chem");
	}

	@Override
	public void sucmanh() {
		double energy = this.getNangluong()*2;
		System.out.println("suc manh cua ky binh la " +energy);
	
	}
	
	
	
	
}
