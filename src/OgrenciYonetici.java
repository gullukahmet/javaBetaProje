public class OgrenciYonetici {
    Ogrenci ogrenci = new Ogrenci("Ahmet","Güllük",23,true,"erzurum",true);

    public void ogrenciYazdir(){
        System.out.println("Ogrenci adı:"+ogrenci.getAd());
        System.out.println("Öğrenci soyadı:"+ogrenci.getSoyad());
    }
}
