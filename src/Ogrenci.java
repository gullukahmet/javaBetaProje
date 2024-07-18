public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;
    private boolean üniOkuduMu;
    private  String memleket;
    private boolean javaBiliyorMu;
//constructor: sınıfların yapıcı bloğu
    public Ogrenci(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public boolean isÜniOkuduMu() {
        return üniOkuduMu;
    }

    public void setÜniOkuduMu(boolean üniOkuduMu) {
        this.üniOkuduMu = üniOkuduMu;
    }

    public String getMemleket() {
        return memleket;
    }

    public void setMemleket(String memleket) {
        this.memleket = memleket;
    }

    public boolean isJavaBiliyorMu() {
        return javaBiliyorMu;
    }

    public void setJavaBiliyorMu(boolean javaBiliyorMu) {
        this.javaBiliyorMu = javaBiliyorMu;
    }

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, int yas, boolean üniOkuduMu, String memleket, boolean javaBiliyorMu) {
            this.ad = ad;
            this.soyad = soyad;
            this.yas = yas;
            this.üniOkuduMu = üniOkuduMu;
            this.memleket = memleket;
            this.javaBiliyorMu = javaBiliyorMu;



        }
    }

