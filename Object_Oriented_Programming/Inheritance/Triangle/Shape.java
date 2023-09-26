class Shape {
    
    //private data fields
    private String color;
    private boolean filled;
    
    //2 constructors with and without arguments
    public Shape() {
        
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    //getters setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
}
