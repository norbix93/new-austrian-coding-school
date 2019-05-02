package week2.exercise3;

public class Derek {

    public String setTool(Tool tool){

        return tool.getName();
    }

    public Boolean canHangPainting(Tool tool) {
        if (tool.getName() == "Hammer") {
            return true;
        }

        return false;
    }

    public Boolean hangPainting(Tool tool) {
        if (!canHangPainting(tool)) {
            System.out.println("The hammer is missing.");
        }
        else {
            System.out.println("You can hang the painting.");
        }
        return false;

    }
}
