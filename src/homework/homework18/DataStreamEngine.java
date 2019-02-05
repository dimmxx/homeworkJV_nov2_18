package homework.homework18;

import java.io.*;

public class DataStreamEngine {


    public static void saveState(Pudge pudge) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pudge.bin"));
        oos.writeObject(pudge);
        oos.flush();
        oos.close();
    }


     public static Pudge loadState() throws IOException, ClassNotFoundException {
        Pudge pudgeClone = null;
        FileInputStream fis = new FileInputStream("pudge.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        pudgeClone = (Pudge) ois.readObject();
        fis.close();
        ois.close();


        return pudgeClone;
    }







}
