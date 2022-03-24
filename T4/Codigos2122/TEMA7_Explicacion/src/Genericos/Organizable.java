package Genericos;

public interface Organizable<S,V> {

    void organizar(S criterio);
    V listar();
}
