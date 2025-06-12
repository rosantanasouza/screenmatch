public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.nome = "Matrix";
        filme1.anoDeLancamento = 1999;
        filme1.duracaoEmMinutos = 136;
        filme1.incluidoNoPlano = true;
        filme1.exibirFichaTecnica();


        Filme filme2 = new Filme();
        filme2.nome = "Interestelar";
        filme2.anoDeLancamento = 2014;
        filme2.duracaoEmMinutos = 169;
        filme2.incluidoNoPlano = false;
        filme2.exibirFichaTecnica();
    }
}