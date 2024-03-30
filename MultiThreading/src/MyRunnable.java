class MyRunnable implements Runnable {

        private String name;
        MyRunnable(String name){
            this.name=name;
        }
        public void run() {
            System.out.println("Start thread =" + name);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("Ended thread =" + name);
        }



    }

