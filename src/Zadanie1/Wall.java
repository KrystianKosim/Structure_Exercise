package Zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    List<Block> blocks;

    public Wall() {
        blocks = new ArrayList<>();
    }

    @Override
    public Optional findBlockByColor(String color) {
        return blocks.stream()
                .filter(s -> s.getColor().equals(color))
                .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(s -> s.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        int countOfBlocks = 0;
        for (int i = 0; i < blocks.size(); i++) {
            if (blocks.get(i) instanceof CompositeBlock) {
                int sizeOfCompositeBlock = ((CompositeBlock) blocks.get(i)).getBlocks().size();
                countOfBlocks += sizeOfCompositeBlock;
            } else {
                countOfBlocks++;
            }
        }
        return countOfBlocks;
    }
}