import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

interface sort{
    public void run(ArrayList<Integer> lst);
}

class bubbleSort implements sort{

    @Override
    public void run (ArrayList<Integer> lst){
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
}

class selectionSort implements sort{
    @Override
    public void run(ArrayList<Integer> lst) {
        for (int i = 0; i < lst.size(); i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i) > lst.get(j)) {
                    int tmp = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, tmp);
                }
            }
        }
    }
}

class sortPrinter{
    sort sort;
    ArrayList<Integer> lst = new ArrayList<>();

    public sortPrinter(ArrayList<Integer> lst) {
        this.lst = lst;
    }

    public void insertNumber(int n){
        lst.add(n);
    }

    public void chooseSort(sort sort){
        this.sort = sort;
    }

    public void run(){
        sort.run(lst);
    }

    public void show() {
        System.out.println(lst);
    }

}

public class Main  {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(3,3,3,2,1,1,2,3,2,1,2,3,1,2,3,2,1,5,5,2,1,7));
        //selectionSort(lst);
        //bubbleSort(lst);

        sortPrinter sPrinter = new sortPrinter(lst);
        sort bubble = new bubbleSort();
        sort selection = new selectionSort();

        sPrinter.show();
        sPrinter.insertNumber(444);
        sPrinter.show();
        sPrinter.chooseSort(bubble);
        sPrinter.show();
        sPrinter.run();
        sPrinter.show();

        sPrinter = new sortPrinter(lst);
        sPrinter.show();
        sPrinter.insertNumber(666);
        sPrinter.show();
        sPrinter.chooseSort(selection);
        sPrinter.show();
        sPrinter.run();
        sPrinter.show();

    }

}