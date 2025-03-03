package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    private static List<String> notValidated;

    public static List<String> validate(Object obj) {
        notValidated = new ArrayList<>();
        Class<?> aClass = obj.getClass();
        try {

            Field[] fields = aClass.getDeclaredFields(); //получить список полей класса
            for(var field : fields) {
                field.setAccessible(true); //изменение прав доступа
                if(field.isAnnotationPresent(NotNull.class) && (field.get(obj) == null) ) {
                    notValidated.add(field.getName());
                }
            }
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        return notValidated;

    }
}
// END
