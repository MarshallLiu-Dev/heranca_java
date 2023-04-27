
import java.util.Scanner;

public class App {
        // class Principal faz de conta que e veiculo
    // criar a herança 
                    public static void main(String[] args) {
                        // System.out.println("Hello, World!");

                    Scanner ler = new Scanner(System.in);
                    Veiculo uno = new Veiculo();

                    String marca, modelo, cor;
                    int ano;

                    System.out.println("Qual a marca do seu veiculo?");
                    marca = ler.next();
                    uno.setMarca(marca);

                    System.out.println("Qual a Cor do seu veiculo?");
                    cor = ler.next();
                    uno.setCor(cor);

                    System.out.println("Qual a modelo do seu veiculo?");
                    modelo = ler.next();
                    uno.setModelo(modelo);

                    System.out.println("Qual o ano do seu veiculo?");
                    ano = ler.nextInt();
                    uno.setAno(ano);

                    System.out.println(uno.getMarca());
                    System.out.println(uno.getCor());
                    System.out.println(uno.getModelo());
                    System.out.println(uno.getAno());



}

            
    }


