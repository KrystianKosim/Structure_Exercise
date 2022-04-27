package Zadanie;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall();
        BlockClass block1 = new BlockClass("czerwony", "drewno");
        BlockClass block2 = new BlockClass("zielony", "beton");
        BlockClass block3 = new BlockClass("czerwony", "metal");
        BlockClass block4 = new BlockClass("czarny", "betno");

        wall.getBlocks().add(block1);
        wall.getBlocks().add(block2);
        wall.getBlocks().add(block3);
        wall.getBlocks().add(block4);

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

        wall.getBlocks().add(compositeBlock1);
        wall.getBlocks().add(compositeBlock2);
        wall.getBlocks().add(compositeBlock3);

        /**
         * Metoda findBlocksByColor
         */
        wall.findBlockByColor("czerwony");
        /**
         * Metoda findBlocksByMaterial
         */
        wall.findBlocksByMaterial("drewno");
        /**
         * Metoda count
         */
        wall.count();
    }
}
