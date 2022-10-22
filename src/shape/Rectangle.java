package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length; 
    private int breadth; 
    
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public int getArea() { 
        return length*breadth; // write code to calculate area here
    } 
    // traine
    // add new method in new brang (forprimeter)
    public int getPrimeter(){
        return 2*(length+breadth);
    }
    // write code to calculate perimeter here
    // getPerimeter()
    
}