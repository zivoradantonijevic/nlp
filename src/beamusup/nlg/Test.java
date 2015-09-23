package beamusup.nlg;

import simplenlg.framework.NLGElement;
import simplenlg.framework.NLGFactory;
import simplenlg.lexicon.Lexicon;
import simplenlg.realiser.english.Realiser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test {
    public List<Sentence> getSubjects() {
        List<Sentence> list = new ArrayList<>();

        Sentence wheel = new Sentence("car", "has", "10 wheels");

        list.add(wheel);
        return list;

    }

    public void testNlg() {
        List<Sentence> subjects = this.getSubjects();
        Iterator<Sentence> iterator = subjects.iterator();
        String sentence = "";

        while (iterator.hasNext()) {
            Sentence tmp = iterator.next();
            sentence += tmp;
        }

        System.out.println(sentence);

    }
}
