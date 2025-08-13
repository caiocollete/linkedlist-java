package estrutura;

public class Lista {
    No inicio;
    No fim;

    public Lista() {}
    public void inicializar(){
        this.inicio = null;
        this.fim = null;
    }
    public void inserirNoInicio(int info){
        No nova = new No(null, inicio, info);
        if(inicio == null){
            fim = inicio = nova;
        }
        else{
            inicio.setAnt(nova);
            inicio = nova;
        }
    }
    public void inserirNoFim(int info){
        No nova = new No(fim, null, info);
        if(fim == null){
            inicio = fim = nova;
        }
        else{
            fim.setProx(nova);
            fim = nova;
        }
    }
    public void exibir(){
        No aux = inicio;
        while(aux != null){
            System.out.print(aux.getInfo());
            aux = aux.getProx();
        }
    }
    public No buscaExaustiva(int info){
        No aux = inicio;
        while(aux != fim && info != aux.getInfo()){
            aux = aux.getProx();
        }
        if(info == aux.getInfo()){
            return aux;
        }
        return null;
    }
    public void remover(int info){
        No aux = this.buscaExaustiva(info);
        if(aux != null){
            if(aux!=inicio && aux!=fim){
                aux.getAnt().setProx(aux.getProx());
                aux.getProx().setAnt(aux.getAnt());
            }
            else {
                if (aux == inicio) {
                    inicio = aux.getProx();
                    aux.getProx().setAnt(null);
                } else {
                    fim = aux.getAnt();
                    aux.getAnt().setProx(null);
                }
            }
        }
    }
}
