package escola;

import java.util.List;
import java.util.Set;

public class Professor extends Usuario
{
    private List<Turma> turmas;
    private List<Materia> materias;
    private String departamento;


    Professor(String nome, String matricula, String email, String tel, String departamento)
    {
        super(nome, matricula, email, tel);
        this.departamento = departamento;
    }

    public List<Turma>geTurmas()
    {
        return turmas;
    }

    public void setTurmas(List<Turma>turmas)
    {
        this.turmas = turmas;
        
    }

    public void setMaterias(List<Materia> materias)
    {
        this.materias = materias;
    }


    @Override
    public void setEmail(String email) {
        // TODO Auto-generated method stub
        super.setEmail(email);
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return super.getEmail();
    }

    @Override
    public void setMatricula(String matricula) {
        // TODO Auto-generated method stub
        super.setMatricula(matricula);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public String getMatricula() {
        // TODO Auto-generated method stub
        return super.getMatricula();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }



    
}
