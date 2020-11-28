package escola;

public class Aula extends Materia
{
    private int dia;
    private int mes;
    private int ano;
    private String data;

    private Horario horario;

    Aula(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        this.data = (
            Integer.toString(dia) + " / " + Integer.toString(mes)
            + " / " + Integer.toString(ano));
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }


    
}
