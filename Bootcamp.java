package DESAFIOPOO;
import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate datainicial = LocalDate.now();
    private final LocalDate datafinal = datainicial.plusDays(45);    
    Set<Dev> inscritos = new HashSet();
    Set<Conteudo> conteudos = new LinkedHashSet();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getDatainicial() {
        return datainicial;
    }
    public LocalDate getDatafinal() {
        return datafinal;
    }
    public Set<Dev> getInscritos() {
        return inscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setInscritos(Set<Dev> inscritos) {
        this.inscritos = inscritos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((datainicial == null) ? 0 : datainicial.hashCode());
        result = prime * result + ((datafinal == null) ? 0 : datafinal.hashCode());
        result = prime * result + ((inscritos == null) ? 0 : inscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
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
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (datainicial == null) {
            if (other.datainicial != null)
                return false;
        } else if (!datainicial.equals(other.datainicial))
            return false;
        if (datafinal == null) {
            if (other.datafinal != null)
                return false;
        } else if (!datafinal.equals(other.datafinal))
            return false;
        if (inscritos == null) {
            if (other.inscritos != null)
                return false;
        } else if (!inscritos.equals(other.inscritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }

    
    
}
