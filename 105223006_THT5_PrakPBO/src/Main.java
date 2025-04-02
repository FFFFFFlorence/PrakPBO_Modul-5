import librarysystem.*;

public class Main {

	public static void main(String[] args) {
		Perpustakaan perpustakaan = new Perpustakaan();
		Buku buku1 = new Buku("The Invisible Life of Addie Larue", "Neil Gaiman", 2020, false);
		Buku buku2= new Buku("the force of being controlled", "Olive", 2019, false);
		
		perpustakaan.tambahBuku(buku1);
		perpustakaan.tambahBuku(buku2);
		
		perpustakaan.tampilkanBuku();
		
		User user1 = new User("Ecaa", 001);
		user1.pinjamBuku(buku1);
		
		perpustakaan.tampilkanBuku();

		user1.kembalikanBuku(buku1);
		
		perpustakaan.tampilkanBuku();		
	}

}
