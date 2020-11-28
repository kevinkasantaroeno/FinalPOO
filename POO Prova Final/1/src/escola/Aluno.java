package escola;

import java.util.ArrayList;

public class Aluno extends Usuario
{
    private Turma turma;
    private String nomeDaMae;
    private String nomeDoPai;
    private String contatoDaMae;
    private String contatoDoPai;

    private  ArrayList<Double> notas = new ArrayList<Double>();

    Aluno(String nome, String matricula, String email, String tel)
    {
        super(nome,matricula,email, tel);

        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDoPai;
        this.contatoDaMae = contatoDaMae;
        this.contatoDoPai = contatoDoPai;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setContatoDaMae(String contatoDaMae) {
        this.contatoDaMae = contatoDaMae;
    }

    public String getContatoDaMae() {
        return contatoDaMae;
    }

    public void setContatoDoPai(String contatoDoPai) {
        this.contatoDoPai = contatoDoPai;
    }

    public String getContatoDoPai() {
        return contatoDoPai;
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
    public String getMatricula() {
        // TODO Auto-generated method stub
        return super.getMatricula();
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    

    public ArrayList<Double> getNotas() {
        return notas;
    }
}
