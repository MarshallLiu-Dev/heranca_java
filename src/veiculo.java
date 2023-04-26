public class veiculo{
        private int ano;
        private String marca;
        private String modelo;
        private  String cor;

   	public veiculo() {
		this.ano = 0;
		this.marca = "";
		this.modelo = "";
        this.cor = "";

	}

	  // getters e setters para os atributos
   
  	public void setAno(int a) {
        this.ano = a;
	}
	
	public getAno() {
		return ano;
	}

    public void setMarca(String) {
		this.marca = "";
	}
	
	public getMarca() {
		return marca;
	}
    public void setModelo(String) {
		this.modelo = "";
	}
	
	public getModelo() {
		return modelo;
	}
    public void setCor(String) {
		this.cor = "";
	}
	
	public getCor() {
		return cor;
	}
}