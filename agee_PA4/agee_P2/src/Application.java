public class Application {
    public static void main(String[] args){
        DuplicateCounter read = new DuplicateCounter();
        read.count("problem2.txt");
        read.write("unique_word_counts.txt");
    }
}
