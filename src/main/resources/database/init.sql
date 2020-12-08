create table "люди"(
                       "id_человека" serial primary key,
                       "имя" varchar(32) not null,
                       "фамилия" varchar(32) not null
);

create table "страны" (
                          "страна" varchar(32) not null primary key,
                          "угроза" varchar(32) not null
);

create table "типы_установленных_устройств" (
                                                "тип_устройства" varchar(32) primary key,
                                                "описание" text not null
);

create table "типы_организаций" (
                                    "тип_организации" varchar(32) not null primary key,
                                    "описание" text not null
);

create table "организация" (
                               "id_организации" serial primary key,
                               "страна" varchar(32) references "страны",
                               "род_деятельности" varchar(32) not null,
                               "название" varchar(32) not null,
                               "тип_организации" varchar(32) not null references "типы_организаций"
);

create table "человек_установщик" (
                                      "id_человека" integer primary key references "люди",
                                      "должность" varchar(32) not null,
                                      "страна" varchar(32) references "страны",
                                      "организация" integer references "организация"("id_организации")
);

create table "место_установки" (
                                   "id_места" serial primary key,
                                   "x" numeric not null,
                                   "y" numeric not null,
                                   "z" numeric not null
);

create table "устройства_передатчики" (
                                          "id_устройства" serial primary key,
                                          "модель" varchar(32) not null,
                                          "человек_установщик" integer not null references "человек_установщик"("id_человека"),
                                          "место_установки" integer references "место_установки"("id_места"),
                                          "тип" varchar(32) references "типы_установленных_устройств"("тип_устройства"),
                                          "частота" numeric not null
);

create table "наблюдаемый" (
                               "id_наблюдаемого" integer primary key references "люди"("id_человека"),
                               "должность" varchar(32) not null,
                               "организация" integer not null references "организация"("id_организации")
);

create table "устройства_наблюдаемый"(
                                         "id_устройства" integer references "устройства_передатчики",
                                         "id_наблюдаемого" integer references "наблюдаемый"
);

create table "место_расположения" (
                                      "id_место_расположения" serial primary key,
                                      "организация" integer references "организация"("id_организации"),
                                      "x" numeric not null,
                                      "y" numeric not null,
                                      "z" numeric not null
);

create table "устройства_приемники" (
                                        "id_приемника" serial primary key,
                                        "устройство_передатчик" integer references "устройства_передатчики"("id_устройства"),
                                        "место_расположения" integer references "место_расположения"("id_место_расположения"),
                                        "страна" varchar(32) references "страны"
);
