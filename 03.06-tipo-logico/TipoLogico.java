public class TipoLogico  {
    public static void main(String[] args) {

        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa: " + variavelFalsa);

        System.out.println("--------------------------------------");

        Integer idade = 20;

        Boolean podeTirarCarteira = idade >= 18;

        if(podeTirarCarteira){
            System.out.println("Sim! Ele(a) pode tirar a carteira!");
        }else {
            System.out.println("Não! Ele(a) não pode tirar a carteira!");
        }
    }
}