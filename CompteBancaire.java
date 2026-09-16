

public class CompteBancaire 
{
    private String titulaire;
    private double solde; 
    private static int nombreDeComptes = 0;

    public CompteBancaire(String titulaire, double solde)
    {
        this.titulaire = titulaire;
        if(solde >= 0)
        {
         this.solde = solde;
        }else{
            this.solde = 0;
        }
        nombreDeComptes++;
    }
    public static void afficherNomBanque()
    {
        System.out.println("Banque Java");
    }
    public static int getNombreDeComptes()
    {
        return nombreDeComptes;
    }
    public void afficherPropriétaire()
    {
        System.out.println("Le titulaire du compte est : "+this.titulaire);
    }
    public String getTitulaire()
    {
        return this.titulaire;
    }
    public void setTitulaire(String nomTitulaire)
    {
        this.titulaire = nomTitulaire;
    }

    public double getSolde()
    {
        return this.solde;
    }

    public boolean deposer(double montant)
    {
        if (montant > 0) {
            this.solde += montant;
            return true;
        }
        return false;
    }
    //modification de la méthode retirer
    public boolean retirer(double montant)
    {
        if(montant > 0 && montant <= this.solde)
        {
            this.solde -= montant;
            return true;
        }
        return false;
    }
 
}