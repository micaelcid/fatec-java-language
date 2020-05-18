package negocio;

class Tempo {
    private int unidade;

    public Tempo(int unidade) { this.unidade = unidade;}

    public int getUnidade() { return unidade; }

    public String getTexto() { return unidade < 10 ? String.format("0%s", unidade) : String.valueOf(unidade); }
    
    public void incrementar(){ unidade++; }
}
