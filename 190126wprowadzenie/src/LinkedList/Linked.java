package LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        List<Participant> participants = new LinkedList<>(Arrays.asList(
                new Participant("Franek", 15),
                new Participant("Edek", 18),
                new Participant("Olek", 19),
                new Participant("Ula", 16)
        ));
        participants.add(new Participant("Kamil", 16));
        participants.add(new Participant("Alex", 21));
        System.out.println("Lista wszystkich uczestników: ");
//        for (Participant participant : participants) {
//            System.out.println(participant.toString());
//        }
//

        for (Participant p : participants) {
            if(p.getAge() < 18){
                ((LinkedList<Participant>) participants).remove();
            }
//            System.out.println(p);
        }
//        for (Iterator<Participant> participantIterator = participants.iterator(); participantIterator.hasNext(); ) {
//            Participant participant = participantIterator.next();
//            int participantAge = participant.getAge();
//            boolean ageSmallerThan18 = participantAge < 18;
//            if (ageSmallerThan18) {
//                participantIterator.remove();
//            }
//        }
//        System.out.println("Lista uczestników pełnoletnich: ");
//        for (Participant participant : participants) {
//            System.out.println(participant.toString());
//        }
        System.out.println("Liczba uczestników: " + participants.size());
    }
}
