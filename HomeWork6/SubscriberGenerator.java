package HomeWork6;

public class SubscriberGenerator implements SubscribeService {
    public static Subscriber[] getSubArrayArray(){

        Subscriber[] subs = new Subscriber[10];
            Subscriber subs1 = new Subscriber(1, "Lobanov", "Andrey", "Olegovich", "Kyiv", "380954476588", "#12", 3500, 1500, 0, "∞");
            Subscriber subs2 = new Subscriber(2, "Okun", "Vlad", "Valerievich", "Dnipro", "380930903242", "#25", 2500, 1000, 500, "10000mb");
            Subscriber subs3 = new Subscriber(3, "Ermolaev", "Valeriy", "Nickolaevich", "Nickolaev", "380675672309", "#3", 1600, 400,200, "3500mb");
            Subscriber subs4 = new Subscriber(4, "Cherishuk", "Ekaterina", "Dmitrievna", "Nickolaev", "380687080522", "#12", 3500, 1500,1000, "∞");
            Subscriber subs5 = new Subscriber(5, "Uhanova", "Alina", "Sergeevna", "Kyiv", "380987080834", "#4", 3000, 1200,750, "∞");
            Subscriber subs6 = new Subscriber(6, "Chaban", "Nina", "Yourievna", "Odessa", "380507391862", "#25", 2500, 1000,500, "10000mb");
            Subscriber subs7 = new Subscriber(7, "Semenyouk", "Alexsandr", "Petrivich", "Odessa", "380938759081", "#3", 1600, 400,0, "3500mb");
            Subscriber subs8 = new Subscriber(8, "Malina", "Artem", "Penasovich", "Lviv", "380433035644", "#12", 3500, 1500,1000, "∞");
            Subscriber subs9 = new Subscriber(9, "Senko", "Ivan", "Ivanivich", "Dnipro", "380637834599", "#4", 3000, 1200,750, "∞");
            Subscriber subs10 = new Subscriber(10, "Maxno", "Alisa", "Batikovna", "Kharkiv", "380977472589", "#13", 4000, 2000,0, "∞");

            subs[0] = subs1;
            subs[1] = subs2;
            subs[2] = subs3;
            subs[3] = subs4;
            subs[4] = subs5;
            subs[5] = subs6;
            subs[6] = subs7;
            subs[7] = subs8;
            subs[8] = subs9;
            subs[9] = subs10;


        return subs;
        }
    }

