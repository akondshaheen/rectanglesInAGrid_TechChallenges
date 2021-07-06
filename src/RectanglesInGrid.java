public class RectanglesInGrid {
    public int countRectangles(int m, int n){
        final int totalRectangles = m*n*(m+1)*(n+1)/4;
        System.out.println(totalRectangles);
        return totalRectangles;
    }
}
