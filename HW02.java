public class Sort {
    public static void heapSort(int[] array) {
        // построение кучи (перегруппируем массив)
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);
        // один за другим извлекаем элементы из кучи
        for (int i = array.length - 1; i >= 0; i--) {
            // перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; // инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; // левый ребенок
        int rightChild = 2 * rootIndex + 2; // правый ребеной
        // если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;
        // если правый дочерний элемент больше,
        // чем самый большой элемент на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;
        // Если самый большой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }
    }
}