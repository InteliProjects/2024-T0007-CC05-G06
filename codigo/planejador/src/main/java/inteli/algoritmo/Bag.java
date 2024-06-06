package inteli.algoritmo;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Bag é uma coleção que não é ordenada e permite elementos duplicados. É implementada como uma classe genérica.
 * @param <T> o tipo de elementos nesta bag
 */
public class Bag<T> implements Iterable<T> {
    private T[] array; // Array para armazenar elementos da bag
    private int size; // Número de elementos na bag

    /**
     * Constrói uma bag vazia.
     */
    public Bag() {
        array = (T[]) new Object[1]; // Inicializa o array com capacidade inicial de 1
        size = 0; // Inicializa o tamanho como 0
    }

    /**
     * Adiciona um item à bag.
     * @param item o item a ser adicionado
     */
    public void add(T item) {
        if (size == array.length) { // Se o array estiver cheio, redimensiona
            redimensionar(2 * array.length);
        }
        array[size++] = item; // Adiciona o item à bag
    }

    /**
     * Retorna o item no índice especificado.
     * @param index o índice do item a ser retornado
     * @return o item no índice especificado
     * @throws IllegalArgumentException se o índice estiver fora dos limites
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Índice fora dos limites");
        }
        return array[index]; // Retorna o item no índice especificado
    }

    /**
     * Retorna o número de itens na bag.
     * @return o número de itens na bag
     */
    public int size() {
        return size; // Retorna o tamanho da bag
    }

    /**
     * Redimensiona o array subjacente para a capacidade especificada.
     * @param capacidade a nova capacidade do array
     */
    private void redimensionar(int capacidade) {
        T[] copia = (T[]) new Object[capacidade]; // Cria um novo array com a capacidade especificada
        for (int i = 0; i < size; i++) {
            copia[i] = array[i]; // Copia os elementos do array antigo para o novo array
        }
        array = copia; // Atualiza a referência para o array
    }

    /**
     * Retorna um iterador sobre os elementos na bag.
     * @return um iterador sobre os elementos na bag
     */
    @Override
    public Iterator<T> iterator() {
        return new IteradorArray(); // Retorna uma nova instância de IteradorArray
    }

    /**
     * Implementação do iterador para a classe Bag.
     */
    private class IteradorArray implements Iterator<T> {
        private int indiceAtual = 0; // Índice do elemento atual sendo iterado

        /**
         * Retorna true se a iteração tiver mais elementos.
         * @return true se a iteração tiver mais elementos, false caso contrário
         */
        @Override
        public boolean hasNext() {
            return indiceAtual < size; // Verifica se o índice atual é menor que o tamanho
        }

        /**
         * Retorna o próximo elemento na iteração.
         * @return o próximo elemento na iteração
         * @throws NoSuchElementException se a iteração não tiver mais elementos
         */
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException(); // Lança exceção se não houver mais elementos
            }
            return array[indiceAtual++]; // Retorna o próximo elemento e avança para o próximo índice
        }
    }
    public static void main(String[] args) {

    }
}
