import java.util.ArrayList;
public class Main {
    private ArrayList <Mahasiswa> dataMasiswa;
    public static void main(String[] args) throws Exception {
        Main Screen = new Main();
        Screen.inputData();
        Screen.cetakData();
    }
    public void inputData() {
        dataMasiswa = new ArrayList<Mahasiswa>();
        String jawaban;
        int number = 1;
        do {
            System.out.println("________________________________");
            System.out.println("Data Mahasiswa ke "+number);
            System.out.print("NIM : ");
            String nim = System.console().readLine();
            System.out.print("Nama : ");
            String name = System.console().readLine();
            System.out.print("Jurusan : ");
            String jurusan = System.console().readLine();
            System.out.print("Jenis Kelamin : ");
            String Jenis_kelamin = System.console().readLine();
            System.out.print("umur : ");
            String umur = System.console().readLine();
            Mahasiswa mahasiswa = new Mahasiswa(name, nim, jurusan, umur, Jenis_kelamin);
            dataMasiswa.add(mahasiswa);
            System.out.print("Apakah Anda Ingin Menambahkan Nama Lagi? (Y/N)");
            jawaban = System.console().readLine();
            number++;
        } while (jawaban.equals("Y") || jawaban.equals("y"));
    }
    /**
     * 
     */
    public void cetakData() {
        System.out.println("\n\n======================================================================================");
        System.out.println("DATA MAHASISWA");
        System.out.println("======================================================================================");
        System.out.println("No\tNIM\t\tNama\t\tJurusan\t\t\tumur\t\tJenis Kelamin");
        System.out.println("======================================================================================");
        int n_LakiLaki = 0;
        int n_perempuan = 0;
        int n_TeknikInformatika = 0;
        int n_Sisteminformasi = 0;
        int n_DKV = 0 ;

        for (int i = 0; i < dataMasiswa.size(); i++) {
            System.out.println((i+1)+"\t"+dataMasiswa.get(i).nim+"\t"+dataMasiswa.get(i).name+"\t"+dataMasiswa.get(i).jurusan+"\t"+dataMasiswa.get(i).umur+"\t"+dataMasiswa.get(i).Jenis_Kelamin);

            if (dataMasiswa.get(i).Jenis_Kelamin.equals("Laki Laki")) {
                n_LakiLaki++;
            } else if (dataMasiswa.get(i).Jenis_Kelamin.equals("Perempuan")) {
                n_perempuan++;
            }   
            if (dataMasiswa.get(i).jurusan.equals("Teknik Informatika")) {
                n_TeknikInformatika++;
            } else if (dataMasiswa.get(i).jurusan.equals("Sistem Informasi")){
                n_Sisteminformasi++;
            } else{
                n_DKV++;
        }
    }
        System.out.println("======================================================================================");
        System.out.println("\n\nJumlah Mahasiswa : "+dataMasiswa.size());
        System.out.println("Jumlah Laki Laki : "+n_LakiLaki);
        System.out.println("Jumlah Perempuan : "+n_perempuan);
        System.out.println("Mahasiswa Teknik Informatika : "+n_TeknikInformatika);
        System.out.println("Mahasiswa Sistem Informasi : "+n_Sisteminformasi);
        System.out.println("Mahasiswa DKV : "+n_DKV);

    }
}
