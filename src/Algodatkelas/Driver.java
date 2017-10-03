package Algodatkelas;

public class Driver {

    public static void main(String[] args) {
        ArrayLinearList x = new ArrayLinearList();
       
        Object[] y = new Object[20];
        
        System.out.println("--------------------------------------------");
        System.out.println("Soal no.4 Add");
        x.add(0, "ab");
        x.add(1, "bc");
        x.add(2, "cd");
        x.add(3, "de");
        x.add(4, "ef");
        System.out.println("Size = "+x.size());
        System.out.println("Isi awal = " + x.toString());
        System.out.println("Tambah data index ke 0 = 1a ,2 = 2b , 7 = 3c");
        x.add(0, "1a");
        x.add(2, "2b");
        x.add(7, "3c");
        System.out.println("Size = "+x.size());
        System.out.println("Isi yang sudah di tambah = " + x.toString());
        System.out.println("Menghapus index ke 0 dan 2");
        x.remove(0);
        x.remove(2);
        System.out.println("Size = "+x.size());
        System.out.println("Setelah method remove dijalankan = " + x.toString());
        System.out.println("");
        
        System.out.println("--------------------------------------------");
        System.out.println("Soal No.5 Trim To Size");
        System.out.println("Panjang Array : " + x.size());
        System.out.println("Kapasitas Array sebelum di trim : " + x.element.length);
        x.trimToSize();
        System.out.println("Kapasitas Array setelah di trim : " + x.element.length);
        
        System.out.println("--------------------------------------------");
        System.out.println("Soal No.6 Set Size");
        System.out.print("Ukuran element di set menjadi: ");
        x.setSize(8);
        System.out.println(x.element.length);
        System.out.println(x.toString());
        System.out.println("--------------------------------------------");
        System.out.println("Soal No.9 Remove Range");
        System.out.print("Remove index 1-4: ");
        x.removeRange(1, 4);
        System.out.println(x.element.length);
        System.out.println(x.toString());
        System.out.println("--------------------------------------------");
        System.out.println("Soal No.12 Clone");
        System.out.print("Hasil dari Clone :");
       
        System.out.println("Isi objek y : " + x.clone(y));
        System.out.println("--------------------------------------------");
        System.out.println("Soal No.8 Clear");
        x.clear();
        System.out.println(x.toString());
    }
}
