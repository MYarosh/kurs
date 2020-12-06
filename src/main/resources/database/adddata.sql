INSERT INTO Люди (Имя, Фамилия) VALUES ('Кондратий', 'Щуров');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Родион', 'Заседателев');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Демьян', 'Капишников');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Тарас', 'Жарыхин');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Адриан', 'Кадцын');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Евлампий', 'Веселовский');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Лаврентий', 'Калягин');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Иларион', 'Лель');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Robert', 'Lee');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Richard', 'Miles');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Gerald', 'Shields');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Michael', 'Hodge');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Ethan', 'Butler');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Peter', 'Scott');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Kurt', 'Dieter');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Albert', 'Diefenbach');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Thomas', 'Rothbauer');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Karlheinz', 'Peters');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Fabian', 'Maus');
INSERT INTO Люди (Имя, Фамилия) VALUES ('Robert', 'Bader');

INSERT INTO Страны (Страна, Угроза) VALUES ('США', '10');
INSERT INTO Страны (Страна, Угроза) VALUES ('Германия', '8');
INSERT INTO Страны (Страна, Угроза) VALUES ('КНДР', '2');
INSERT INTO Страны (Страна, Угроза) VALUES ('Россия', '0');
INSERT INTO Страны (Страна, Угроза) VALUES ('Ирак', '4');
INSERT INTO Страны (Страна, Угроза) VALUES ('Израиль', '5');

INSERT INTO Типы_установленных_устройств VALUES ('Прослушка', 'Слушает');
INSERT INTO Типы_установленных_устройств VALUES ('Просмотрка', 'Смотрит');
INSERT INTO Типы_установленных_устройств VALUES ('Прозрелка', 'Смотрит в рентгене');
INSERT INTO Типы_установленных_устройств VALUES ('Пробовалка', 'Пробует');

INSERT INTO Типы_организаций VALUES ('Государственная', 'Работает на государство');
INSERT INTO Типы_организаций VALUES ('Комерческая', 'Работает на себя');

INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('США', 'Интересы страны', 'ЦРУ', 'Государственная');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('США', 'Интересы компании', 'Макинтош', 'Комерческая');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('Германия', 'Интересы страны', 'Бундесвер', 'Государственная');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('Россия', 'Интересы страны', 'ФСБ', 'Государственная');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('Израиль', 'Интересы страны', 'Моссад', 'Государственная');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('Ирак', 'Интересы компании', 'Атомик', 'Комерческая');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('Германия', 'Интересы компании', 'БМВ', 'Комерческая');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('Россия', 'Интересы компании', 'Алмаз', 'Комерческая');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('Россия', 'Интересы компании', 'Газпром', 'Комерческая');
INSERT INTO Организация (Страна, Род_деятельности, Название, Тип_организации) VALUES ('Россия', 'Интересы компании', 'СекретОборонСнабПродСтырСтыдПром', 'Комерческая');

INSERT INTO Человек_установщик VALUES (10, 'Дипломат', 'США', 1);
INSERT INTO Человек_установщик VALUES (14, 'Менеджер', 'США', 2);
INSERT INTO Человек_установщик VALUES (11, 'Охранник', 'США', 1);
INSERT INTO Человек_установщик VALUES (1, 'Уборщик', 'Россия', 4);
INSERT INTO Человек_установщик VALUES (16, 'Менеджер', 'Германия', 3);
INSERT INTO Человек_установщик VALUES (5, 'Директор', 'Россия', 4);
INSERT INTO Человек_установщик VALUES (17, 'Адвокат', 'Германия', 7);
INSERT INTO Человек_установщик VALUES (18, 'Банкир', 'Германия', 3);
INSERT INTO Человек_установщик VALUES (3, 'Монтажник', 'Россия', 4);

INSERT INTO Место_установки ("X", "Y", "Z") VALUES (0, 0, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (1, 0, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (0, 2, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (10, 2, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (20, 2, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (30, 2, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (40, 2, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (50, 2, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (60, 2, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (70, 2, 0);
INSERT INTO Место_установки ("X", "Y", "Z") VALUES (80, 2, 0);

INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Листнер', 10, 2, 'Прослушка', 2);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Вотчер', 11, 1, 'Просмотрка', 5);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Хорен', 16, 3, 'Прослушка', 13);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Рентгеник', 1, 4, 'Прозрелка', 6);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Вкушалка', 5, 6, 'Пробовалка', 7);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Зеен', 17, 5, 'Просмотрка', 3);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Слышалка', 3, 7, 'Прослушка', 1);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Листнер', 14, 8, 'Прослушка', 8);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Вотчер', 10, 9, 'Просмотрка', 9);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Хорен', 18, 10, 'Прослушка', 8);
INSERT INTO Устройства_передатчики (Модель, Человек_установщик, Место_установки, Тип, Частота) VALUES ('Подглядывалка', 1, 11, 'Просмотрка', 9);

INSERT INTO Наблюдаемый VALUES (2, 'Инженер', 8);
INSERT INTO Наблюдаемый VALUES (4, 'Проектировщик', 10);
INSERT INTO Наблюдаемый VALUES (6, 'Уборщик', 9);
INSERT INTO Наблюдаемый VALUES (7, 'Печатник', 9);
INSERT INTO Наблюдаемый VALUES (8, 'Тракторист', 9);
INSERT INTO Наблюдаемый VALUES (9, 'Архитектор', 1);
INSERT INTO Наблюдаемый VALUES (12, 'Плотник', 1);
INSERT INTO Наблюдаемый VALUES (13, 'Врач', 1);
INSERT INTO Наблюдаемый VALUES (15, 'Биоинженер', 3);
INSERT INTO Наблюдаемый VALUES (19, 'Технолог', 3);
INSERT INTO Наблюдаемый VALUES (20, 'Блогер', 3);

INSERT INTO Устройства_Наблюдаемый VALUES (1, 2);
INSERT INTO Устройства_Наблюдаемый VALUES (3, 4);
INSERT INTO Устройства_Наблюдаемый VALUES (2, 6);
INSERT INTO Устройства_Наблюдаемый VALUES (6, 7);
INSERT INTO Устройства_Наблюдаемый VALUES (9, 8);
INSERT INTO Устройства_Наблюдаемый VALUES (4, 9);
INSERT INTO Устройства_Наблюдаемый VALUES (5, 12);
INSERT INTO Устройства_Наблюдаемый VALUES (10, 13);
INSERT INTO Устройства_Наблюдаемый VALUES (8, 15);
INSERT INTO Устройства_Наблюдаемый VALUES (7, 19);
INSERT INTO Устройства_Наблюдаемый VALUES (11, 20);

INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (1, 100, 100, 100);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (2, 150, 300, 210);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (3, 100, 1000, 50);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (4, 110, 1000, 50);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (5, 120, 1000, 50);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (6, 130, 1000, 50);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (7, 200, 1000, 50);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (8, 220, 1000, 50);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (9, 250, 1000, 50);
INSERT INTO Место_расположения ("Организация", "X", "Y", "Z") VALUES (10, 260, 1000, 50);

INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (1, 1, 'США');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (2, 1, 'США');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (3, 3, 'Германия');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (4, 4, 'Россия');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (5, 4, 'Россия');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (6, 7, 'Германия');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (7, 4, 'Россия');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (8, 2, 'США');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (9, 1, 'США');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (10, 3, 'Германия');
INSERT INTO Устройства_приемники (Устройство_передатчик, Место_расположения, Страна) VALUES (11, 4, 'Россия');
