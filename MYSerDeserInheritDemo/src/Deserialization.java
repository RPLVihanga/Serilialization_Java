import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    FileInputStream fis;

    ObjectInputStream ois;

    public void deserializeCar(){
        try {
            fis = new FileInputStream("D:\\car.ser");
            ois = new ObjectInputStream(fis);
            Car c = (Car)ois.readObject();
            System.out.println(c.toString());
        } catch (Exception e) {
            System.out.println("Exception is running... " +e.getMessage());
        }
    }
}
