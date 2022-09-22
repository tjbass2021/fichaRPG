
public class Personagem {
    // atributes 

    private String nomeDoPersonagem;
    private String nomeDoJogador;
    private String tendencia;
    private int nivel;
    private String divindade;
    private String terraNatal;
    private Raca raca;
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

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setTendencia(String tendencia) {
        this.tendencia = tendencia;
    }
    
    public String getTendencia() {
        return tendencia;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setDivindade(String divindade) {
        this.divindade = divindade;
    }

    public String getDivindade() {
        return divindade;
    }

    public void setTerraNatal(String terraNatal) {
        this.terraNatal = terraNatal;
    }

    public String getTerraNatal() {
        return terraNatal;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }

    public String getOlhos() {
        return olhos;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Atributos getAtributos() {
        return atributos;
    }
}
