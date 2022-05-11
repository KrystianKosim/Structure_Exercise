package Zadanie;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks = new LinkedList<>();



    @Override
    public Optional<Block> findBlockByColor(String color) {
        List<Block> list = findBlockByColor(blocks,color);
        return list.stream().findAny();
    }

    private List<Block> findBlockByColor(List<Block> list, String color) {
        List<Block> replacementList = new LinkedList<>();
        for (Block block : list) {
            if (block instanceof CompositeBlockClass) {
                CompositeBlockClass compositeBlock = (CompositeBlockClass) block;
                List<Block> compositeBlockList = compositeBlock.getBlocks();
                replacementList.addAll(findBlockByColor(compositeBlockList, color));
            } else if (block.getColor().equals(color)) {
                replacementList.add(block);
            }
        }
        return replacementList;
    }


    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return findBlocksByMaterial(blocks,material);
    }

    private List<Block> findBlocksByMaterial(List<Block> list, String material) {
        List<Block> replacementList = new LinkedList<>();
        for (Block block : list) {
            if (block instanceof CompositeBlockClass) {
                CompositeBlockClass compositeBlock = (CompositeBlockClass) block;
                List<Block> compositeBlockList = compositeBlock.getBlocks();
                replacementList.addAll(findBlocksByMaterial(compositeBlockList, material));
            } else if (block.getMaterial().equals(material)) {
                replacementList.add(block);
            }
        }
        return replacementList;
    }


    @Override
    public int count() {
        return count(getBlocks());
    }

    private int count(List<Block> blockList) {
        int count = 0;
        for (Block block : blockList) {
            count++;
            if (block instanceof CompositeBlockClass) {
                CompositeBlockClass compositeBlock = (CompositeBlockClass) block;
                count += count(compositeBlock.getBlocks());
            }
        }
        return count;
    }


    public List<Block> getBlocks() {
        return blocks;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }
}