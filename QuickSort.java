/**
 * Implémentation complète du Tri Rapide (QuickSort) en Java.
 * Algorithme de tri optimisé basé sur le principe 'Diviser pour régner'.
 */
public class QuickSort {

    /**
     * Méthode principale du tri rapide (Fonction récursive).
     * * @param arr Le tableau d'entiers à trier
     * @param low L'index de départ (début de la sous-partie)
     * @param high L'index de fin (fin de la sous-partie)
     */
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            // pivotIndex est l'index où le pivot est désormais à sa place définitive
            int pivotIndex = partition(arr, low, high);

            // Tri récursif des éléments à gauche du pivot
            sort(arr, low, pivotIndex - 1);

            // Tri récursif des éléments à droite du pivot
            sort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Place le pivot à sa bonne position et réorganise le tableau :
     * - Les éléments plus petits que le pivot vont à sa gauche.
     * - Les éléments plus grands que le pivot vont à sa droite.
     * * @param arr Le tableau à partitionner
     * @param low L'index de début
     * @param high L'index de fin (choisi comme pivot)
     * @return L'index final du pivot
     */
    private static int partition(int[] arr, int low, int high) {
        // Choix du dernier élément comme pivot
        int pivot = arr[high];
        
        // i pointe vers la limite des éléments inférieurs au pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Si l'élément actuel est plus petit ou égal au pivot
            if (arr[j] <= pivot) {
                i++;
                // Échange arr[i] et arr[j]
                swap(arr, i, j);
            }
        }

        // Place le pivot à sa position exacte juste après les éléments plus petits
        swap(arr, i + 1, high);

        return i + 1; // Retourne l'index absolu du pivot
    }

    /**
     * Méthode utilitaire pour permuter deux éléments dans un tableau.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Méthode de démonstration et de test.
     */
    public static void main(String[] args) {
        int[] data = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("--- DÉMONSTRATION DU TRI RAPIDE (QUICKSORT) ---");
        System.out.print("Tableau initial : ");
        afficherTableau(data);

        // Appel du tri sur l'ensemble du tableau
        sort(data, 0, data.length - 1);

        System.out.print("Tableau trié   : ");
        afficherTableau(data);
    }

    private static void afficherTableau(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}