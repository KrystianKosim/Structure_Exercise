package Zadanie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompositeBlockClass implements CompositeBlock {

    private String color;
    private String material;
    private List<Block> blockList;

    public CompositeBlockClass(String color, String material) {
        this.color = color;
        this.material = material;
        blockList = new LinkedList<>();
    }

    void addBlock(Block block) {
        blockList.add(block);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blockList;
    }
}
