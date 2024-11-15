public abstract class Cafeteria{

public abstract void preparaBebida();
public abstract void adicionaCondimento();
public void aquecerAgua(){
    System.out.println("água aquecida");
}

public void colocarNaXicara(){
    System.out.println("bebida colocada na xícara");
}


public void preparaReceita(){ //template
    aquecerAgua();
    preparaBebida();
    colocarNaXicara();
    adicionaCondimento();
}



}