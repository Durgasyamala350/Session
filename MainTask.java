package multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;public class MainTask
{
public static void main(String[] args)
{
// ExecutorService executorService = Executors.newCachedThreadPool();
ExecutorService executorService = Executors.newFixedThreadPool(3);
long startTime = System.nanoTime();
for(int i=0;i<18;i++) {
Future<Integer> result11 = executorService.submit(new CalculationTaskC());
}
executorService.shutdown();// catch(Exception e)
// {
// e.printStackTrace();
// }
long elapsedTime = System.nanoTime()-startTime;
double millisecond = ((elapsedTime/18)/1000);// 403 millisec
// double millisecond = ((elapsedTime/21)/1000);//400 millisec
// double millisecond = ((elapsedTime/12)/1000);//400 millisec
System.out.println("Time taken in millisecond to execute all the tasks " +millisecond);
}
}

