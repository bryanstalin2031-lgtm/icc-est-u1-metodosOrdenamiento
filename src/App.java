public class App {
    public static void main(String[] args) throws Exception {
        // runmetodoBurbuja();
        runMetodoBurbujaAvanzado();
       
    }

    public static void runMetodoBurbujaAvanzado() {
        int[] arreglo = new int[]{50,5,20,30,0,-10,15};
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        mBurbujaAvanzado.imprimirArreglo();
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.imprimirArreglo();
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.imprimirArreglo();
    }

    /**public static void metodoBurbuja(){
        System.out.println("Metodo Burbuja");
        int[] arreglo = new int[]{10,-5,0,2,7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenerAscendente();
        metodoBurbuja.imprimirArreglo();
        metodoBurbuja.ordenerDescendente();
        metodoBurbuja.imprimirArreglo();


    }**/
}
