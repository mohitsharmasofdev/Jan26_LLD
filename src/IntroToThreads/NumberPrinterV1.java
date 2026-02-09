package IntroToThreads;

public class NumberPrinterV1 implements Runnable {
    public int numberToPrint;

    public NumberPrinterV1(int input){
        this.numberToPrint = input;
    }

    @Override
    public void run() {
        print();
    }

    public void print(){
        System.out.println(
                "Number " + numberToPrint + " Thread : " + Thread.currentThread().getName()
        );
    }
}
