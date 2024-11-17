import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> s=new HashSet<>();
        s.add("Павло");
        s.add("Іван");
        s.add("Павло");
        s.add("Павло");
        s.add("Марія");
        s.add("Олег");
        System.out.println("Ім'я: " + s);
        System.out.println("Унікальні імена: " + s.size());

        System.out.println("Чи є імя Юлія? " + s.contains("Юлія"));

        HashMap<String,String> map=new HashMap<String, String>();
        map.put("Анатолій", "0956456877");
        map.put("Марта", "0432222466");
        map.put("Артем", "0917453629");
        map.put("Ольга", "0906657392");

        System.out.println("Пошук номера за ім'ям: " + map.get("Артем"));

        map.remove("Марта");
        System.out.println("Видалення запису за ім'ям: " + map);

    }
}