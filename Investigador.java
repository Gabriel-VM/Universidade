public class Investigador extends PDI{

    public Investigador(String nome, String dni){
        super(nome, dni);

        this.horasSemana = 35;
        this.valHora = 700;
        this.salario = (horasSemana * valHora) * 4;

    }
}
