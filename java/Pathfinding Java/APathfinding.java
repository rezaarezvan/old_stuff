import java.util.ArrayList;

public class APathfinding {
    private int size, diagonalMoveCost;
    private long runTime;
    private double kValue;
    private Frame frame;
    private Node startNode, endNode, par;
    private boolean diagonal, running, noPath, complete, trig;
    private ArrayList<Node> borders, open, closed, path;
    private Sort sort = new Sort();

    public APathfinding(int size) {
        this.size = size;

        diagonalMoveCost = (int) (Math.sqrt(2 * (Math.pow(size, 2))));
        kValue = Math.PI / 2;
        diagonal = true;
        trig = false;
        running = false;
        complete = false;

        borders = new ArrayList<Node>();
        open = new ArrayList<Node>();
        closed = new ArrayList<Node>();
        path = new ArrayList<Node>();
    }

    public APathfinding(Frame frame, int size) {
        this.frame = frame;
        this.size = size;

        diagonalMoveCost = (int) (Math.sqrt(2 * (Math.pow(size, 2))));
        kValue = Math.PI / 2;
        diagonal = true;
        trig = false;
        running = false;
        complete = false;

        borders = new ArrayList<Node>();
        open = new ArrayList<Node>();
        closed = new ArrayList<Node>();
        path = new ArrayList<Node>();
    }

    public APathfinding(Frame frame, int size, Node start, Node end) {
        this.frame = frame;
        this.size = size;
        startNode = start;
        endNode = end;

        diagonalMoveCost = (int) (Math.sqrt(2 * (Math.pow(size, 2))));
        diagonal = true;
        trig = false;
        running = false;
        complete = false;

        borders = new ArrayList<Node>();
        open = new ArrayList<Node>();
        closed = new ArrayList<Node>();
        path = new ArrayList<Node>();
    }

    public void start(Node s, Node e) {
        running = true;
        startNode = s;
        startNode.setG(0);
        endNode = e;

        // Lägger till startnoden i stängda listan
        addClosed(startNode);

        long startTime = System.currentTimeMillis();

        findPath(startNode);

        complete = true;
        long endTime = System.currentTimeMillis();
        runTime = endTime - startTime;
        System.out.println("Completed: " + runTime + "ms");
    }

    public void setup(Node s, Node e) {
        running = true;
        startNode = s;
        startNode.setG(0);
        par = startNode;
        endNode = e;

         // Lägger till startnoden i stängda listan
        addClosed(startNode);
    }

    public void setStart(Node s) {
        startNode = s;
        startNode.setG(0);
    }

    public void setEnd(Node e) {
        endNode = e;
    }

    public boolean isRunning() {
        return running;
    }

    public boolean isComplete() {
        return complete;
    }

    public Node getStart() {
        return startNode;
    }

    public Node getEnd() {
        return endNode;
    }

    public Node getPar() {
        return par;
    }

    public boolean isNoPath() {
        return noPath;
    }

    public boolean isDiagonal() {
        return diagonal;
    }

    public boolean isTrig() {
        return trig;
    }

    public void setDiagonal(boolean d) {
        diagonal = d;
    }

    public void setTrig(boolean t) {
        trig = t;
    }

    public void setSize(int s) {
        size = s;
        diagonalMoveCost = (int) (Math.sqrt(2 * (Math.pow(size, 2))));
    }

