package tms.lesson19.registration;
/**
 * Для создания класса использовался шаблон Singleton
 * Класс добавляет нового пользователя в список, предварительно проверяя, есть ли уже такое имя пользователя.
 */

import java.util.ArrayList;
import java.util.List;

public class InMemoryStorage {
    private static InMemoryStorage instance = new InMemoryStorage();

    private List<User> userList;

    public static InMemoryStorage getInstance(){
        return instance;
    }

    private InMemoryStorage() {
        this.userList = new ArrayList<>();
    }

    public String add(User user){
        if (isDuplicateUser(user)) {
            return "This username is taken";
        } else {
            userList.add(user);
            return "Success! User added";
        }
    }

    private boolean isDuplicateUser(User user){
        boolean tmp = false;
        for (User item : userList){
            if (item.equals(user)){
                tmp = true;
            }
        }
        return tmp;
    }
}
