/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata11;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Javier
 */
public class Person {
    private final String name;
    private final String surname;
    private final Calendar birth;
    private static final long MILLISECOND_PER_YEAR=(long) (1000*60*60*24*365.25); 
    private String ramon;
    
    public Person(String name, String surname, Calendar birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirth() {
        return birth;
    }
    public String getFullName(){
        return name+" "+surname;
    }
    public int getAge(){
        Calendar today;
        today=GregorianCalendar.getInstance();
        return (int) (mimetodo(today.getTimeInMillis()-birth.getTimeInMillis()));
    }
    private long mimetodo(long millis){
        return millis/MILLISECOND_PER_YEAR;
    }
}
