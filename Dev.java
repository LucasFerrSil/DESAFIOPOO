package DESAFIOPOO;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Dev {
    private String nome;
    Set<Conteudo> conteudoInscritos = new LinkedHashSet();
    Set<Conteudo> conteudoConcluidos = new LinkedHashSet();

    public Dev(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }
    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }
    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getInscritos().add(this);
    };

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum Conteudo");
        } 
    };

    public double calcularTotalXp(){
        return this.conteudoConcluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
    }

    public String statusDev(){
        return "Nome: " + nome + "\nXP Adquirido: " + calcularTotalXp() + "\nCursos restantes: " + getConteudoInscritos() + "\nCursos concluídos: " + getConteudoConcluidos();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoInscritos == null) ? 0 : conteudoInscritos.hashCode());
        result = prime * result + ((conteudoConcluidos == null) ? 0 : conteudoConcluidos.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoInscritos == null) {
            if (other.conteudoInscritos != null)
                return false;
        } else if (!conteudoInscritos.equals(other.conteudoInscritos))
            return false;
        if (conteudoConcluidos == null) {
            if (other.conteudoConcluidos != null)
                return false;
        } else if (!conteudoConcluidos.equals(other.conteudoConcluidos))
            return false;
        return true;
    };


}
