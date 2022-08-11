public class Inform extends PAS {

    public Inform(String nome, String dni, int horasExtra){
        super(nome, dni);

        this.horasSemana = 40;
        this.valHora = 600;
        this.horasExtra = horasExtra;
        this.saldoExtra = horasExtra * 600;
        this.salario = (horasSemana * valHora) * 4 + this.saldoExtra;

    }
}
