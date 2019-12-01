/**
 * author: Louay Khalil
 */

public class Chars {
    public static char[] ALL_CHARS = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static int[] POINTS_SHAKE = {  1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    public static int[] POINTS_SCRUBBLE = {  9, 2, 2, 1, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
    public Chars() { }

    static int GETINDEX(char c){
        int index = -1;
        for(int i = 0; i < ALL_CHARS.length; i++){
            if(c == ALL_CHARS[i])
                index = i;
        }
        return index;
    }
}
