
   class Main
  {

        public static void main(String[] args)
    {
        //création des objets CompteBancaire
        CompteBancaire compteBancaire1 = new CompteBancaire("paul",-50000);
        CompteBancaire compteBancaire2 = new CompteBancaire("Marie",120000.0);
        Client client1 = new Client("paul", "12345678");
        //depot d'argent sur le compteBancaire1
        boolean resultatDepot = compteBancaire1.deposer(100000.0);
          if(resultatDepot)
          {
             System.out.println("Depot effectué avec Succes");
          }else{
             System.out.println("Depot échoué");
          }
        //retait d'argent sur le compteBancaire1
        boolean resultatRetrait1 = compteBancaire1.retirer(20000.0);
        boolean resultatRetrait2 = compteBancaire1.retirer(200000.0);

        //impressions
        CompteBancaire.afficherNomBanque();
        compteBancaire1.afficherPropriétaire();
        client1.afficherClient();
        System.out.println(compteBancaire1.getTitulaire());
        System.out.println(compteBancaire1.getSolde());
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
