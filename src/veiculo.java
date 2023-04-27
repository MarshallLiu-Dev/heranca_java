public class Veiculo {
        private int ano;
        private String marca;
        private String modelo;
        private  String cor;

   	public  Veiculo() {
		this.ano = 0;
		this.marca = "";
		this.modelo = "";
        this.cor = "";

	}

	  // getters e setters para os atributos
   
  	public void setAno(int ano) {
        this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}

    public void setMarca(String m) {
		this.marca = m;
	}
	
	public String getMarca() {
		return marca;
	}
    public void setModelo(String mod) {
		this.modelo = mod;
	}
	
	public String getModelo() {
		return modelo;
	}
    public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
}