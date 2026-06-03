class MessageThread extends Thread {

    String threadText;

    MessageThread(String threadText) {
        this.threadText = threadText;
    }

    public void run() {

        for(int count = 1; count <= 5; count++) {
            System.out.println(threadText);
        }
    }
}

class ThreadCreation {

    public static void main(String[] args) {

        MessageThread firstThread = new MessageThread("Hello from Thread");
        firstThread.start();
    }
}