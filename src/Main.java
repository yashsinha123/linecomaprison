public class Main {
    public static void main(String[] args){

        point p1 = new point(1,1);
        point p2 = new point(2,3);
        point p3 = new point(1,7);
        point p4 = new point(9,3);

        line l1 = new line(p1,p2);
        line l2 = new line(p3,p4);


        System.out.println("\n\nLength of line 1 is:"+l1.length);
        System.out.println("Length of line 2 is:"+l2.length);

        if(l1.length>l2.length){
            System.out.println("\nLength of 1st line is more than 2nd line");
        }
        else if(l1.length<l2.length){
            System.out.println("\nLength of 2nd line is more than 1st line");
        }
        else{
            System.out.println("\nBoth the lines are equal");
        }
    }


}