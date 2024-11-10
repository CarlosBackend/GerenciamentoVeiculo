public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo (String _marca, String _modelo, int _ano)
    {
        this.marca = _marca;
        this.modelo = _modelo;
        this.ano = _ano;
    }
    public String getMarca()
    {
        return marca;
    }
    public String getModelo()
    {
        return modelo;
    }
    public int getAno ()
    {
        return ano;
    }
    public abstract void exibirDetalhes();
}
