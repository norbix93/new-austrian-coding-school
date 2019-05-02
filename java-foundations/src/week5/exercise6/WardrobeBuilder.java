package week5.exercise6;

import java.util.List;

public class WardrobeBuilder {


    public List build() {
        Wardrobe wardrobe = new Wardrobe();
        AddTop addTop = new AddTop();
        AddSide addSide = new AddSide();
        AddBack addBack = new AddBack();
        AddDoor addDoor = new AddDoor();
        AddBottom addBottom = new AddBottom();
        AddShelf addShelf = new AddShelf();
        addTop.perform(wardrobe, 1);
        addSide.perform(wardrobe, 2);
        addBack.perform(wardrobe, 1);
        addDoor.perform(wardrobe, 2);
        addBottom.perform(wardrobe, 1);
        addShelf.perform(wardrobe, 8);
        return wardrobe.parts;
    }
}
