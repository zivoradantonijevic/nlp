package beamusup.nlg;

import simplenlg.framework.NLGElement;
import simplenlg.framework.NLGFactory;
import simplenlg.lexicon.Lexicon;
import simplenlg.realiser.english.Realiser;




public class Test {
    public String[] getSubjects() {
        String[] options = new String[10];
        System.out.println("Array size: " + options.length);
        return options;
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
