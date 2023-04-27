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
   
  	public void setAno(int a) {
        this.ano = a;
	}
	
	public int getAno() {
		return ano;
	}

    public void setMarca(String m) {
		this.marca = "";
	}
	
	public String getMarca() {
		return marca;
	}
    public void setModelo(String mod) {
		this.modelo = "";
	}
	
	public String getModelo() {
		return modelo;
	}
    public void setCor() {
		this.cor = "";
	}
	
	public String getCor() {
		return cor;
	}
}