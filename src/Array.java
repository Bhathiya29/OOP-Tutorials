public class Array {

    private int [] items;
    private int count;


    public Array(int length){
        items=new int[length];
    }

    public void print(){
        for (int i=0; i< count;count++){
            System.out.println(items[i]);
        }
    }
    public void insert(int num){
        items[count]=num;
        count++;
    }
}