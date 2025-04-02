package librarysystem;

public class Buku {
	private String judul;
	private String penulis;
	private int tahunTerbit;
	private boolean statusDipinjam;
	private static int jumlahBukuTersedia;
	
	public Buku(String judul, String penulis, int tahunTerbit, boolean statusDipinjam) {
		this.judul = judul;
		this.penulis = penulis;
		this.tahunTerbit = tahunTerbit;
		this.statusDipinjam = statusDipinjam;
		jumlahBukuTersedia++;
	}
	
	public void pinjamBuku() {
		statusDipinjam = true;
		jumlahBukuTersedia--;
	}
	
	public void kembalikanBuku() {
		statusDipinjam = false;
		jumlahBukuTersedia++;
	}
	
	public String getJudul() {
		return judul;
	}

	public String getPenulis() {
		return penulis;
	}
	
	public int getTahunTerbit() {
		return tahunTerbit;
	}
	
	public boolean isStatusDipinjam() {
		return statusDipinjam;
	}
}
