public class Main {
    public static void main(String[] args) {
        Raflebæger raflebæger = new Raflebæger(2);

        // Tildeler returværdi fra metodekald til variablen samletAntalØjne
        int samletAntalØjne = raflebæger.ryst();
        System.out.println(samletAntalØjne);
    }

}
