public class Veiculo{
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }

    public Veiculo (String marca, String modelo, String cor, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public Veiculo(){

    }
}