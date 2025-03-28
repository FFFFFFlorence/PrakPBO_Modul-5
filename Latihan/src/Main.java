public class Main {
    
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        //System.out.println(mhs1.nama);
        //Variabel Lokal
        mhs1.tampilkanInfo();

        System.out.println("============================");
        
        
        System.out.println(mhs1.nama);
        System.out.println(mhs1.umur);

        System.out.println("============================");

        Mahasiswa mhs2 = new Mahasiswa("Ridho");
        System.out.println(mhs2.nama);

        //klo static aksesnya lewat class langsung tanpa buat  objek
        System.out.println(Mahasiswa.Universitas);

        System.out.println("============================");
        
        //Parameter
        mhs2.sayHello("Joko");
        mhs1.sayHello2("Joko");
        mhs1.sayHello3("Joko");
        mhs1.sayHello4("Joko");
        System.out.println(mhs1.sayHello5("Joko", 20, true));

        System.out.println("============================");

    }
}