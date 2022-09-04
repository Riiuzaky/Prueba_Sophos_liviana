package sophosSolutions.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.TextValue;
import sophosSolutions.userInterfaces.ToolsQaDataPickersPage;

import java.util.List;

public class ViewDataPicker {

    public static Question<String> obtenerTextoDataPicker1(){
        return actor -> TextValue.of(ToolsQaDataPickersPage.INPUT_FIRST_DATAPICKER).asString().answeredBy(actor).trim();
    }

    public static Question<String> obtenerTextoDataPicker2(){
        return actor -> TextValue.of(ToolsQaDataPickersPage.INPUT_SECOND_DATAPICKER).asString().answeredBy(actor).trim();
    }

    public static String transformDateOne(String year, String month, String day){

        String new_date;
        String monthNumber="01";

        if(month.equals("January")){
            monthNumber="01";
        }else if(month.equals("February")){
            monthNumber="02";
        }else if(month.equals("March")){
            monthNumber="03";
        }else if(month.equals("April")){
            monthNumber="04";
        }else if(month.equals("May")){
            monthNumber="05";
        }else if(month.equals("June")){
            monthNumber="06";
        }else if(month.equals("July")){
            monthNumber="07";
        }else if(month.equals("August")){
            monthNumber="08";
        }else if(month.equals("September")){
            monthNumber="09";
        }else if(month.equals("October")){
            monthNumber="10";
        }else if(month.equals("November")){
            monthNumber="11";
        } else{
            monthNumber="12";
        }

        new_date=monthNumber+"/"+day+"/"+year;
        return  new_date;
    }


    public static String transformDateTwo(String year, String month, String day,String time){
        String aux= "AM";
        String new_date;
        String[] lista = time.split(":");
        int new_time= Integer.parseInt(lista[0]);

        if(new_time>=00 && new_time<=11){
            if (new_time==00){
                lista[0]=Integer.toString(12);
            }
            if(new_time>00 && new_time<10){
                lista[0]=lista[0].substring(1,lista[0].length());
            }
            aux="AM";
        }else if(new_time>=12 && new_time<24){

            if (new_time==12){
                lista[0]=Integer.toString(12);
                aux="PM";

            }else{
                new_time= new_time-12;
                lista[0]=Integer.toString(new_time);
                aux="PM";
            }
        }


        new_date=month+" "+day+", "+year+" "+lista[0]+":"+lista[1]+" "+aux;
        return  new_date;
    }

}
