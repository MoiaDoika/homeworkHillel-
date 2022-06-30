package HomeWork6;

import java.util.ArrayList;

public class SubscriberGenerator{
    public static ArrayList<Subscriber> getSubscriber(){

            Subscriber subs1 = new Subscriber(1, "Lobanov", "Andrey", "Olegovich", "Kyiv", "380954476588", "#12", 3500, 1500, 0, 32424);
            Subscriber subs2 = new Subscriber(2, "Okun", "Vlad", "Valerievich", "Dnipro", "380930903242", "#25", 2500, 1000, 500, 4324);
            Subscriber subs3 = new Subscriber(3, "Ermolaev", "Valeriy", "Nickolaevich", "Nickolaev", "380675672309", "#3", 1600, 400,200, 315);
            Subscriber subs4 = new Subscriber(4, "Cherishuk", "Ekaterina", "Dmitrievna", "Nickolaev", "380687080522", "#12", 3500, 1500,1000, 43253);
            Subscriber subs5 = new Subscriber(5, "Uhanova", "Alina", "Sergeevna", "Kyiv", "380987080834", "#4", 3000, 1200,750, 25);
            Subscriber subs6 = new Subscriber(6, "Chaban", "Nina", "Yourievna", "Odessa", "380507391862", "#25", 2500, 1000,500, 45345);
            Subscriber subs7 = new Subscriber(7, "Semenyouk", "Alexsandr", "Petrivich", "Odessa", "380938759081", "#3", 1600, 400,0, 1011);
            Subscriber subs8 = new Subscriber(8, "Malina", "Artem", "Penasovich", "Lviv", "380433035644", "#12", 3500, 1500,1000, 2854);
            Subscriber subs9 = new Subscriber(9, "Senko", "Ivan", "Ivanivich", "Dnipro", "380637834599", "#4", 3000, 1200,750, 32344);
            Subscriber subs10 = new Subscriber(10, "Maxno", "Alisa", "Batikovna", "Kharkiv", "380977472589", "#13", 4000, 2000,0, 4354);

            ArrayList<Subscriber> subscribers = new ArrayList<>();
           subscribers.add(subs1);
        subscribers.add(subs2);
        subscribers.add(subs3);
        subscribers.add(subs4);
        subscribers.add(subs5);
        subscribers.add(subs6);
        subscribers.add(subs7);
        subscribers.add(subs8);
        subscribers.add(subs9);
        subscribers.add(subs10);



        return subscribers;
        }
    }

