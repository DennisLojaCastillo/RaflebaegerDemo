import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    //Array af Terning objekter?


    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
    }

    public int ryst() {
        Random random = new Random(); //Random generator

        int sum = 0;
        //loope svarende til antalTerninger
        for (int i = 0; i<antalTerninger; i++) {
            //Lave tilfældigt tal ml. 1-6
            int randomNumber = random.nextInt(6) + 1;
            //Summere opg returnere samlet værdi
            sum += randomNumber;
        }
        return sum;

        //Simulere ryst med to "terninger"
        //return 10;
    }
}
