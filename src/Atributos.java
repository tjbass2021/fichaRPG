public class Atributos{
    // atributes
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;

    // modificadores

    private int modFor;
    private int modDest;
    private int modConst;
    private int modInte;
    private int modSabe;
    private int modCaris;

    // constructor

    public Atributos(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma){
        this.forca =  forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;

        setModFor();
        setModCaris();
        setModConst();
        setModDest();
        setModInte();
        setModSabe();


    }


    // methods


   public void setModCaris() {
       this.modCaris = Modificadores(carisma);
   }

   public void setModConst() {
       this.modConst = Modificadores(constituicao);
   }

   public void setModDest() {
       this.modDest = Modificadores(destreza);
   }

   public void setModFor() {
       this.modFor = Modificadores(forca);
   }

   public void setModInte() {
       this.modInte = Modificadores(inteligencia);
   }

   public void setModSabe() {
       this.modSabe = Modificadores(sabedoria);
   }

   public int getModCaris() {
       return modCaris;
   }

   public int getModConst() {
       return modConst;
   }

   public int getModDest() {
       return modDest;
   }

   public int getModFor() {
       return modFor;
   }

   public int getModInte() {
       return modInte;
   }

   public int getModSabe() {
       return modSabe;
   }

   // private methods
   
   private int Modificadores(int atributo) {
        int mod = 0;
        if(atributo >= 20){
           mod = 5; 
        } else if(atributo <= 15 && atributo >= 10) {
            mod = 2;
        } else if (atributo < 10 && atributo > 0) {
            mod = -1;
        }

        return mod;
   }

   
}
        