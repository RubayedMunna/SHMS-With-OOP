
package shms.with.oop;

import java.io.*;

public class FoodServiceProvider implements Serializable
{
    //Dining Section
    private long tokenBreakfast;
    private long tokenLunch;
    private long tokenDinner;
    private String menuBreakfast;
    private String menuLunch;
    private String menuDinner;
    
    //Canteen Section
    
    private long boiledRice;
    private long friedRice;
    private long Biriyani;
    private long fishFry;
    private long hilshaFry;
    private long fishCurry;
    private long hilshaCurry;
    private long spicyChickenFry;
    private long chickenCurry;
    private long beefCurry;
    private long muttonCurry;
    private long mashedPotato;
    private long mashedFish;
    private long dalVorta;
    
    
    public FoodServiceProvider()
    {
        tokenBreakfast=0;
        tokenLunch=0;
        tokenDinner=0;
        menuBreakfast="";
        menuLunch="";
        menuDinner="";
        
        boiledRice=0;
        friedRice=0;
        Biriyani=0;
        fishFry=0;
        hilshaFry=0;
        fishCurry=0;
        hilshaCurry=0;
        spicyChickenFry=0;
        chickenCurry=0;
        beefCurry=0;
        muttonCurry=0;
        mashedPotato=0;
        mashedFish=0;
        dalVorta=0;
    }

    public FoodServiceProvider(long tokenBreakfast, long tokenLunch, long tokenDinner, String menuBreakfast, String menuLunch, String menuDinner, long boiledRice, long friedRice, long Biriyani, long fishFry, long hilshaFry, long fishCurry, long hilshaCurry, long spicyChickenFry, long chickenCurry, long beefCurry, long muttonCurry, long mashedPotato, long mashedFish, long dalVorta) {
        this.tokenBreakfast = tokenBreakfast;
        this.tokenLunch = tokenLunch;
        this.tokenDinner = tokenDinner;
        this.menuBreakfast = menuBreakfast;
        this.menuLunch = menuLunch;
        this.menuDinner = menuDinner;
        this.boiledRice = boiledRice;
        this.friedRice = friedRice;
        this.Biriyani = Biriyani;
        this.fishFry = fishFry;
        this.hilshaFry = hilshaFry;
        this.fishCurry = fishCurry;
        this.hilshaCurry = hilshaCurry;
        this.spicyChickenFry = spicyChickenFry;
        this.chickenCurry = chickenCurry;
        this.beefCurry = beefCurry;
        this.muttonCurry = muttonCurry;
        this.mashedPotato = mashedPotato;
        this.mashedFish = mashedFish;
        this.dalVorta = dalVorta;
    }

    public boolean equals(FoodServiceProvider food)
    {
        return true;
    }
    
    public long getTokenBreakfast() {
        return tokenBreakfast;
    }

    public void setTokenBreakfast(long tokenBreakfast) {
        this.tokenBreakfast = tokenBreakfast;
    }

    public long getTokenLunch() {
        return tokenLunch;
    }

    public void setTokenLunch(long tokenLunch) {
        this.tokenLunch = tokenLunch;
    }

    public long getTokenDinner() {
        return tokenDinner;
    }

    public void setTokenDinner(long tokenDinner) {
        this.tokenDinner = tokenDinner;
    }

    public String getMenuBreakfast() {
        return menuBreakfast;
    }

    public void setMenuBreakfast(String menuBreakfast) {
        this.menuBreakfast = menuBreakfast;
    }

    public String getMenuLunch() {
        return menuLunch;
    }

    public void setMenuLunch(String menuLunch) {
        this.menuLunch = menuLunch;
    }

    public String getMenuDinner() {
        return menuDinner;
    }

    public void setMenuDinner(String menuDinner) {
        this.menuDinner = menuDinner;
    }

    public long getBoiledRice() {
        return boiledRice;
    }

    public void setBoiledRice(long boiledRice) {
        this.boiledRice = boiledRice;
    }

    public long getFriedRice() {
        return friedRice;
    }

    public void setFriedRice(long friedRice) {
        this.friedRice = friedRice;
    }

    public long getBiriyani() {
        return Biriyani;
    }

    public void setBiriyani(long Biriyani) {
        this.Biriyani = Biriyani;
    }

    public long getFishFry() {
        return fishFry;
    }

    public void setFishFry(long fishFry) {
        this.fishFry = fishFry;
    }

    public long getHilshaFry() {
        return hilshaFry;
    }

    public void setHilshaFry(long hilshaFry) {
        this.hilshaFry = hilshaFry;
    }

    public long getFishCurry() {
        return fishCurry;
    }

    public void setFishCurry(long fishCurry) {
        this.fishCurry = fishCurry;
    }

    public long getHilshaCurry() {
        return hilshaCurry;
    }

    public void setHilshaCurry(long hilshaCurry) {
        this.hilshaCurry = hilshaCurry;
    }

    public long getSpicyChickenFry() {
        return spicyChickenFry;
    }

    public void setSpicyChickenFry(long spicyChickenFry) {
        this.spicyChickenFry = spicyChickenFry;
    }

    public long getChickenCurry() {
        return chickenCurry;
    }

    public void setChickenCurry(long chickenCurry) {
        this.chickenCurry = chickenCurry;
    }

    public long getBeefCurry() {
        return beefCurry;
    }

    public void setBeefCurry(long beefCurry) {
        this.beefCurry = beefCurry;
    }

    public long getMuttonCurry() {
        return muttonCurry;
    }

    public void setMuttonCurry(long muttonCurry) {
        this.muttonCurry = muttonCurry;
    }

    public long getMashedPotato() {
        return mashedPotato;
    }

    public void setMashedPotato(long mashedPotato) {
        this.mashedPotato = mashedPotato;
    }

    public long getMashedFish() {
        return mashedFish;
    }

    public void setMashedFish(long mashedFish) {
        this.mashedFish = mashedFish;
    }

    public long getDalVorta() {
        return dalVorta;
    }

    public void setDalVorta(long dalVorta) {
        this.dalVorta = dalVorta;
    }
    
}
