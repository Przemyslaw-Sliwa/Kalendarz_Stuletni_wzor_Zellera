public class Zeller {
    int day,month,year;
    String[] dayName = {
            "Wtorek","Sroda","Czwartek","Piatek","Sobota","Niedziela","Poniedzialek"};


    /*
    dzień tygodnia = ([23m/9] + d + 4 + y + [z/4] + [z/100] + [z/400] - c) mod 7
    gdzie
    [ ] oznacza część całkowitą liczby
    mod – funkcja modulo (reszta z dzielenia)
    m – numer miesiąca (ang. month) (od stycznia = 1 do grudnia = 12)
    d – numer dnia (ang. day) miesiąca
    y – rok (ang. year)
    z – rok z poprawką: z = y - 1 jeżeli m < 3; z = y, jeżeli m >= 3
    c – korekta (ang. correction): c = 0, jeżeli m < 3; c = 2, jeżeli m >= 3
    dni tygodnia ze zbioru {0, 1, 2, 3, 4, 5, 6}, gdzie: 0 – wtorek, 1 – środa, 2 – czwartek, 3 – piątek, 4 – sobota, 5 – niedziela, 6 – poniedziałek
     */
    public Zeller(){
        day=1;
        month=1;
        year=1900;
    }

    public Zeller(int day, int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String calc(){
        int yearCor=year;
        int cor=2;
        int tmp;
        if(month<3){
            yearCor-=1;
            cor=0;
        }
        tmp=((23*month/9) + day + 4 + year + (yearCor/4) + (yearCor/100) + (yearCor/400) - cor)%7;
        return dayName[tmp];
    }

}
