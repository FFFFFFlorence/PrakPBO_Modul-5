package encapsulation;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        //System.out.println(mhs1.nama);
        //System.out.println(mhs1.nama);
        //System.out.println(mhs1.nama);

        //access modifier
        System.out.println(mhs1.getNama());

        mhs1.setNama("Andi");
        System.out.println(mhs1.getNama());

        mhs1.setUmur(20);
        System.out.println(mhs1.getUmur());

        mhs1.setJurusan("Komunikasi");
        System.out.println(mhs1.getJurusan());

        System.out.println("============================");

        Car myCar = new Car();
        System.out.println(myCar.pemilik);
        //System.out.println(myCar.merk);
        System.out.println(myCar.getMerk());
        //System.out.println(myCar.jumlahBan);

    }
    
}