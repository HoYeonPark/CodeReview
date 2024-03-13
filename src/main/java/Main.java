import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements sortTool, AddOnFunction {

    @Override
    public void bubbleSort(ArrayList<Integer> lst){
        for(int cycle = 0 ;cycle < lst.size(); cycle ++) {
            for(int i = 0 ; i < lst.size() - 1 - cycle; i ++) {
                if(lst.get(i) > lst.get(i + 1)){
                    //swap
                    int tmp = lst.get(i);
                    lst.set(i, lst.get(i + 1));
                    lst.set(i + 1, tmp);
                }
            }
        }
    }

    @Override
    public void SelectionSort(ArrayList<Integer> lst) {
        for(int i = 0 ; i < lst.size(); i++) {
            for(int j = i + 1 ; j < lst.size(); j ++) {
                if(lst.get(i) > lst.get(j)){
                    int tmp = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, tmp);
                }
            }
        }
    }

    @Override
    public void insertNumber(ArrayList<Integer> lst, int n) {
        lst.add(n);
    }

    @Override
    public int ChooseSort() {
        System.out.println("Choose your sort.");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. 취소");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int timeOut = 100;
        while(n < 1 || n>3 || timeOut>0){
            System.out.println("Choose between 1~3 Number. ");
            n = sc.nextInt();
            timeOut--;
        }

        return n;
    }

    @Override
    public void ChoosingSortExe(ArrayList<Integer> lst, int n) {
        switch(n){
            case 1:
                bubbleSort(lst);
                break;
            case 2:
                SelectionSort(lst);
                break;
            default:
                break;
        }
    }

    @Override
    public void show(ArrayList<Integer> lst) {
        System.out.println(lst);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(3,3,3,2,1,1,2,3,2,1,2,3,1,2,3,2,1,5,5,2,1,7));
        //selectionSort(lst);
        //bubbleSort(lst); 
        System.out.println(lst);
    }

}