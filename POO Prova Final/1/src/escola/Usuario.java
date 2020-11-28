package escola;
//Classe de Herança
public class Usuario 
{
    private String nome;
    private String matricula;
    private String email;
    private String tel;

    Usuario(String nome, String matricula, String email, String tel)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    




 
}
