package escola;

public class Horario 
{

    private String h_final;
    private String h_inicio;

    Horario(String hi, String hf)
    {
        this.h_final = hi;
        this.h_inicio = hf;
    }

    public void setH_final(String h_final) {
        this.h_final = h_final;
    }

    public String getH_final() {
        return h_final;
    }

    public void setH_inicio(String h_inicio) {
        this.h_inicio = h_inicio;
    }

    public String getH_inicio() {
        return h_inicio;
    }
    
}
