/**
 * Implémentation de l'algorithme de Recherche Binaire (Binary Search).
 * Ce script démontre la capacité à optimiser une recherche dans un tableau trié.
 */

public class BinarySearch{

    /**
     * Recherche un élémént dans un tableau trié.
     * @param arr le tableau trié dans lequel chercher 
     * @param target L'élément à trouver 
     * @return L'index de l'élément si trouvé, sinon -1
     */

    public static int search(int[] arr, int target){
        int left =0;
        int right = arr.length -1;

        while(left<=right){
            //Calcul du milieu optimisé pour éviter le dépassement de mémoire (overflow)
            int mid = left + (right-left) / 2;

            //Si l'élément est au milieu 
            if(arr[mid]==target){
                return mid;
            }

            //Si l'élément est plus grand, on ignore la moitié gauche
            if(arr[mid] < target){
                left = mid +1;
            }

            //Si l'élément est plus petit, on ignore la moitié droite
            else{
                right = mid - 1;
            }
        }

        //L'élément n'est pas présent dans le tableau
        return -1;
    }

    public static void main(String[] args) {
        //Le tableau doit être trié pour que la recherche binaire fonctionne 
        int[] data = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        System.out.println("Recherche de l'élément : "+ target);
        int result= search(data, target);

        if(result == -1){
            System.out.println("Elément non trouvé dans le tableau.");
        }
        else{
            System.out.println("Elémént trouvé à l'index : "+ result);
        }
    }
}