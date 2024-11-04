public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Kamil",10,120,100,60);
        Fighter f2 = new Fighter("Mücahit",20,85,85,50);
        Match match = new Match(f1,f2,120,80);
        match.run();
    }
}