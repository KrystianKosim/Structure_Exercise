package Zadanie;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall();
        BlockClass block1 = new BlockClass("czerwony", "drewno");
        BlockClass block2 = new BlockClass("zielony", "beton");
        BlockClass block3 = new BlockClass("czerwony", "metal");
        BlockClass block4 = new BlockClass("czarny", "betno");

        BlockClass block5 = new BlockClass("czarny", "betno");
        BlockClass block6 = new BlockClass("czarny", "betno");
        BlockClass block7 = new BlockClass("czarny", "betno");
        BlockClass block8 = new BlockClass("czarny", "betno");
        BlockClass block9 = new BlockClass("czarny", "betno");
        BlockClass block10 = new BlockClass("czarny", "betno");
        BlockClass block11 = new BlockClass("czarny", "betno");
        BlockClass block12 = new BlockClass("czarny", "betno");

        wall.addBlock(block1);
        wall.addBlock(block2);
        wall.addBlock(block3);
        wall.addBlock(block4);

        CompositeBlockClass compositeBlock1 = new CompositeBlockClass("czarny", "drewno");
        CompositeBlockClass compositeBlock2 = new CompositeBlockClass("czerwony", "beton");
        CompositeBlockClass compositeBlock3 = new CompositeBlockClass("zielony", "metal");
        CompositeBlockClass compositeBlock4 = new CompositeBlockClass("zielony", "metal");

        compositeBlock4.addBlock(block10);
        compositeBlock4.addBlock(block11);
        compositeBlock4.addBlock(block12);


        compositeBlock1.addBlock(block5);
        compositeBlock1.addBlock(block6);
        compositeBlock1.addBlock(compositeBlock4);

        compositeBlock2.addBlock(block7);
        compositeBlock2.addBlock(block8);

        compositeBlock3.addBlock(compositeBlock1);
        compositeBlock3.addBlock(compositeBlock2);
        compositeBlock3.addBlock(block9);

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
