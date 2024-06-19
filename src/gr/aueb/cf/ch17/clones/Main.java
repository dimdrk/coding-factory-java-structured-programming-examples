package gr.aueb.cf.ch17.clones;

import java.io.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");

        City clonedAthens = athens.clone();
        clonedAthens.setDescription("Paris");

        System.out.println(athens);
        System.out.println(clonedAthens);

        Trainee alice = new Trainee("Alice", new City("Athens"));
        Trainee clonedAlice = alice.clone();

        clonedAlice.getCity().setDescription("London");

        System.out.println(alice);
        System.out.println(clonedAlice);

        Trainee clonedAlice2 = new Trainee(alice);
        clonedAlice2.getCity().setDescription("Paris");

        System.out.println(alice);
        System.out.println(clonedAlice2);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/temp/trainee.ser"))) {
            oos.writeObject(alice);
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C;/temp/trainee.ser"))) {
            Trainee aliceTrainee = (Trainee) ois.readObject();
        } catch (NotSerializableException e){
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
