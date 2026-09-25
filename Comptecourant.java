public Comptecourant(Client titulaire, double solde) {
        super(titulaire, solde);
    }

    @Override
    public boolean retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Le montant à retirer doit être positif.");
            return false;
        }
        if (getSolde() - montant < -50000) { // Limite de découvert de 50 000
            System.out.println("Retrait échoué : le solde ne peut pas descendre en dessous de -50 000.");
            return false;
        }
        setSolde(getSolde() - montant);
        return true;
    }
}