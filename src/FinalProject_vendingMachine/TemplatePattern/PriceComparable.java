package FinalProject_vendingMachine.TemplatePattern;

public interface PriceComparable {
    static void sort(Object[] a){
        Object aux[]=(Object[])a.clone();
        mergeSort(aux,a,0,a.length);

    }
    static void mergeSort(Object src[], Object dest[], int low, int high){
        for(int i=low;i<high;i++){
            for(int j=i;j>low&&((PriceComparable)dest[j-1]).compareTo((PriceComparable)dest[j])>0;j--){
                swap(dest, j, j-1);
            }

        }
        return;
    }
    static void swap(Object[]dest, int j, int i){
        Object temp=dest[i];
        dest[i]=dest[j];
        dest[j]=temp;
    }
    int compareTo(Object object);
}
