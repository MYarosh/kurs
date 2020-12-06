CREATE TABLE "Люди"(
                       "ID_человека" serial PRIMARY KEY,
                       "Имя" varchar(32) NOT NULL,
                       "Фамилия" varchar(32) NOT NULL
);

CREATE TABLE "Страны" (
                          "Страна" varchar(32) NOT NULL PRIMARY KEY,
                          "Угроза" varchar(32) NOT NULL
);

CREATE TABLE "Типы_установленных_устройств" (
                                                "Тип_устройства" varchar(32) PRIMARY KEY,
                                                "Описание" text NOT NULL
);

CREATE TABLE "Типы_организаций" (
                                    "Тип_организации" varchar(32) NOT NULL PRIMARY KEY,
                                    "Описание" text NOT NULL
);

CREATE TABLE "Организация" (
                               "ID_Организации" serial PRIMARY KEY,
                               "Страна" varchar(32) REFERENCES "Страны",
                               "Род_деятельности" varchar(32) NOT NULL,
                               "Название" varchar(32) NOT NULL,
                               "Тип_организации" varchar(32) NOT NULL REFERENCES "Типы_организаций"
);

CREATE TABLE "Человек_установщик" (
                                      "ID_человека" integer PRIMARY KEY REFERENCES "Люди",
                                      "Должность" varchar(32) NOT NULL,
                                      "Страна" varchar(32) REFERENCES "Страны",
                                      "Организация" integer REFERENCES "Организация"("ID_Организации")
);

CREATE TABLE "Место_установки" (
                                   "ID_места" serial PRIMARY KEY,
                                   "X" numeric NOT NULL,
                                   "Y" numeric NOT NULL,
                                   "Z" numeric NOT NULL
);

CREATE TABLE "Устройства_передатчики" (
                                          "ID_Устройства" serial PRIMARY KEY,
                                          "Модель" varchar(32) NOT NULL,
                                          "Человек_установщик" integer NOT NULL REFERENCES "Человек_установщик"("ID_человека"),
                                          "Место_установки" integer REFERENCES "Место_установки"("ID_места"),
                                          "Тип" varchar(32) REFERENCES "Типы_установленных_устройств"("Тип_устройства"),
                                          "Частота" numeric NOT NULL
);

CREATE TABLE "Наблюдаемый" (
                               "ID_наблюдаемого" integer PRIMARY KEY REFERENCES "Люди"("ID_человека"),
                               "Должность" varchar(32) NOT NULL,
                               "Организация" integer NOT NULL REFERENCES "Организация"("ID_Организации")
);

CREATE TABLE "Устройства_Наблюдаемый"(
                                         "ID_Устройства" integer REFERENCES "Устройства_передатчики",
                                         "ID_наблюдаемого" integer REFERENCES "Наблюдаемый"
);

CREATE TABLE "Место_расположения" (
                                      "ID_место_расположения" serial PRIMARY KEY,
                                      "Организация" integer REFERENCES "Организация"("ID_Организации"),
                                      "X" numeric NOT NULL,
                                      "Y" numeric NOT NULL,
                                      "Z" numeric NOT NULL
);

CREATE TABLE "Устройства_приемники" (
                                        "ID_Приемника" serial PRIMARY KEY,
                                        "Устройство_передатчик" integer REFERENCES "Устройства_передатчики"("ID_Устройства"),
                                        "Место_расположения" integer REFERENCES "Место_расположения"("ID_место_расположения"),
                                        "Страна" varchar(32) REFERENCES "Страны"
);
