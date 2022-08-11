public class Main {

    public static void main(String[] args) {
        Universidade universidade = new Universidade();

        universidade.imprimirNominais(universidade.listaPessoal);
        System.out.println(universidade.obterOrcamentoTotal(universidade.listaPessoal));

    }
}
