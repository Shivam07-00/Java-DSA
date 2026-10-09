package Stringlectures;

public class Shortest_Path {
    static float path(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            char dir = s.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float)Math.sqrt(X+Y);
    }
    public static void main(String[] args) {

        String pathh = "WNEENESENNN";
        float distance = path(pathh);

        System.out.println("Shortest Distance is = "+distance);
    }
}
