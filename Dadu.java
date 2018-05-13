import java.util.Random;  
import java.awt.color.*;
public final class Dadu {
     public static final int DEFAULT_SISI = 6;

     private static Random randGenerator = new Random();

     private final int jumSisi;
     private int hasil;

       public Dadu() {
         this(DEFAULT_SISI);
     }  

    public Dadu(int numSides) {
         this.jumSisi = numSides;
     }
  
    public int lempar() {
         hasil = randGenerator.nextInt(jumSisi) + 1;  
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
     public void getWarnaSisi(){
	//warna sisi 1
        int red1 = randomGenerator.nextInt(256);
        int green1 = randomGenerator.nextInt(256); 
        int blue1 = randomGenerator.nextInt(256);
        Color color1 = new Color(red1, green1, blue1);

	//warna sisi 2
        int red2 = randomGenerator.nextInt(256);
        int green2 = randomGenerator.nextInt(256); 
        int blue2 = randomGenerator.nextInt(256);
        Color color2 = new Color(red2, green2, blue2);

	//warna sisi 3
        int red3 = randomGenerator.nextInt(256);
        int green3 = randomGenerator.nextInt(256); 
        int blue3 = randomGenerator.nextInt(256);
        Color color3 = new Color(red3, green3, blue3);

	//warna sisi 4
        int red4 = randomGenerator.nextInt(256);
        int green4 = randomGenerator.nextInt(256); 
        int blue4 = randomGenerator.nextInt(256);
        Color color4 = new Color(red4, green4, blue4);

	//warna sisi 5
        int red5 = randomGenerator.nextInt(256);
        int green5 = randomGenerator.nextInt(256); 
        int blue5 = randomGenerator.nextInt(256);
        Color color5 = new Color(red5, green5, blue5);

	//warna sisi 6
        int red6 = randomGenerator.nextInt(256);
        int green6 = randomGenerator.nextInt(256); 
        int blue6 = randomGenerator.nextInt(256);
        Color color6 = new Color(red6, green6, blue6);


    	if(hasil == 1){
           hasil.setColor(color1);
        }
        else if(hasil == 2){
           hasil.setColor(color2);
        }
        else if(hasil == 3){
           hasil.setColor(color3);
        }
        else if(hasil == 4){
           hasil.setColor(color4);
        }
        else if(hasil == 5){
           hasil.setColor(color5);
        }
        else if(hasil == 6){
           hasil.setColor(color6);
        }
    }
 }
