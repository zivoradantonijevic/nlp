package beamusup.nlg;

import simplenlg.framework.NLGElement;
import simplenlg.framework.NLGFactory;
import simplenlg.lexicon.Lexicon;
import simplenlg.realiser.english.Realiser;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public List<ArrayList<String>> getSubjects() {
        List<ArrayList<String>> list = new ArrayList<>();



        list.add(wheel);


        ArrayList wheel = new ArrayList();
        wheel.add("wheel");
        wheel.add("10");

        return list;

    }

    public void testNlg(){
        this.getSubjects();

        Lexicon lexicon = Lexicon.getDefaultLexicon();
        NLGFactory nlgFactory = new NLGFactory(lexicon);
        Realiser realiser = new Realiser(lexicon);

        NLGElement s1 = nlgFactory.createSentence("my dog is happy");
        String output = realiser.realiseSentence(s1);
        System.out.println(output);
    }
}
