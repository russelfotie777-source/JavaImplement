
   class Main
  {

        public static void main(String[] args)
    {
        CompteBancaire compteBancaire1 = new CompteBancaire("paul",50000);
        CompteBancaire compteBancaire2 = new CompteBancaire("Marie",120000.0);
        System.out.println(compteBancaire1.getSolde());
        compteBancaire1.deposer(100000.0);
        compteBancaire1.deposer(-10000.0);
        System.out.println(compteBancaire1.getTitulaire());
        System.out.println(compteBancaire2.getTitulaire());
        System.out.println(compteBancaire2.getSolde());
        System.out.println(compteBancaire1.getSolde());
        compteBancaire1.retirer(30000.0);
        System.out.println("Le nouveau Solde est de "+compteBancaire1.getSolde());

        //teste de l'enseignant
        System.out.println(compteBancaire1.getSolde());
        
        

    }

  }
