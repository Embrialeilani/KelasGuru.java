//Object Class
public class Guru {
    String Guru;
    int id;
    String nama;
    String mapel;
    String alamat;

    /*Constructor */
    public Guru() {
        id = 1;
        nama = "buAulia";
        mapel = "Produktif RPL";
        alamat = "Malang";
        id = 2;
        nama = "pakDiaur";
        mapel = "Ipas";
        alamat = "Malang";
        id = 3;
        nama = "buPasha";
        mapel = "Produktif RPL";
        alamat = "Malang";
        id = 4;
        nama = "pakAndre";
        mapel = "Bahasa Inggris";
        alamat = "Malang";
        id = 5;
        nama = "buFeni";
        mapel = "Matematika";
        alamat = "Malang";
        id = 6;
        nama = "buAsri";
        mapel = "Bahasa Indonesia";
        alamat = "Malang";
        id = 7;
        nama = "buRara";
        mapel = "Ppkn";
        alamat = "Malang";

    

    }
    //Constructor Parameter
    public Guru(int id,String nama,String mapel,String alamat){
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }    

    //method
    public void print() {
        System.out.println("id :"+id);
        System.out.println("namaa :"+nama);
        System.out.println("mapel :"+mapel);
        System.out.println("alamat :"+alamat);


    }



    }

    

