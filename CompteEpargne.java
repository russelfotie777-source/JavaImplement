

public class CompteEpargne extends CompteBancaire
{
    private double tauxinteret;

    public CompteEpargne(Client titulaire, double solde, double tauxinteret)
    {
        super(titulaire, solde);
        this.tauxinteret = tauxinteret;
    }
    public double getTauxinteret()
    {
        return this.tauxinteret;
    }
    @Override 
    public boolean deposer(double montant)
    {
        if(montant > 0 && getSolde() - montant >= 10000)
        {
            return super.retirer(montant);
        }
        return false;
    }

}