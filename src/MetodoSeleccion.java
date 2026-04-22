public class MetodoSeleccion {
    
    public void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n -1 ; i ++){
            int indiceDelMenor = i;
            for(int j = i + 1; j< n; j++){
                if (arr[indiceDelMenor] > arr[j]) {
                indiceDelMenor = j;
                }
            }
            if(i != indiceDelMenor){
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }

    }

    public void sortDes(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            int indeceDelMayor = i;
            for (int j = i +1; j < n; j++){
                if(arr[indeceDelMayor] < arr[j]){
                    indeceDelMayor = j;
                }
            }
            if(i != indeceDelMayor){
                int aux = arr[i];
                arr[i] = arr[indeceDelMayor];
                arr[indeceDelMayor] = aux;
            }
        }
    }
    public void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println();
    }

}
