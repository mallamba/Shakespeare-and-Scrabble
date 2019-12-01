/**
 * author: Louay Khalil
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextFile {

    public TextFile() { }


    public ArrayList<String> readFile(String path) {
        String line;
        ArrayList<String> ordLista = new ArrayList<String>();
        try {
            BufferedReader input = new BufferedReader(new FileReader(path));

            if (!input.ready()) {
                throw new IOException();
            }

            while ((line = input.readLine()) != null) {
                ordLista.add(line);
            }
            input.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        return ordLista;
    }

    public Map<String, Integer> fill_h_Map(ArrayList arr){
        Map<String, Integer> hMap = new HashMap<>();
        for(int i = 0; i < arr.size(); i++){
            String word = arr.get(i).toString().toLowerCase();
            int sum = 0;
            for(int z = 0; z < word.length(); z++ ){
                sum += Chars.POINTS_SHAKE[ Chars.GETINDEX( word.charAt(z) ) ];
            }
            hMap.put(word, sum);
        }
        return hMap;
    }

    public Map highest_3_SumWords(Map map){
        Map<String, Integer> hMap = new HashMap<>();
        List<String> keys = new ArrayList<String>( map.keySet() );
        for(int i = 0; i < 3; i++){
            hMap.put( keys.get(i), (int) map.get( keys.get(i) ) );
        }
        return hMap;
    }

    public Map highest_common_3_SumWords(Map map, ArrayList<String> arr){
        Map<String, Integer> hMap = new HashMap<>();
        List<String> keys = new ArrayList<String>(  map.keySet() );
        int counter = 0;
        for(int i = 0; i < keys.size(); i++){
            if(counter < 3) {
                for(int x = 0; x < arr.size(); x++){
                    if( keys.get(i).equals( arr.get(x) ) ) {
                        hMap.put( keys.get(i), (int) map.get( keys.get(i) ) );
                        counter++;
                        x = arr.size() +1;
                    }
                }
            }
            else
                i = arr.size() +1;
        }
        return hMap;
    }

    public HashMap<String, Integer> sortByValue(Map<String, Integer> hMap)
    {
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<String, Integer> tempMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entryList : list) {
            tempMap.put(entryList.getKey(), entryList.getValue());
        }
        return tempMap;
    }


}
