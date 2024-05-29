package edupxubai4;

public class Tho extends DongVat {

	
	private String giongTho;
    private String mauLong;
    private String thucAn;

    public Tho(String tenLoaiVat, int chieuDai, double canNang, String giongTho, String mauLong, String thucAn) {
        super(tenLoaiVat, chieuDai, canNang);
        this.giongTho = giongTho;
        this.mauLong = mauLong;
        this.thucAn = thucAn;
    }

    public String getGiongTho() {
        return giongTho;
    }

    public void setGiongTho(String giongTho) {
        this.giongTho = giongTho;
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getThucAn() {
        return thucAn;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }

    @Override
    public String toString() {
        return "Tho{" + super.toString() + ", giongTho=" + giongTho + ", mauLong=" + mauLong + ", thucAn=" + thucAn + '}';
    }
	
}
