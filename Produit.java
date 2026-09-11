import java.util.ArrayList;
import java.util.List;

public class Produit
{
    private String Nom;
    private double prix;

     public Produit(String Nom, double prix)
     {
        this.Nom = Nom;
        this.prix = prix;
     }
    public String getNom()
    {
        return Nom;
    }
    public void setNom(String nom)
    {
        this.Nom = nom;
    }
    public double getPrix()
    {
        return prix;
    }
    public void setPrix(double montant)
    {
        this.prix = montant;
    }
   public static void main(String[] args)
   {
    List<Produit> produits = new ArrayList<>();
    produits.add(new Produit("Frigo",85000.0));
    produits.add(new Produit("Climatisseur",145000.0));

    for (Produit p : produits)
    {
        System.out.println(p.getNom());
        System.out.println(p.getPrix());
    }

   }
}