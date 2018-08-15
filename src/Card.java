public class Card {

    private final Color color;
    private final Value value;
    private boolean hidden = false;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void flip() {
        this.hidden = !this.hidden;
    }

    public String display(){
        if (hidden)
            return "HIDDEN";
        else
            return this.color + " " + this.value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color=" + color +
                ", value=" + value +
                '}';
    }
}
