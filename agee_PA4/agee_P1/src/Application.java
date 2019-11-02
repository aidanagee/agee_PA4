public class Application {
    public static void main(String[] args){
        DuplicateRemover start = new DuplicateRemover();
        start.remove("problem1.txt");
        start.write("unique_words.txt");
    }
}
