package ru.kirpichenkov.servlet;

import ru.kirpichenkov.models.Users;
import ru.kirpichenkov.repositories.UserBdRepository;
import ru.kirpichenkov.repositories.UsersRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet {
    /*
    Мы с Вами помним что базовые методы в http протоколе это GET и POST.
    Get для получения данных.
    Post для отправки.
    оба на входе имеют два атрибута request(запрос) и responce(ответ)
    request - это те данные которые мы забираем для обработки
    responce - записываем то, что хотим чтобы клиент получил

     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Users> usersList = (List<Users>) usersRepository.findAll();
        req.setAttribute("usersFronServer",    );
    }

    UsersRepository usersRepository;

    @Override
    public void init() throws ServletException {
        this.usersRepository = new UserBdRepository();
    }
}
