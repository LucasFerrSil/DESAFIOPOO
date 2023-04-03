package DESAFIOPOO;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    
    public Mentoria(String titulo, String descricao, LocalDate data){
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
    public String toString(){
        return "Titulo: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nData: " + data; 
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
