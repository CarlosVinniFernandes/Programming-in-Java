import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");


        list.remove(1);
        for(String nomes : list){
            System.out.println(nomes);
        }
       
        System.out.println("---------------------------------");
        //list.removeIf(x -> x.charAt(0) == 'M');
        
        list.indexOf("Bob");
        for(String nomes : list){
            System.out.println(nomes);
        }
  
        System.out.println("---------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String nomess: result){
            System.out.println(nomess);
        }
    
        System.out.println("---------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("Teste > " + name);
    
    
    
    
    
    
    
    
    }
}
