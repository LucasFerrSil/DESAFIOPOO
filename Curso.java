package DESAFIOPOO;

public class Curso extends Conteudo{
    int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria){
        setTitulo(titulo);
        setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public String toString(){
        return "Titulo: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nCarga Horária: " + cargaHoraria; 
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}

