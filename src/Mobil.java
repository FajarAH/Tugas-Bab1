public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double second;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek" + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan" + kecepatan);
    }
    public void setWaktu(double jam){
        waktu = jam;
        rubahSekon (jam);
    }
    private void rubahSekon(double jam){
        second = waktu*3600;
    }
}

