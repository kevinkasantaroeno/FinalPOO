package escola;
//Classe de heranla
import java.util.List;

public class Materia
{
    private String nome;
    private List <Nota> notas;
    private Aula aula;


    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
    
    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

}