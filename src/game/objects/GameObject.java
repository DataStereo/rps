package game.objects;

public class GameObject {
    private int id;
    private String name;
    private int[][] comparison = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameObject{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
