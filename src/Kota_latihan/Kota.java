package Kota_latihan;

public class Kota<E> {
    private E element;

    public Kota (E kota){
        element = kota;
    }
    public E getElement(){
        return element;
    }

    public static void main(String[] args){
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota_latihan.Kota di Jawa Timur : "+ jumlahKota.getElement()+ " Kota_latihan.Kota");
        System.out.println("Salah Satu Kota_latihan.Kota di Jawa Timur : Kota_latihan.Kota "+namaKota.getElement());
    }
}