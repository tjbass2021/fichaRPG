public class Personagem {
    // atributes 

    private String nomeDoPersonagem;
    private String nomeDoJogador;
    private String tendencia;
    private int nivel;
    private String divindade;
    private String terraNatal;
    private Raca raca;
    private double tamanho;
    private char sexo;
    private int idade;
    private double peso;
    private double altura;
    private String cabelo;
    private String olhos;
    private Atributos atributos;


    // methods
    public void setNomeDoPersonagem(String nome){
        this.nomeDoPersonagem = nome;
    }

    public String getNomeDoPersonagem(){
        return this.nomeDoPersonagem;
    }

}
