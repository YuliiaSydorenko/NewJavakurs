package homeworksss.homework45.validator;



    //throw - ключевое слово для явного выброса исключения

public class EmailValidator {

    // throw - Ключевое слово используемое для явного выброса исключения (создание объекта исключения)

    public static void isEmailValid(String email) throws EmailValidateExeption {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new EmailValidateExeption("@ error");

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateExeption(". after @ error");


        // 3. После последней точки есть 2 или более символов
        // test@fazx.com.ne.t
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex + 2 >= email.length()) throw new EmailValidateExeption("last . error");

        // 4.  Алфавит, цифры, '-', '_', '.', '@'
        /*
        Я беру каждый символ. Проверяю, что он не является "запрещенным"
        И если нахожу не подходящий символ - возвращаю false
         */
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);

            // Если символ удовлетворяет одному из условий на "правильность"
            boolean isPass = (Character.isAlphabetic(ch) ||
                    Character.isDigit(ch) ||
                    ch == '-' ||
                    ch == '_' ||
                    ch == '.' ||
                    ch == '@');

            // Если любой символ НЕ подходящий, сразу возвращаем false
            if (!isPass) throw new EmailValidateExeption("illegal symbol");

            /*
            Равнозначные выражения.
            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && ch != '-' && ch != '_' && ch != '.' && ch != '@') return false;
            if (!(Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch == '@')) return false;
             */
        }

        // 5. До собаки должен быть хотя бы 1 символ == собака не первая в строке. Т.е. ее индекс не равен 0
        if (indexAt == 0) throw new EmailValidateExeption("@ should not first");

        // 6. Первый символ - должна быть буква
        // Если 0-й символ НЕ является буквой, то email не подходит = return false;
        char firstChar = email.charAt(0);
        if (!Character.isAlphabetic(firstChar)) throw new EmailValidateExeption("first symbol should be alphabetic");


        // Все проверки пройдены. email подходит.


    }

    public static void isPasswordValid(String password) throws PasswordValidateException {
        // Проверка на null и минимальную длину
        if (password == null || password.length() < 8) {
            throw new PasswordValidateException("Password should be at least 8 characters long.");
        }

        // Флаги для каждой проверки
        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        String symbols = "!%$@&*()[].,-";  // Разрешенные спец. символы

        // Проверка каждого символа пароля
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if (Character.isLowerCase(ch)) isLowerCase = true;
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
        }

        // Если не хватает цифры, выбрасываем исключение
        if (!isDigit) {
            throw new PasswordValidateException("Password must contain at least one digit.");
        }

        // Если не хватает заглавной буквы, выбрасываем исключение
        if (!isUpperCase) {
            throw new PasswordValidateException("Password must contain at least one uppercase letter.");
        }

        // Если не хватает строчной буквы, выбрасываем исключение
        if (!isLowerCase) {
            throw new PasswordValidateException("Password must contain at least one lowercase letter.");
        }

        // Если не хватает спец. символа, выбрасываем исключение
        if (!isSpecialSymbol) {
            throw new PasswordValidateException("Password must contain at least one special character (!%$@&*()[].,-).");
        }

        // Все условия выполнены, метод завершается без исключений
    }
}



/*
Требование к паролю:
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */