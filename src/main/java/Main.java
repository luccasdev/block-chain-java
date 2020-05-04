import model.Block;

public class Main {


    public static void main(String[] args) {
        Block<String> firstBlock = new Block<>("R$ 1200.00", null);

        Block<String> secondBlock = new Block<>("R$ 3000.00", firstBlock.getHash());

        System.out.println(firstBlock.toString());

        System.out.println(secondBlock.toString());
    }

}
