public class Mahasiswa {
    public String name;
    public String nim;
    public String jurusan;
    public String umur;
    public String Jenis_Kelamin;
    public String keterangan;

    public Mahasiswa(String name, String nim, String jurusan, String umur, String Jenis_Kelamin) {
        this.name = name.length() < 8 ? name+"\t" : name;
        this.nim = nim.length() < 8 ? nim+"\t" : nim;
        this.jurusan = jurusan.length() < 8 ? jurusan+"\t\t" : (jurusan.length() < 16 ? jurusan+"\t" : jurusan);
        this.umur = umur;
        this.Jenis_Kelamin = Jenis_Kelamin;
        
    }
}
