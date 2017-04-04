1.
public static String flip(){
    Random rand = new Random();
    int r = rand.nextInt(3);
    if(r < 2)
        return "heads";
    else
        return "tails";
}

2.
public static boolean arePermutations(int[] a, int[] b){
    a.sort();
    b.sort();
    if(Arrays.equals(a, b))
        return true;
    else return false;
}

3. 0, 1, 1, 0