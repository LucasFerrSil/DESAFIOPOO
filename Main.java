import DESAFIOPOO.*;
import DESAFIOPOO.Mentoria;
import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args){
        Conteudo curso1 = new Curso("Java", "Curso de Orientação a Objeto", 20);
        Conteudo curso2 = new Curso("Github", "Versionamento de código", 10);
        Conteudo mentoria = new Mentoria("Curriculo Competitivo", "Desenvolvimento de perfil no Linkedin", LocalDate.now());

        Bootcamp orangeTech = new Bootcamp("Orange Tech - Backend", "Bootcamp do banco Inter");
        orangeTech.getConteudos().add(curso1);
        orangeTech.getConteudos().add(curso2);
        orangeTech.getConteudos().add(mentoria);

        Dev dev1 = new Dev("Lucas");
        Dev dev2 = new Dev("Mateus");
        Dev dev3 = new Dev("Luana");
        Dev dev4 = new Dev("Maria");

        dev1.inscreverBootcamp(orangeTech);
        dev2.inscreverBootcamp(orangeTech);
        dev3.inscreverBootcamp(orangeTech);
        dev4.inscreverBootcamp(orangeTech);

        dev1.progredir();
        dev1.progredir();
        dev2.progredir();
        dev3.progredir();
        dev3.progredir();
        dev3.progredir();
        dev4.progredir();
        dev4.progredir();

        System.out.println(dev1.statusDev() + "\n" + dev2.statusDev() + "\n" + dev1.statusDev() + "\n" + dev2.statusDev());




    }
}
