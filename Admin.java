public class Admin extends PAS {


    public Admin(String nome, String dni, int horasExtra){
        super(nome, dni);

        this.horasSemana = 37;
        this.valHora = 750;
        this.horasExtra = horasExtra;
        this.saldoExtra = horasExtra * 600;
        this.salario = (horasSemana * valHora) * 4 + this.saldoExtra;

    }

}
