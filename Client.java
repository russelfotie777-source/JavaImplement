

  class Client
  {
    private String nom;
    private String telephone;
    
     Client(String nom, String telephone)
    {
        this.nom = nom;
        this.telephone = telephone;
    }
   public String getNom()
    {
        return this.nom;
    }
    public String getTelephone()
    {
        return this.telephone;
    }
    public void afficherClient()
    {
        System.out.println("Votre nom est votre numéro de téléphone est : "+ this.nom + " "+ this.telephone);
    }
    
  }