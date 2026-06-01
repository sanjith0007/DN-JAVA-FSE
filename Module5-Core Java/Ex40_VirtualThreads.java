class VirtualThreads {

    public static void main(String[] args)
            throws Exception {

        for(int countValue = 1;
            countValue <= 5;
            countValue++) {

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread Running");
            });
        }

        Thread.sleep(2000);
    }
}

/*
Output:
Virtual Thread Running
...
*/