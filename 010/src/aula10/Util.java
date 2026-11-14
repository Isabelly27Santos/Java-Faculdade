package aula10;

public class Util {

    public static final int tamanho = 20;  //constante

    public static boolean cpfValido (String cpf) {  //utilizo método diretamente
        if(cpf.length() > tamanho)
            return false;
        else {
            return true;
        }
    }

    public void mensagem() {
        System.out.println("Mensagem");  //precisa criar objeto com o new para usar 
    }

}
