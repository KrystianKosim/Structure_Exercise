package Zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall();

        Block block1 = new Block() {
            @Override
            public String getColor() {
                return "czerwony";
            }

            @Override
            public String getMaterial() {
                return "metal";
            }
        };

        Block block2 = new Block() {
            @Override
            public String getColor() {
                return "czarny";
            }

            @Override
            public String getMaterial() {
                return "drewno";
            }
        };

        CompositeBlock compositeBlock = new CompositeBlock() {
            @Override
            public List<Block> getBlocks() {
                List<Block> list = new ArrayList<>();
                list.add(block1);
                list.add(block2);
                return list;
            }

            @Override
            public String getColor() {
                return "zielony";
            }

            @Override
            public String getMaterial() {
                return "drewno";
            }
        };

        wall.blocks.add(block1);
        wall.blocks.add(block2);
        wall.blocks.add(compositeBlock);
        System.out.println(wall.findBlockByColor("czerwony"));
        List<Block> list = wall.findBlocksByMaterial("drewno");
        System.out.println();
        for (Block b : list) {
            System.out.println(b);
        }
        System.out.println(wall.count());

    }
}
