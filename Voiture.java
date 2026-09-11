

public class Voiture 
{
    public String marque;
    public double vitesse;

    void acceler()
    {
        this.vitesse +=10;
    }

    public static void main(String[] args)
    {
        Voiture Toyota = new Voiture();
        Toyota.marque = "Toyata RBL";
        Toyota.vitesse = 0;

        Toyota.acceler();

        System.out.println(Toyota.marque);
        System.out.println(Toyota.vitesse);
    }
}