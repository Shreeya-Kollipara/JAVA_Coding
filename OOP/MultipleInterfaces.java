interface Camera {
    void click();
}

interface MusicPlayer {
    void play();
}

public class MultipleInterfaces implements Camera,MusicPlayer {
    public void click() {
        System.out.println("Photo clicked");
    }

    public void play() {
        System.out.println("Music playing");
    }

    public static void main(String[] args) {
        MultipleInterfaces phone=new MultipleInterfaces();

        phone.click();
        phone.play();
    }
}
