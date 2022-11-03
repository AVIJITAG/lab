package Lab_13_11_2022;

import java.util.ArrayList;
 public class Listloader {
public void loadList(Integer StartNumber, Integer lastNumber) {// method created
ArrayList<Integer> L = new ArrayList<>();
for (int i = StartNumber; i <= lastNumber; i++) {
L.add(i);
}
}
public static void main(String[] args) {
Listloader obj = new Listloader();
long StratTime = System.currentTimeMillis();
obj.loadList(0, 10000000);
long lastTime = System.currentTimeMillis();
long responcetime = lastTime - StratTime;
System.out.println("time taken for Exicution is " + responcetime);
}
}
 class LoaderThread implements Runnable {
int StartingNumber, LastNumber;
Listloader A = new Listloader();
public LoaderThread() {// default cons
super();
}
public LoaderThread(int startingNumber, int lastNumber) {// parametersied cons
super();
this.StartingNumber = startingNumber;
this.LastNumber = lastNumber;
}
@Override
public void run() {// run method
long StratTime = System.currentTimeMillis();// getting Starting time
A.loadList(StartingNumber, LastNumber);
long lastTime = System.currentTimeMillis();// getting last time
long responcetime = lastTime - StratTime;// getting responce time
System.out.println("time taken for Exicution is " + responcetime);
}
}
class MainThread {
public MainThread() {
super();
}
public static void main(String[] args) {// main method
LoaderThread T1 = new LoaderThread(0, 5000000);// passing values
LoaderThread T2 = new LoaderThread(5000000, 10000000);
T1.run();
T2.run();
}
}