package Pattern;

import Speakers.BoseSpeakers;
import Tires.MichelinTires;

public  class TightCoupling {

    public static void makeVehicle(){
        BoseSpeakers boseSpeakers = new BoseSpeakers(); // pojo
        System.out.println(boseSpeakers.makeSound());
        MichelinTires michelinTires = new MichelinTires();
        System.out.println(michelinTires.rotate());
    }
}
