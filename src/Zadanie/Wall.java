package Zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private List<Block> blocks = new ArrayList<>();


    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(s -> s.getColor().equals(color))
                .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream().filter(block -> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return count(blocks);
    }

    private int count(List<Block> blockList) {
        int count = 0;
        for (Block block : blockList) {
            if (block.getClass() == CompositeBlockClass.class) {
                CompositeBlockClass compositeBlock = (CompositeBlockClass) block;
                count += count(compositeBlock.getBlocks());
            } else {
                count++;
            }
        }
        return count;
    }


    public List<Block> getBlocks() {
        return blocks;
    }
}