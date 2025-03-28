public class Mahasiswa {

    //variabel Instance
    String nama = "Budi"; 
    int umur = 20 ;
    

    //variabel Static/kelas
    static String Universitas = "Universitas Pertamina";

    public Mahasiswa(){}

    public Mahasiswa(String nama){
        //Cara constructor akses variabel Instance
        this.nama = nama;
        //this.umur = umur;
    }

    public void tampilkanInfo() {
        //variabel Lokal
        String nama = "Budi";
        System.out.println(nama);
        System.out.println(Mahasiswa.Universitas);
    }

    public void sayHello(String nama) {
        System.out.println("namaku : " + nama);
    }

    public void sayHello2(String nama) {
        System.out.println("namaku : " + this.nama);
    }

    String nama1 = "Andrea";
    public void sayHello3(String nama1) {
        System.out.println("namaku : " + this.nama1);
    }

    String nama2 = "Andrea";
    public void sayHello4(String nama2) {
        System.out.println("namaku : " + this.nama2);
    }

    String sayHello5(String nama, int  umur, boolean isLulus) {
        return "Namaku : " + nama + " Umur: " + umur + " Lulus: " + isLulus;
    }

    
}