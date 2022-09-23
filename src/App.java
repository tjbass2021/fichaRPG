public class App {
    public static void main(String[] args) throws Exception {

        Personagem azur = new Personagem();
        Atributos atributos = new Atributos(20, 15, 16, 11, 15, 10);

        azur.setNomeDoPersonagem("Azur");
        azur.setAtributos(atributos);
        

        System.out.println(azur.getNomeDoPersonagem());
        System.out.println(azur.getAtributos().getModFor());
        System.out.println(azur.getAtributos().getModCaris());
        System.out.println(azur.getAtributos().getModConst());
        System.out.println(azur.getAtributos().getModDest());
        System.out.println(azur.getAtributos().getModInte());
        System.out.println(azur.getAtributos().getModSabe());
    }
}
