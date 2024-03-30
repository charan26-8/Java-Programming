//By implements ruunable interface
class Multi implements Runnable {
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Multi m = new Multi();
        Thread t = new Thread(m);
        t.start();
    }
}


