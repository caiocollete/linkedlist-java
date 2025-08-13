import estrutura.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirNoInicio(6);
        lista.inserirNoInicio(5);
        lista.inserirNoInicio(4);
        lista.inserirNoInicio(3);
        lista.inserirNoInicio(1);
        lista.inserirNoFim(2);
        lista.exibir();
        lista.remover(4);
        lista.exibir();
        lista.remover(1);
        lista.exibir();
        lista.remover(2);
        lista.exibir();
    }
}