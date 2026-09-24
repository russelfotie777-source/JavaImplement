
   class Main
  {

        public static void main(String[] args)
    {
        //Création d'un objet Client
        Client paul = new Client("paul", "697685192");
        Client marie = new Client("marie", "653658239");
        //création des objets CompteBancaire
        CompteBancaire compteBancaire1 = new CompteBancaire(paul, -50000);
        CompteBancaire compteBancaire2 = new CompteBancaire(marie, 120000.0);
        CompteEpargne compteEpargne1 = new CompteEpargne(paul,100000, 0.05);

        System.out.println("Le nom du titulaire du compteEpargne est : "+compteEpargne1.getTitulaire().getNom());
        System.out.println("Le solde de votre compte epargne est "+compteEpargne1.getSolde());
        System.out.println("Le taux d'intérêt du compteEpargne est : "+compteEpargne1.getTauxinteret());
        compteEpargne1.deposer(20000.0);
        System.out.println("Le Solde actuel du compte Epargne est de :"+compteEpargne1.getSolde());
      
        //retait d'argent sur le compteBancaire1
        boolean resultatRetrait1 = compteBancaire1.retirer(20000.0);
        boolean resultatRetrait2 = compteBancaire1.retirer(200000.0);

        //impressions
        CompteBancaire.afficherNomBanque();
        compteBancaire1.afficherPropriétaire();
        paul.afficherClient();
        if(resultatRetrait1)
        {
            System.out.println("Retrait effectué avec Succes");
        }else{
            System.out.println("Retrait échoué");
        }
        if(resultatRetrait2)
        {
            System.out.println("retrait effectué avec succes");
        }else{
            System.out.println("retrait échoué");
        }
        System.out.println(compteBancaire2.getTitulaire());
        System.out.println(compteBancaire2.getSolde());
        System.out.println(compteBancaire1.getSolde());
        System.out.println("Le nouveau Solde est de " + compteBancaire1.getSolde());
        System.out.println(compteBancaire1.getSolde());
        System.out.println("Le nombre de comptes créés est de : "+CompteBancaire.getNombreDeComptes());




        

    }

  }
