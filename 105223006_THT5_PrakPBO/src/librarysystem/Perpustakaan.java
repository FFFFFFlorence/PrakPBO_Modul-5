package librarysystem;
import java.util.ArrayList;

public class Perpustakaan {
	private ArrayList<Buku> koleksiBuku;
	
	public Perpustakaan() {
		this.koleksiBuku = new ArrayList<>();
	}
	
	public void tambahBuku(Buku buku) {
		koleksiBuku.add(buku);
	}
	
	public void tampilkanBuku() {
		System.out.println("===== Koleksi Buku Perpustakaan =====");
	
		for (Buku buku : koleksiBuku) {
			System.out.println("Judul: " + buku.getJudul());
			System.out.println("Penulis: " + buku.getPenulis());
			System.out.println("Tahun: " + buku.getTahunTerbit());
			System.out.println("Dipinjam: " + buku.isStatusDipinjam() + "\n");
		}
	}
}
