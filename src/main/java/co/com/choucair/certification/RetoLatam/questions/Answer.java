package co.com.choucair.certification.RetoLatam.questions;

import co.com.choucair.certification.RetoLatam.userinterface.LatamConfimation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private int size;

    public Answer (int size){this.size = size;}

    public static Answer onThe(int size) {
        return new Answer(size);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       String textConfirmed = Text.of(LatamConfimation.CONFIRMATION_CODE).viewedBy(actor).asString();
       System.out.println(textConfirmed);

       String regex = "\\W[A-Z]{"+size+"}\\W";
       String [] result = textConfirmed.split(regex);

        System.out.println(result.length);
        System.out.println(result[0]);
        System.out.println(result[1]);

        return result.length == 2;
    }

}
