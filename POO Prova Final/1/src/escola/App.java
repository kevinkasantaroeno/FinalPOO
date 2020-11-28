package escola;

public class App {

    private static Aluno a;
    private static Professor p;

    public static void main(String[] args) throws Exception 
    {
        System.out.println("teste");

        a = new Aluno("Alisson", "2019123213", "alissondelas@gmail.com","21312-12312");
        p = new Professor("Denisson", "12311", "denisopimenta@gmail.com", "223123-12312", "Engenharia da Computação");


         System.out.println(a.getMatricula()+"\n"+p.getEmail());
    

        
    }
}
