import java.util.*;

/**
 * Kelas ListBarang menyimpan daftar barang dalam bentuk ArrayList.
 */
public class ListBarang {

  /**
   * ArrayList yang menyimpan objek-objek Barang.
   */
  public ArrayList<Barang> barang;

  /**
   * Konstruktor untuk kelas ListBarang.
   * Inisialisasi daftar barang dengan beberapa contoh barang.
   */
  public ListBarang() {
    this.barang = new ArrayList<>();
    barang.add(new Barang("Laptop", 10000000, 20));
    barang.add(new Barang("Smartphone", 5000000, 15));
    barang.add(new Barang("Headphone", 500000, 30));
    barang.add(new Barang("TV", 20000000, 15));
    barang.add(new Barang("Tablet", 3000000, 25));
    barang.add(new Barang("Speaker", 1000000, 40));
    barang.add(new Barang("Camera", 15000000, 10));
    barang.add(new Barang("Printer", 8000000, 12));
    barang.add(new Barang("Mouse", 50000, 50));
    barang.add(new Barang("Keyboard", 80000, 30));
    barang.add(new Barang("Monitor", 1500000, 20));
  }

  /**
   * Metode untuk memperbarui daftar barang dengan daftar yang diberikan.
   *
   * @param updatedList Daftar barang yang baru.
   */
  public void updateListBarang(ArrayList<Barang> updatedList) {
    this.barang = updatedList;
  }
}
