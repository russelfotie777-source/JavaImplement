
public class CompteBancaire {
 public String Property;
 private double Solde;

    public String getProperty() {
        return Property;
    }

    public void setProperty(String property){
        this.Property = property;
    }

    public double getSolde()
    {
        return Solde;
    }

    public double DeposerSolde(double montant)
    {
        if(montant > 0)
        {
            Solde += montant;
        }
        return Solde;
    }

    public double RefuserSolde(double montant)
    {
       if(montant > 0 && montant <= Solde)
       {
           Solde -= montant;
       }
         return Solde;
    }

}