    public void findPath(Node parent) {
        Node openNode = null;

        if (diagonal) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    int possibleX = (parent.getX() - size) + (size * i);
                    int possibleY = (parent.getY() - size) + (size * j);

                    // Kollar för eventuella bordernoder som blockerar
                    int crossBorderX = parent.getX() + (possibleX - parent.getX());
                    int crossBorderY = parent.getY() + (possibleY - parent.getY());

                    // Kollar så att man inte kan "corner-cuta"
                    if (searchBorder(crossBorderX, parent.getY()) != -1
                    | searchBorder(parent.getX(), crossBorderY) != -1 && ((j == 0 | j == 2) && i != 1)) {
                        continue;
                    }

                    calculateNodeValues(possibleX, possibleY, openNode, parent);
                }
            }
        } 
        else if (!trig) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if((i == 0 && j == 0) || (i == 0 && j == 2) || 
                    (i == 1 && j == 1) || (i == 2 && j == 0) ||
                    (i == 2 && j == 2)) {
                        continue;
                    }
                    int possibleX = (parent.getX() - size) + (size * i);
                    int possibleY = (parent.getY() - size) + (size * j);

                    calculateNodeValues(possibleX, possibleY, openNode, parent);
                }
            }
        }
        else {
            for (int i = 0; i < 4; i++) {
                // Kollar runt i cirkel för parent noden
                int possibleX = (int) Math.round(parent.getX() + (-size * Math.cos(kValue * i)));
                int possibleY = (int) Math.round(parent.getY() + (-size * Math.sin(kValue * i)));

                calculateNodeValues(possibleX, possibleY, openNode, parent);
            }
        }

        // Lägger till parent noden, alltså den hitils bästa vägen
        parent = lowestFCost();

        if (parent == null) {
            System.out.println("NO PATH");
            noPath = true;
            running = false;
            frame.repaint();
            return;
        }

        if (Node.isEqual(parent, endNode)) {
            endNode.setParent(parent.getParent());

            connectPath();
            running = false;
            complete = true;
            frame.repaint();
            return;
        }

        // Tar bort parent noden från öppna listan och lägger till den i den ständga, alltså bästa vägen 1 nod fram
        removeOpen(parent);
        addClosed(parent);
        
        // Vad detta gör är att den kan korrigera den bästa vägen medans den kör, 
        // När en parent nod är val så kollar den även närliggande öppna noder
        
       
        if (diagonal) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) {
                        continue;
                    }
                    int possibleX = (parent.getX() - size) + (size * i);
                    int possibleY = (parent.getY() - size) + (size * j);
                    Node openCheck = getOpenNode(possibleX, possibleY);

                    
                    if (openCheck != null) {
                        int distanceX = parent.getX() - openCheck.getX();
                        int distanceY = parent.getY() - openCheck.getY();
                        int newG = parent.getG();

                        if (distanceX != 0 && distanceY != 0) {
                            newG += diagonalMoveCost;
                        } else {
                            newG += size;
                        }

                        if (newG < openCheck.getG()) {
                            int s = searchOpen(possibleX, possibleY);
                            open.get(s).setParent(parent);
                            open.get(s).setG(newG);
                            open.get(s).setF(open.get(s).getG() + open.get(s).getH());
                        }
                    }
                }
            }
        }
        if(!frame.showSteps()) {
            findPath(parent);
        }
        else {
            par = parent;
        }
    }

    public void calculateNodeValues(int possibleX, int possibleY, Node openNode, Node parent) {
        // Ifall den är utanför bordern
        if (possibleX < 0 | possibleY < 0 | possibleX >= frame.getWidth() | possibleY >= frame.getHeight()) {
            return;
        }

        // Ifall denna nod redan är en border, stängd eller redan öppen nod ska vi inte öppna den iget
        if (searchBorder(possibleX, possibleY) != -1 | searchClosed(possibleX, possibleY) != -1
        | searchOpen(possibleX, possibleY) != -1) {
            return;
        }
        // Skapar en öppen nod med X Y värde
        openNode = new Node(possibleX, possibleY);
        openNode.setParent(parent);

        int GxMoveCost = openNode.getX() - parent.getX();
        int GyMoveCost = openNode.getY() - parent.getY();
        int gCost = parent.getG();

        if (GxMoveCost != 0 && GyMoveCost != 0) {
            gCost += diagonalMoveCost;
        } else {
            gCost += size;
        }
        openNode.setG(gCost);

        // Kalkylerar H kostnaden
        int HxDiff = Math.abs(endNode.getX() - openNode.getX());
        int HyDiff = Math.abs(endNode.getY() - openNode.getY());
        int hCost = HxDiff + HyDiff;
        openNode.setH(hCost);

        // Kalkylerar F kostnaden
        int fCost = gCost + hCost;
        openNode.setF(fCost);

        addOpen(openNode);
    }

    public void connectPath() {
        if (getPathList().size() == 0) {
            Node parentNode = endNode.getParent();

            while (!Node.isEqual(parentNode, startNode)) {
                addPath(parentNode);

                for (int i = 0; i < getClosedList().size(); i++) {
                    Node current = getClosedList().get(i);

                    if (Node.isEqual(current, parentNode)) {
                        parentNode = current.getParent();
                        break;
                    }
                }
            }
            reverse(getPathList());
        }

    }

    public void addBorder(Node node) {
        if (borders.size() == 0) {
            borders.add(node);
        } else if (!checkBorderDuplicate(node)) {
            borders.add(node);
        }
    }

    public void addOpen(Node node) {
        if (open.size() == 0) {
            open.add(node);
        } else if (!checkOpenDuplicate(node)) {
            open.add(node);
        }
    }

    public void addClosed(Node node) {
        if (closed.size() == 0) {
            closed.add(node);
        } else if (!checkClosedDuplicate(node)) {
            closed.add(node);
        }
    }

    public void addPath(Node node) {
        if (path.size() == 0) {
            path.add(node);
        } else {
            path.add(node);
        }
    }

    public void removePath(int location) {
        path.remove(location);
    }

    public void removeBorder(int location) {
        borders.remove(location);
    }

    public void removeOpen(int location) {
        open.remove(location);
    }

    public void removeOpen(Node node) {
        for (int i = 0; i < open.size(); i++) {
            if (node.getX() == open.get(i).getX() && node.getY() == open.get(i).getY()) {
                open.remove(i);
            }
        }
    }

    public void removeClosed(int location) {
        closed.remove(location);
    }

    public boolean checkBorderDuplicate(Node node) {
        for (int i = 0; i < borders.size(); i++) {
            if (node.getX() == borders.get(i).getX() && node.getY() == borders.get(i).getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean checkOpenDuplicate(Node node) {
        for (int i = 0; i < open.size(); i++) {
            if (node.getX() == open.get(i).getX() && node.getY() == open.get(i).getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean checkClosedDuplicate(Node node) {
        for (int i = 0; i < closed.size(); i++) {
            if (node.getX() == closed.get(i).getX() && node.getY() == closed.get(i).getY()) {
                return true;
            }
        }
        return false;
    }

    public int searchBorder(int xSearch, int ySearch) {
        int Location = -1;

        for (int i = 0; i < borders.size(); i++) {
            if (borders.get(i).getX() == xSearch && borders.get(i).getY() == ySearch) {
                Location = i;
                break;
            }
        }
        return Location;
    }

    public int searchClosed(int xSearch, int ySearch) {
        int Location = -1;

        for (int i = 0; i < closed.size(); i++) {
            if (closed.get(i).getX() == xSearch && closed.get(i).getY() == ySearch) {
                Location = i;
                break;
            }
        }
        return Location;
    }

    public int searchOpen(int xSearch, int ySearch) {
        int Location = -1;

        for (int i = 0; i < open.size(); i++) {
            if (open.get(i).getX() == xSearch && open.get(i).getY() == ySearch) {
                Location = i;
                break;
            }
        }
        return Location;
    }

    public void reverse(ArrayList list) {
        int j = list.size() - 1;

        for (int i = 0; i < j; i++) {
            Object temp = list.get(i);
            list.remove(i);
            list.add(i, list.get(j - 1));
            list.remove(j);
            list.add(j, temp);
            j--;
        }
    }

    public Node lowestFCost() {
        if (open.size() > 0) {
            sort.bubbleSort(open);
            return open.get(0);
        }
        return null;
    }

    public ArrayList<Node> getBorderList() {
        return borders;
    }

    public ArrayList<Node> getOpenList() {
        return open;
    }

    public Node getOpen(int location) {
        return open.get(location);
    }

    public ArrayList<Node> getClosedList() {
        return closed;
    }

    public ArrayList<Node> getPathList() {
        return path;
    }

    public long getRunTime() {
        return runTime;
    }

    public void reset() {
        while(open.size() > 0) {
            open.remove(0);
        }

        while(closed.size() > 0) {
            closed.remove(0);
        }

        while(path.size() > 0) {
            path.remove(0);
        }
        noPath = false;
        running = false;
        complete = false;
    }

    public Node getOpenNode(int x, int y) {
        for (int i = 0; i < open.size(); i++) {
            if (open.get(i).getX() == x && open.get(i).getY() == y) {
                return open.get(i);
            }
        }
        return null;
    }

    public void printBorderList() {
        for (int i = 0; i < borders.size(); i++) {
            System.out.print(borders.get(i).getX() + ", " + borders.get(i).getY());
            System.out.println();
        }
        System.out.println("===============");
    }

    public void printOpenList() {
        for (int i = 0; i < open.size(); i++) {
            System.out.print(open.get(i).getX() + ", " + open.get(i).getY());
            System.out.println();
        }
        System.out.println("===============");
    }

    public void printPathList() {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(i + ": " + path.get(i).getX() + ", " + path.get(i).getY() + ": " + path.get(i).getF());
            System.out.println();
        }
        System.out.println("===============");
    }
}