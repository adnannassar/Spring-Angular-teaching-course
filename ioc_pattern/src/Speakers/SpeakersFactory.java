package Speakers;

public class SpeakersFactory {

    public Speaker createSpeaker(SpeakerType speakerType) {
        if (speakerType == null) {
            return null;
        }
        if (speakerType.equals(SpeakerType.SONY)) {
            return new SonySpeaker();
        } else if (speakerType.equals(SpeakerType.BOSE)) {
            return new BoseSpeakers();
        }
        return null;
    }
}
