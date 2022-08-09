package ru.netology.javaqamvn;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Александр";
        post.passport = "1111 № 22222222";
        post.patronymic = "Сергеевич";
        post.phone = "+7 (999) 999 99 99";
        post.surname = "Пушкин";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 6;
        post.birthday.month = 6;
        post.birthday.year = 1799;

    }
}
