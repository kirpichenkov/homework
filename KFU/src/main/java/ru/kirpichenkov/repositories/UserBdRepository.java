package ru.kirpichenkov.repositories;

import ru.kirpichenkov.models.Users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserBdRepository implements UsersRepository{
    @Override
    public List<Users> findAll() {
        return this.usersMyRealisation;
    }

    List<Users> usersMyRealisation = new ArrayList<>();
    {
        Users users1 = new Users("Liza", LocalDate.parse("1996-12-12"), "12345Q");
        usersMyRealisation.add(users1);
    }
}
