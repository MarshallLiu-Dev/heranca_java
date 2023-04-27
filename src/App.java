
import java.util.Scanner;

public class App {
        // class Principal faz de conta que e veiculo
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // criar a herança 

            try (Scanner ler = new Scanner (System.in)) {
                Veiculo uno = new Veiculo();
                Carro tesla = new Carro();
                Moto honda = new Moto();


                String Marca, Modelo, Cor;
                int Ano;

                System.out.println("Qual a marca do seu veiculo?");
                Marca = ler.next();
                uno.getMarca();

                System.out.println("Qual a Cor do seu veiculo?");
                Cor = ler.next();
                uno.setCor();

                System.out.println("Qual a modelo do seu veiculo?");
                Modelo = ler.next();
                uno.getModelo();

                System.out.println("Qual o ano do seu veiculo?");
                Ano = ler.nextInt();
                uno.setAno(Ano);


                System.out.println(uno.getMarca());
                System.out.println(uno.getCor());
                System.out.println(uno.getMarca());
                System.out.println(uno.getAno());
            }

            // veiculo uno = new veiculo();
            // carro tesla = new carro();
            // moto honda = new moto();


            // System.out.println("Qual aMarca do seu Veiculo");
            // uno =Marca.next();
            // System.out.println("Qual a Modelo do seu Veiculo");
            // uno = modelo.next();
            // System.out.println("Qual a cor do seu Veiculo");
            // uno = cor.next();
            // System.out.println("Qual a Ano do seu Veiculo");
            // uno = ano.nextInt();

            // Marca = ler.next();
            // uno.setMarca(Marca);
            // Modelo  = ler.next();
            // uno.setModelo(Modelo);
            // cor = ler.next();
            // uno.setCor(cor);
            // ano = ler.nextInt();
            // uno.setAno(ano);

            // System.out.println(uno.getMarca());
            // System.out.println(uno.getModelo());
            // System.out.println(uno.getCor());
            // System.out.println(uno.getAno());






    }
}

