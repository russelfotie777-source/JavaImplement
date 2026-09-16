public class plis {
    private String nom;
    private String telephone;
    private String adresse;

    plis(String nom, String telephone, String adresse)
    {
        this.nom = nom;
        this.adresse = adresse;
         if (telephone.length() == 10)
         {
            this.telephone = telephone;
         }
         else
         {
             System.out.println("Le numéro de téléphone doit contenir 10 chiffres");
         }

    }
    
}
