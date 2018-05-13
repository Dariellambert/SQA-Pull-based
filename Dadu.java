import java.util.Random;  
public final class Dadu {
     public static final int DEFAULT_SISI = 6;

     private static Random randGenerator = new Random();

     private final int jumSisi;
     private int hasil;
     private int tamp;

       public Dadu() {
         this(DEFAULT_SISI);
     }  

    public Dadu(int numSides) {
         this.jumSisi = numSides;
     }
  
    public int lempar() {
         this.hasil = tamp;
         hasil = randGenerator.nextInt(jumSisi) + 1; 
         while(hasil==tamp){
               hasil = randGenerator.nextInt(jumSisi) + 1;
               return hasil;
               }
         return hasil;
     }
  
    public int getJumSisi() {
         return jumSisi;
     }
  
    public int getHasil() {
         return hasil;
     }  
 
    @Override
     public String toString() {
         return "Jumlah sisi dadu: " + getJumSisi() + " hasil: " + getHasil();
     }
 }
