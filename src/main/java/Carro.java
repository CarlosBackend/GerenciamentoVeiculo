public class Carro extends Veiculo{
    private int quantidadeDePortas;

    public Carro(String _marca, String _modelo, int _ano, int quantidadeDePortas) {
        super(_marca, _modelo, _ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }
    public void abrirPortas()
    {
        System.out.println("Abrindo portas do carro");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do veiculo modelo: " + getModelo() + " marca: " + getMarca()+ " ano " + " número de portas: " + getQuantidadeDePortas());
    }
    public int getQuantidadeDePortas ()
    {
        return quantidadeDePortas;
    }

}
