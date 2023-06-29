public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max){
        a =  new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int j = 0; j < nElems; j++){
            System.out.print(a[j] + " ");
            // System.out.println();
        }
    }

    public void bubbleSort(){
        int out, in;

        for(out = nElems - 1; out > 1; out --){
            for(in = 0; in < out; in++){
                if(a[in] > a[in + 1]){
                    swap(in, in + 1);
                }
            }
        }
    }

    // 7 1 10
    // 1 7 10

    // out = 2; out > 1; out --
    // in = 0; in < 3; in ++

    // in = 1; in < 3; in++
    // if(a[1] > a[2])
    // false

    // in = 2; in < 2; in ++
    // false

    // if(a[0]) > a[1])
    // 7 > 1 = true
    // swap(0 , 1)

    // swap
    // swap(0,1)
    // temp = 7
    // a[0] = a[1]
    // 7 1 10 = 1 1 10
    // a[1] =   7

    // 1 7 10


    public void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public static void main(String[] args) {
        int maxSize = 100;
        
        ArrayBub arr = new ArrayBub(maxSize);

        arr.insert(4);
        arr.insert(2);
        arr.insert(19);
        arr.insert(1);
        arr.insert(3);

        arr.display();
        System.out.println();

        arr.bubbleSort();
        arr.display();
    }
    
}