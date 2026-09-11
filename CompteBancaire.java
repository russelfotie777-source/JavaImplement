

public class CompteBancaire 
{
    private String titulaire;
    private double solde; 

    public CompteBancaire(String titulaire, double solde)
    {
        this.titulaire = titulaire;
        this.solde = solde;
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

    public void deposer(double montant)
    {
        if (montant > 0) {
            this.solde += montant;
        }else{
            System.out.println("Montant invalide");
        }
    }
    //modific
    public void retirer(double montant)
    {
        if(montant > 0 && montant <= this.solde)
        {
            this.solde -= montant;
        }else{
            System.out.println("Solde Insuffisant");
        }
    }
 
}