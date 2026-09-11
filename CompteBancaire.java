

public class CompteBancaire 
{
    public String titulaire;
    public double solde; 

    public CompteBancaire(String titulaire, double solde)
    {
        this.titulaire = titulaire;
        this.solde = solde;
    }
 
    public static void main(String[] args)
    {
        CompteBancaire compteBancaire1 = new CompteBancaire("paul",50000);
        CompteBancaire compteBancaire2 = new CompteBancaire("Marie",120000.0);
        System.out.println(compteBancaire1.titulaire);
        System.out.println(compteBancaire1.solde);
        System.out.println(compteBancaire2.titulaire);
        System.out.println(compteBancaire2.solde);
    }
}