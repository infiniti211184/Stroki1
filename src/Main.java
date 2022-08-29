public class Main {
    public static void main(String[] args) {
        String firstName = "Petr ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";

        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    {  //2 способ
        var firstName = "Petr";
        var middleName = "Ivanovich";
        var lastName = "Ivanov";
        var fullName = "PII";

        var fullName; String.format("%s %s %s", lastName, firstName, middleName);
    }
    // Задача 2.
// Задача 2.
    String firstName = "Petr ";
    String middleName = "Ivanovich ";
    String lastName = "Ivanov ";

    String fullName = String.format("%s %s %s", firstName, middleName, lastName);
            System.out.println("ФИО сотрудника для отчета - " + fullName.toUpperCase());
}
    }
// Задача 3.
public class Main {
    public static void main(String[] args) {
        String fullName = "Ёжиков Артём Семёнович";
        var split :String[] = fullName.split( regex " ");
        for (String current.contains ("ё")){
            var text :String = current.replace(target:"ё", replacement:"е");
            System.out.print(text);
        } else {
            System.out.print(current);
        }
        System.out.print(" ");
    }
}

}



