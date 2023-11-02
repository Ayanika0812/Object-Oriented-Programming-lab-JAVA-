class MultiplicationTableThread extends Thread {
    private int number;

    public MultiplicationTableThread(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

class Tables {
    public static void main(String[] args) {
        MultiplicationTableThread table5 = new MultiplicationTableThread(5);
        MultiplicationTableThread table7 = new MultiplicationTableThread(7);

        table5.start();
        table7.start();
    }
}