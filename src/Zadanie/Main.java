package Zadanie;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall();
        BlockClass block1 = new BlockClass("czerwony", "drewno");
        BlockClass block2 = new BlockClass("zielony", "beton");
        BlockClass block3 = new BlockClass("czerwony", "metal");
        BlockClass block4 = new BlockClass("czarny", "betno");

        wall.addBlock(block1);
        wall.addBlock(block2);
        wall.addBlock(block3);
        wall.addBlock(block4);

        CompositeBlockClass compositeBlock1 = new CompositeBlockClass("czarny", "drewno");
        CompositeBlockClass compositeBlock2 = new CompositeBlockClass("czerwony", "beton");
        CompositeBlockClass compositeBlock3 = new CompositeBlockClass("zielony", "metal");

        compositeBlock1.addBlock(block1);
        compositeBlock1.addBlock(block2);

        compositeBlock2.addBlock(block1);
        compositeBlock2.addBlock(block2);
        compositeBlock2.addBlock(compositeBlock1);

        compositeBlock3.addBlock(block1);
        compositeBlock3.addBlock(block3);
        compositeBlock3.addBlock(compositeBlock1);

        wall.addBlock(compositeBlock1);
        wall.addBlock(compositeBlock2);
        wall.addBlock(compositeBlock3);

        /**
         * Metoda findBlocksByColor
         */
        System.out.println(wall.findBlockByColor("czarny"));;
        /**
         * Metoda findBlocksByMaterial
         */
        System.out.println(wall.findBlocksByMaterial("betno"));
        /**
         * Metoda count
         */
        System.out.println(wall.count());
    }
}
