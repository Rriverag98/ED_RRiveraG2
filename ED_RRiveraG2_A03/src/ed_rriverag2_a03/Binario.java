/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_rriverag2_a03;

/**
 *
 * @author Rodrigo
 */
public class Binario extends FetchClass implements Ordenamientos {
   
    
   int Fetch(int n) {
    int b = vector.length;
    int inicio,centro,fin;
    int valorCentro;    
    inicio = 0;
    fin = b-1;
    while (inicio<fin){
    centro = (inicio + fin)/2;
    valorCentro = vector[centro];
    if (valorCentro==n){
        return n;
    }
    if (n<vector[centro]){
        fin = centro-1;
    }
     if (n>vector[centro]){
        inicio = centro+1;
    }
    } return -1;
    }

    @Override
    int Fetch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seleccion() {
        for (int i = 0;i<vector.length;i++){
            int menor = i;
            for (int j =i+1;j<vector.length;j++){
                if (vector[j]<vector[menor]){
                    menor = j;
                }
            }
            int auxiliar = vector[i];
            vector[i]=vector[menor];
            vector[menor]=auxiliar;
        }
    }

    @Override
    public void insertion() {
       int temp;
       int j;
       for (int i=1;i<vector.length;i++){
            temp = vector[i];
            j = i-1;
           while ((j>=0)&&(vector[j]>temp)){
               vector[j+1]=vector[j];
               j--;
           }
           vector[j+1] = temp;
       }
    }
    
    public void burbuja(){
        for (int i = 1;i<vector.length;i++){
            for (int j=0;j<vector.length-1;j++){
                if (vector[j]>vector[j+1]){
                    intercambio(i,j);
                }
            }
        }
    }
    
    public void intercambio(int i, int j){
        int temp = vector[j];
        vector[j] = vector[j+1];
        vector[j+1] = temp;
    }

    @Override
    public void quickSort(int primero, int ultimo) {
        int i,j,pivot;
        i = primero; j = ultimo;
        pivot = vector[(i+j)/2];
        while(vector[i]<pivot){
            i++;
        }
        while(vector[j]>pivot){
            j--;
        }
        if (i<=j){
            intercambio(j,i);
            i++; j--;
        }
        while (i<=j){
            if (primero<j){
                quickSort(primero,j);
            }
            if (ultimo>j){
                quickSort(i,ultimo);
            }
        }
    }
    
    public void merge(int primero, int pivot, int ultimo)
    {
        int n1 = pivot - primero + 1;
        int n2 = ultimo - pivot;
        
        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = vector[primero + i];
        for (int j=0; j<n2; ++j)
            R[j] = vector[pivot + 1+ j];
 
        int i = 0, j = 0;

        int k = primero;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                vector[k] = L[i];
                i++;
            }
            else
            {
                vector[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            vector[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            vector[k] = R[j];
            j++;
            k++;
        }
    }

   @Override
    public void mergeSort( int primero, int ultimo)
    {
        if (primero < ultimo)
        {
            int pivot = (primero+ultimo)/2;
 
            mergeSort(primero, pivot);
            mergeSort(pivot+1, ultimo);
 
            merge(primero, pivot, ultimo);
        }
    }
  
      
    
}
