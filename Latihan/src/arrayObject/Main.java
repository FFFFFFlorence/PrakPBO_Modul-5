package arrayObject;

import encapsulation.Mahasiswa;

public class Main {

    public static void main(String[] args) {

        //Array Object
        Mahasiswa[] student = {
            new Mahasiswa ("Ali", 20, 170),
            new Mahasiswa ("Budi", 22, 171),
            new Mahasiswa ("Caca", 19, 160),
            new Mahasiswa ("Doni", 27, 175),
        };

        for (Mahasiswa mhs : student) {
            System.out.println("Nama: " + mhs.getNama() + ", Umur: " + mhs.getUmur() + ", Tinggi Badan: " + mhs.getTinggiBadan());
        }

        System.out.println("========================================");

        Mahasiswa[] mhs = new Mahasiswa[3];
        mhs[0] = new Mahasiswa();
        mhs[0].setNama("Ali");
        mhs[1] = new Mahasiswa();
        mhs[1].setNama("Alia");
        mhs[2] = new Mahasiswa();
        mhs[2].setNama("Alin");

        for (Mahasiswa m : mhs){
            System.out.println(m.getNama());
        }
    }
}