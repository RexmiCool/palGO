package fr.mje.inventaireservice.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monster {

    private String nom;
    private int pvMin;
    private int pvMax;
    private int degatsMin;
    private int degatsMax;

    public Monster(String nom, int pvMin, int pvMax, int degatsMin, int degatsMax) {
        this.nom = nom;
        this.pvMin = pvMin;
        this.pvMax = pvMax;
        this.degatsMin = degatsMin;
        this.degatsMax = degatsMax;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPvMin() {
        return pvMin;
    }

    public void setPvMin(int pvMin) {
        this.pvMin = pvMin;
    }

    public int getPvMax() {
        return pvMax;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public int getDegatsMin() {
        return degatsMin;
    }

    public void setDegatsMin(int degatsMin) {
        this.degatsMin = degatsMin;
    }

    public int getDegatsMax() {
        return degatsMax;
    }

    public void setDegatsMax(int degatsMax) {
        this.degatsMax = degatsMax;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "nom='" + nom + '\'' +
                ", pvMin=" + pvMin +
                ", pvMax=" + pvMax +
                ", degatsMin=" + degatsMin +
                ", degatsMax=" + degatsMax +
                '}';
    }

    public static Monster genererMonsterAleatoire(List<Monster> Monsters) {
        Random random = new Random();
        int indexAleatoire = random.nextInt(Monsters.size());
        Monster MonsterAleatoire = Monsters.get(indexAleatoire);

        int pvAleatoire = random.nextInt(MonsterAleatoire.getPvMax() - MonsterAleatoire.getPvMin() + 1) + MonsterAleatoire.getPvMin();
        int degatsAleatoires = random.nextInt(MonsterAleatoire.getDegatsMax() - MonsterAleatoire.getDegatsMin() + 1) + MonsterAleatoire.getDegatsMin();

        MonsterAleatoire.setPvMin(pvAleatoire);
        MonsterAleatoire.setDegatsMin(degatsAleatoires);

        return MonsterAleatoire;
    }
}