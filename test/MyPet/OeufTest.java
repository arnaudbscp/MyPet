package MyPet;

import org.junit.Before;

import static org.junit.Assert.*;

public class OeufTest {
    Personnage perso;

    @Before
    public void init(){
        perso = new Oeuf("Calimero");
    }
    @org.junit.Test
    public void soigner() {
        int b = perso.getBonheur();
        int s = perso.getSante();
        perso.soigner();
        assertEquals(b, perso.getBonheur()-2 );
        assertEquals(s, perso.getSante() - 1);
    }

    @org.junit.Test
    public void dormir() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        int s = perso.getSante();
        perso.dormir();
        assertEquals(e, e + 2);
        assertEquals(b, b - 1);
        assertEquals(s, s - 1);
    }

    @org.junit.Test
    public void laver() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        int s = perso.getSante();
        perso.laver();
        assertEquals(e, e - 1);
        assertEquals(b, b + 1);
        assertEquals(s, s + 1);
    }

    @org.junit.Test
    public void caresser() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        perso.caresser();
        assertEquals(e, e + 2);
        assertEquals(b, b + 1);
    }

    @org.junit.Test
    public void mangerBoire() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        int s = perso.getSante();
        perso.mangerBoire();
        assertEquals(e, e + 2);
        assertEquals(b, b - 1);
        assertEquals(s, s - 1);
    }

    @org.junit.Test
    public void jouer() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        int s = perso.getSante();
        perso.jouer();
        assertEquals(e, e);
        assertEquals(b, b);
        assertEquals(s, s);
    }
}