package Algodatkelas;

public class Main2D {
    public static void main(String[] args) {
        
        Object [][] data ={
            {"Nurudin","Juara 3" ,"Kelas A"}, 
            {"Amalul","Juara 1" ,"Kelas B"},
            {"Rizky","Juara 2" ,"Kelas C"},
            {"Fredy","Juara 2" ,"Kelas D"},
            {"Bima","Juara 1" ,"Kelas A"}
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 6, 4);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}
