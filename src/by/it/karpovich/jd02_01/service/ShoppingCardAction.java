package by.it.karpovich.jd02_01.service;

import by.it.karpovich.jd02_01.model.Good;

public interface ShoppingCardAction {
    void takeCart(); //взял корзину

    int putToCart(Good good); //положил товар в корзину(возвращает число товаров)
}
