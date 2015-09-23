package beamusup.nlg;

import simplenlg.features.Feature;
import simplenlg.features.Tense;
import simplenlg.framework.NLGElement;
import simplenlg.framework.NLGFactory;
import simplenlg.lexicon.Lexicon;
import simplenlg.phrasespec.SPhraseSpec;
import simplenlg.realiser.english.Realiser;

/**
 * Created by marica on 23.9.15..
 */
public class Sentence {
    String subject;
    String verb;
    Tense tense;
    String object;
    String complement;

    public Sentence(String subject, String verb, String object){
        this.subject = subject;
        this.verb = verb;
        this.object = object;
    }


    @Override
    public String toString() {
        Lexicon lexicon = Lexicon.getDefaultLexicon();
        NLGFactory nlgFactory = new NLGFactory(lexicon);
        Realiser realiser = new Realiser(lexicon);

        SPhraseSpec p = nlgFactory.createClause();
        p.setSubject(this.subject);
        p.setVerb(this.verb);
        p.setObject(this.object);

        if( this.tense != null) {
            p.setFeature(Feature.TENSE, this.tense);
        }

        if( this.complement != null){
            p.setComplement(this.complement);
        }

        return realiser.realiseSentence(p);
    }
}
