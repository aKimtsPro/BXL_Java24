package be.digitalcity.java.demo.oo;

public abstract class Vehicule {
    private String marque;
    private String modele;
    private int kmParcouru;

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }


    protected void seDeplacer(int kmParcouru){
        this.kmParcouru += kmParcouru;
    }

    protected void seDeplacer(){
        this.kmParcouru += 10;
    }

    public abstract void seGarer();

    public int getKmParcouru() {
        return kmParcouru;
    }

    private void setKmParcouru(int kmParcouru) {
        if( kmParcouru >= 0)
            this.kmParcouru = kmParcouru;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    @Override
    public String toString() {
        return "%s { marque: %s, modele: %s, kmParcouru: %d }".formatted(
                this.getClass().getSimpleName(),
                this.marque,
                this.modele,
                this.kmParcouru
        );
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Vehicule vehicule = (Vehicule) object;
        return marque.equals(vehicule.marque) &&
                modele.equals(vehicule.modele);
    }

    @Override
    public int hashCode() {
        int result = marque.hashCode();
        result = 31 * result + modele.hashCode();
        result = 31 * result + kmParcouru;
        return result;
    }
}
