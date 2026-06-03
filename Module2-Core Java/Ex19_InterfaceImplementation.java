interface Playable {
    void play();
}

class Guitar implements Playable {

    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {

    public void play() {
        System.out.println("Playing Piano");
    }
}

class InterfaceImplementation {

    public static void main(String[] args) {

        Guitar guitarObj = new Guitar();
        Piano pianoObj = new Piano();

        guitarObj.play();
        pianoObj.play();
    }
}

/*
Output:
Playing Guitar
Playing Piano
*/