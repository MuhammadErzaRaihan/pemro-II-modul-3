package soal1;

import java.util.Random;

public class Dadu {
    private int nilai; 

    public Dadu() {
        this.nilai = acakNilai();
    }

    private int acakNilai() {
        Random Random = new Random();
        return Random.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}
