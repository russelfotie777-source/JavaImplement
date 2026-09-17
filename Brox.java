public abstract class Brox {
        private String nom; 
        private String telephone;
        private String password;

        public Brox(String nom, String telephone, String password)
        {
            this.nom = nom;
            this.telephone = telephone;
            this.password = password;
        }

        public String getNom()
        {
            return this.nom;
        }
 

        public void setpassword(String password)
        {
            this.password = password;
        }

}
