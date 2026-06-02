class VirtualThreads {

    public static void main(String[] args)
            throws Exception {

        long normalStart =
                System.currentTimeMillis();

        Thread[] normalThreads =
                new Thread[1000];

        for(int i=0;i<1000;i++) {

            normalThreads[i] =
                    new Thread(() -> {});

            normalThreads[i].start();
        }

        for(Thread t : normalThreads) {
            t.join();
        }

        long normalEnd =
                System.currentTimeMillis();

        long virtualStart =
                System.currentTimeMillis();

        for(int i=0;i<100000;i++) {

            Thread.startVirtualThread(() -> {});
        }

        long virtualEnd =
                System.currentTimeMillis();

        System.out.println(
                "Traditional Threads Time = "
                + (normalEnd-normalStart)
                + " ms");

        System.out.println(
                "Virtual Threads Time = "
                + (virtualEnd-virtualStart)
                + " ms");
    }
}

/*
Output:
Traditional Threads Time = xxx ms
Virtual Threads Time = xxx ms
*/