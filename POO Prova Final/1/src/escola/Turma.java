package escola;

public class Turma 
{
    private String info;
    private String codigo;
    private int periodo;
    private int ano;
    Materia materia;


    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPeriodo() {
        return periodo;
    }
    
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    
}
