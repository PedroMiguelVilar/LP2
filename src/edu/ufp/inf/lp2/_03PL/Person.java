package  edu.ufp.inf.lp2._03PL;



import edu.ufp.inf.lp2._02_Collections.LottoBagArray;

import java.util.Calendar;

public class Person {
  private String idNumber;
  private String name;
  private String adress;
  private Date birth;
  private String nif;

  public Person(String id, String n, String a, Date birth, String nif) {
    this.idNumber=id;
    this.name=n;
    this.adress=a;
    this.birth = birth;
    this.nif = nif;
  }

  public String getName(){
    return this.name;
  }

  public int age() {
    int age;
    Date date = new Date((short) Calendar.getInstance().get(Calendar.DAY_OF_MONTH), (short) Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.YEAR));
    age = birth.differenceYears(date)*(-1);
    if (!birth.beforeDate(date)) age-=1;
    return age;
  }

  public boolean olderThan(Person p) {
    return  this.age()>p.age();
  }

}