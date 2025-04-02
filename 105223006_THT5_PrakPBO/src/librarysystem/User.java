package librarysystem;

public class User {
	private String nama;
	private int idUser;
	
	public User (String nama, int idUser) {
		this.nama = nama;
		this.idUser = idUser;
	}
	
	public void pinjamBuku(Buku buku) {
		buku.pinjamBuku();
	}

	public void kembalikanBuku(Buku buku) {
		buku.kembalikanBuku();
	}
}
