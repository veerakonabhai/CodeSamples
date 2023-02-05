package Java_CS;

/* move n disks from A to B using C as auxiliary */
public class TowersOfHanoi{

    public static void main(String []args){
        towersOfHanoi(4, 'A', 'B', 'C');
    }
    //(number of pegs, frompeg, topeg, auxpeg)
    private static void towersOfHanoi(int n, char a, char b, char c) {
        if(n==1){ //base case - terminating at top disk
            //move top disk from frompeg to topeg
            System.out.println("Move disk 1 from peg "+a+" to peg "+b);
            return;
        }
        //move top n-1 from frompeg to auxpeg using topeg as auxiliary
        towersOfHanoi(n-1, a, c, b);
        //move remianing disk from frompeg to topeg
        System.out.println("Move disk form peg "+a+" to peg "+b);
        //move back n-1 disks from auxpeg to topeg using frompeg as auxiliary
        towersOfHanoi(n-1, c, b, a);

    }
}