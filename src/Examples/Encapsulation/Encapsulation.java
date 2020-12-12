package Examples.Encapsulation;

public class Encapsulation {
    /*
	 1) Encapsulation kisaca "data hidding" diyebililiriz.
	 2) Basarili bir encapsulation asagidaki ozelliklere sahip olmalidir;
	 	a) Nasil kullanilacagi belli olmali. (Direksiyon gibi)
	 	b) Kod'un karmasikligi kullanimin karmasikligina sebep olmamali.
	 	    Yani cok karmasik kodlardan olusan bir yapi, basit bir sekilde kullanilabilmemli.
	 	c) Bir bolumun bozulmasi baska bolumlerin bozulmasina sebep olmamali.
	 3) Encapsulation nasil yapilir?
	 	a) Access modifier'lar "private" olarak kullaniniz.
	 	b) getter ve setter metodlari ile "encapsulated" data'lara ulasip onlari okuyabilir(getter) ve degistirebiliriz(setter).
	 4) Encapsulation'in faydalari:
	 	a) Esneklik (flexibility). Normalde "age" variable'inin degeri 25 tir.
	 		Ama diger class'larda setAge() methodunu kullanarak age variable'inin degerini istedigimiz gibi degistirip kullanabilirsiniz.
	 */

    private int age = 25;
    private String name = "Ali";

    //getter() olusturmak
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //setter olusturmak
    public void setAge(int age) {            //return type her zaman void
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
