import java.util.Scanner;

public class App {
        // class Principal faz de conta que e veiculo
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // criar a herança 

            Scanner ler = new Scanner (System.in);

            Veiculo uno = new Veiculo();
            Carro tesla = new Carro();
            Moto honda = new Moto();


            String marca, modelo, cor;
            int ano;

            // System.out.println("Qual a Marca do seu Veiculo");
            // uno = marca.next();
            // System.out.println("Qual a Modelo do seu Veiculo");
            // uno = modelo.next();
            // System.out.println("Qual a cor do seu Veiculo");
            // uno = cor.next();
            // System.out.println("Qual a Ano do seu Veiculo");
            // uno = ano.nextInt();

            marca = ler.next();
            uno.setMarca(marca);
            modelo  = ler.next();
            uno.setModelo(modelo);
            cor = ler.next();
            uno.setCor(cor);
            ano = ler.nextInt();
            uno.setAno(ano);

            System.out.println(uno.getMarca());
            System.out.println(uno.getModelo());
            System.out.println(uno.getCor());
            System.out.println(uno.getAno());


    }
}

