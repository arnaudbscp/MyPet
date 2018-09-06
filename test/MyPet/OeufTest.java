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
        assertEquals(b-2, perso.getBonheur());
        assertEquals(s+2, perso.getSante());
    }

    @org.junit.Test
    public void dormir() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        int s = perso.getSante();
        perso.dormir();
        assertEquals(e+2, perso.getEnergie());
        assertEquals(b-1, perso.getBonheur());
        assertEquals(s-1, perso.getSante());
    }

    @org.junit.Test
    public void laver() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        int s = perso.getSante();
        perso.laver();
        assertEquals(e - 1, perso.getEnergie());
        assertEquals(b + 1, perso.getBonheur());
        assertEquals(s + 1, perso.getSante());
    }

    @org.junit.Test
    public void caresser() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        perso.caresser();
        assertEquals(e + 1, perso.getEnergie());
        assertEquals(b + 2, perso.getBonheur());
    }

    @org.junit.Test
    public void mangerBoire() {
        int e = perso.getEnergie();
        int b = perso.getBonheur();
        int s = perso.getSante();
        perso.mangerBoire();
        assertEquals(e, perso.getEnergie());
        assertEquals(b, perso.getBonheur());
        assertEquals(s, perso.getSante());
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