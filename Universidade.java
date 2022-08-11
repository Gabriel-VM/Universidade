

public class Universidade {

    Professor prof1 = new Professor("Marcos", "88005599",0);
    Professor prof2 = new Professor("Valeria", "9887565", 3);
    Investigador invest1 = new Investigador("David", "455720");

    Admin admin1 = new Admin("Pedro", "9090455", 0);
    Admin admin2 = new Admin("Patricia", "3360899", 10);
    Inform inform1 = new Inform("Sonia", "1234567", 5);
    Inform inform2 = new Inform("Alvaro", "890762", 0);

    Pessoal[] listaPessoal = {prof1, prof2, admin1, admin2, inform1, inform2};

    public static void imprimirNominais(Pessoal[] listaPessoal){

        for(int i = 0; i < listaPessoal.length; i++){
            System.out.println(listaPessoal[i].getNome() + " " + "/" + " " + listaPessoal[i].getClass().getSimpleName() + " " + "/" + " " + listaPessoal[i].getSalario()/100);
        }

    }

    public static double obterOrcamentoTotal(Pessoal[] listaPessoal){

        double orcamento = 0;

        for (int i = 0; i < listaPessoal.length; i ++) {
            orcamento += listaPessoal[i].getSalario();
        }

        return orcamento / 100;
    }

}
