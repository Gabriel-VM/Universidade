public abstract class Pessoal {

    protected String nome;
    protected String dni;
    protected int horasSemana;
    protected double valHora;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public String getDNI() {
        return dni;
    }

    public int getHorasSemana() {
        return horasSemana;
    }

    public double getValHora() {
        return valHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDNI(String DNI) {
        this.dni = DNI;
    }

    public void setHorasSemana(int horaSemana) {
        this.horasSemana = horaSemana;
    }

    public void setValHora(double valHora) {
        this.valHora = valHora;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    Pessoal(String nome, String dni) {
        this.nome = nome;
        this.dni = dni;

    }

}
