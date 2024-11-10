public class Moto  extends  Veiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int _ano, int _cilindrada)
    {
        super(marca, modelo, _ano);
        this.cilindrada = _cilindrada;
    }
public int getCilindrada()
{
    return cilindrada;
}
public void empinar()
{
    System.out.println("Empinando a moto");
}
    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do veiculo: " + " marca: " + getMarca() + " modelo "+ getModelo() + " ano " + getAno() + " cilindrada: " + getCilindrada());
    }
}
