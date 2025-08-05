package intecbrussel.be;

public class ExampleJoin {
    public static void main(String[] args) {
        try{
            Thread studeren = new Thread(new MyThread(" Java"));
            Thread game = new Thread(new MyThread(" Mario"));
            Thread eten = new Thread(new MyThread(" Pasta"));

            studeren.start();
            //System.out.println(studeren.getState());

            studeren.join(1000);
            //System.out.println(studeren.getState());

            game.start();
            //System.out.println(game.getState());

            eten.start();
            //System.out.println(eten.getState());
            System.out.println(eten.isDaemon());
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
