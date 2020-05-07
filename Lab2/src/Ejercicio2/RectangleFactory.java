package Ejercicio2;

/**
 *
 * @author Marcell Granados
 */
public class RectangleFactory implements RectangleInterface{

    @Override
    public Rectangle newRectangle(int high, int width, int x, int y) {
        if (high > 0 && width > 0 && x > 0 && y > 0) {
            if (x+y / high > 0) {
                if (x+y - width> 0) {
                    return new Rectangle(high, width, x, y);
                }
            }
        }
        return null;
    }
    
//    @Override
//    public Rectangle newRectangle(int high, int width, int x, int y) {
//        Rectangle r = new Rectangle(high, width, x, y);
//        try {
//            return validation(r);
//        } catch (MuralException e) {
//            System.out.println(e.getMessage());
//        }
//        
//    }
//    
//    public Rectangle validation(Rectangle r) throws MuralException{
//        if (r.getHigh() > 0 && r.getWidth()> 0 && r.getX()> 0 && r.getY()> 0) {
//            if (r.getX()+r.getWidth() / r.getHigh() > 0) {
//                if (r.getX()+r.getWidth() / r.getWidth()> 0) {
//                    return r;
//                }
//            }
//        }
//        throw new MuralException("dd");
//    }
}
