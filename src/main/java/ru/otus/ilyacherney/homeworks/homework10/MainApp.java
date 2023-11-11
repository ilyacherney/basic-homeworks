package ru.otus.ilyacherney.homeworks.homework10;

public class MainApp {
    public static void main(String[] args) {
        //1
        int currentYear = 2023;
        User[] users = {
                new User("xvmb", "xvbn", "zdhfg", 2007,"2342345@yandex.ru"),
                new User("fsdgh", "dghk", "gh", 1997, "2342345@yandex.ru"),
                new User("xvbnxvcbn", "zfgh", "gx", 1927, "56346@yandex.ru"),
                new User("xcvn", "fcdbvg", "jg", 1937, "3456@yandex.ru"),
                new User("dfghk", "zdfhg", "fjg", 1947, "867@yandex.ru"),
                new User("tsruj", "Ilzdfghya", "j", 1957, "3245@yandex.ru"),
                new User("sfxgj", "xhfgd", "ghj", 1967, "7856@yandex.ru"),
                new User("xvbmn", "Ilfxya", "jk", 1977, "234523@yandex.ru"),
                new User("zxfgh", "zdfhg", "rasy", 1987, "7567@yandex.ru"),
                new User("xvbn", "zdfhg", "kxhgf", 1917, "34567@yandex.ru")
        };
        for (int i = 0; i < users.length; i++){
            if (currentYear - users[i].getBirthYear() > 40) {
                users[i].info();
                System.out.println();
            }
        }

        //2
        Box box = new Box(1, "White");
        box.info();
        box.putItem("Лампочка");
        box.info();
        box.open();
        box.info();
        box.putItem("Лампочка");
        box.info();
        box.close();
        box.info();
        box.getItem();
        box.info();
        box.open();
        box.info();
        box.getItem();
        box.info();
    }
}
