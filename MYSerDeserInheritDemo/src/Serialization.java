import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Serialization {
        FileOutputStream fos;
        ObjectOutputStream oos;

        public void serializeCar(Car c){
            try {
                fos = new FileOutputStream("D:\\car.ser");
                oos = new ObjectOutputStream(fos);
                oos.writeObject(c);
                oos.flush();
                fos.close();
                oos.close();
            } catch (Exception e) {
                System.out.println("Exception is running..." + e.getMessage());
            }

        }
    }


