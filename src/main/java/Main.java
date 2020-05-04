import model.Block;

public class Main {


    public static void main(String[] args) {
        Block<String> blockOneTest = new Block<String>("Lucas", "");

        System.out.println(blockOneTest);

        Block<String> blockTwo = new Block<String>("lcx", blockOneTest.getPreviousHash());

        System.out.println(blockTwo);
    }

}
