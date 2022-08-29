import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();
        Cachorro cachorro1 = new Cachorro(10, "Malcom");
        Cachorro cachorro2 = new Cachorro(7, "Marshal");
        Cachorro cachorro3 = new Cachorro(1, "Lupan");
        cachorros.add(cachorro1);
        cachorros.add(cachorro2);
        cachorros.add(cachorro3);

        try{
            FileOutputStream fo = new FileOutputStream("outputCachorro.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            oos.writeObject(cachorros);
        }catch (FileNotFoundException f){
            throw new RuntimeException(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Cachorro> cachorros1 = null;
        try{
            FileInputStream fi = new FileInputStream("outputCachorro.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            cachorros1 = (List<Cachorro>) ois.readObject();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Cachorro cachorro: cachorros1 ) {
            System.out.println(cachorro.getNome() + " | " + cachorro.getIdade());
        }
    }
}
