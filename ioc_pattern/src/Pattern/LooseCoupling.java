package Pattern;

import Speakers.SpeakerType;
import Speakers.SpeakersFactory;
import Tires.TireType;
import Tires.TiresFactory;

public class LooseCoupling {

    public static void makeVehicle() {
        SpeakersFactory speakersFactory = new SpeakersFactory();
        System.out.println(speakersFactory.createSpeaker(SpeakerType.SONY).makeSound());

        TiresFactory tiresFactory = new TiresFactory();
        System.out.println(tiresFactory.createTire(TireType.MICHELIN).rotate());
    }
}
