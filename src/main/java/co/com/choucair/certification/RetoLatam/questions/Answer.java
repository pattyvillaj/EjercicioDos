package co.com.choucair.certification.RetoLatam.questions;

import co.com.choucair.certification.RetoLatam.userinterface.LatamSixLetter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.regex.Pattern;

public class Answer implements Question<Boolean> {
         private int size;

    public Answer(int size) {
        this.size = size;
    }

    public static Question<Boolean> toThe(int size) {
        return new Answer(size) ;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textConfirmed = Text.of(LatamSixLetter.NUMBER_CONFIRMATION).viewedBy(actor).asString();
        System.out.println(textConfirmed);

        // \\W[A-Z]{6}\\W
        String regex = "\\W[A-Z]{"+size+"}\\W";

        String[] result = textConfirmed.split(regex);

        System.out.println(result.length);
        System.out.println(result[0]);
        System.out.println(result[1]);

        return result.length==2;
    }
}
