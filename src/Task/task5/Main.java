package Task.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String text = reader.readLine().toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if ((c >= 'a' && c <='z') || (c >= 'а' && c<='я')){
                map.compute(c, ((character, integer) -> integer == null ? 1 : integer+1));
            }
        }
        ArrayList<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
