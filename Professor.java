public class Professor extends PDI{

    private int sexenio;
    private double salarioComAcresc;

    public Professor(String nome, String dni, int sexenio){
        super(nome, dni);
        this.sexenio = sexenio;
        this.horasSemana = 37;
        this.valHora = 800;
        this.salario = (valHora * horasSemana) * 4;

        if(sexenio <= 6) {
            salarioComAcresc = (salario + (sexenio * 10000));
        } else {
            salarioComAcresc = (salario + (6 * 10000));
        }

        this.salario = salarioComAcresc;

    }


}
