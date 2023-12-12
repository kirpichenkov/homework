package ru.kirpichenkov.repositories;

import ru.kirpichenkov.models.Users;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface UsersRepository {
    List<Users> findAll();
}
