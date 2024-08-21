//Driver  Class
public class TesGuru {
    public static void main(String[] args) {
        //membuat obyek
        Guru buaulia = new Guru();
        Guru pakdiaur = new Guru();
        Guru bupasha = new Guru();
        Guru pakandre = new Guru();
        Guru bufeni = new Guru();
        Guru buasri = new Guru();
        Guru burara = new Guru();


        buaulia.id = 1;
        buaulia.nama = "buAulia";
        buaulia.mapel = "Produktif RPL";
        buaulia.alamat = "Malang";
        pakdiaur.id = 2;
        pakdiaur.nama = "pakDiaur";
        pakdiaur.mapel = "Ipas";
        pakdiaur.alamat = "Malang";
        bupasha.id = 3;
        bupasha.nama = "buPasha";
        bupasha.mapel = "Produktif RPL";
        bupasha.alamat = "Malang";
        pakandre.id = 4;
        pakandre.nama = "pakAndre";
        pakandre.mapel = "Bahasa Inggris";
        pakandre.alamat = "Malang";
        bufeni.id = 5;
        bufeni.nama = "buFeni";
        bufeni.mapel = "Matematika";
        bufeni.alamat = "Malang";
        buasri.id = 6;
        buasri.nama = "buAsri";
        buasri.mapel = "Bahasa Indonesia";
        buasri.alamat = "malang";
        burara.id = 7;
        burara.nama = "buRara";
        burara.mapel = "Ppkn";
        burara.alamat = "Malang";
    
        
        System.out.println("Ini Data bu Aulia");
        System.out.println(buaulia.id);
        System.out.println(buaulia.nama);
        System.out.println(buaulia.mapel);
        System.out.println(buaulia.alamat);
        System.out.println("Ini Data pak Diaur");
        System.out.println(pakdiaur.id);
        System.out.println(pakdiaur.nama);
        System.out.println(pakdiaur.mapel);
        System.out.println(pakdiaur.alamat);
        System.out.println("Ini Data bu Pasha");
        System.out.println(bupasha.id);
        System.out.println(bupasha.nama);
        System.out.println(bupasha.mapel);
        System.out.println(bupasha.alamat);
        System.out.println("Ini Data pak Andre;");
        System.out.println(pakandre.id);
        System.out.println(pakandre.nama);
        System.out.println(pakandre.mapel);
        System.out.println(pakandre.alamat);
        System.out.println("Ini Data bu Feni");
        System.out.println(bufeni.id);
        System.out.println(bufeni.nama);
        System.out.println(bufeni.mapel);
        System.out.println(bufeni.alamat);
        System.out.println("Ini Data bu Asri");
        System.out.println(buasri.id);
        System.out.println(buasri.nama);
        System.out.println(buasri.mapel);
        System.out.println(buasri.alamat);
        System.out.println("Ini Data bu Rara");
        System.out.println(burara.id);
        System.out.println(burara.nama);
        System.out.println(burara.mapel);
        System.out.println(burara.alamat);


        buasri.print();
        burara.print();

        



    }
}
