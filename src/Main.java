import br.com.lucas.screenmatch.calculos.CalculadoraDeTempo;
import br.com.lucas.screenmatch.modelos.Filme;
import br.com.lucas.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);


        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Avatar");
        meuFilme2.setAnoDeLancamento(2023);
        meuFilme2.setDuracaoEmMinutos(200);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

    }
}
