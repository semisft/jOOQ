/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.example.chart.db.tables.Actor;
import org.jooq.example.chart.db.tables.Address;
import org.jooq.example.chart.db.tables.Category;
import org.jooq.example.chart.db.tables.City;
import org.jooq.example.chart.db.tables.Country;
import org.jooq.example.chart.db.tables.Customer;
import org.jooq.example.chart.db.tables.Film;
import org.jooq.example.chart.db.tables.FilmActor;
import org.jooq.example.chart.db.tables.FilmCategory;
import org.jooq.example.chart.db.tables.Inventory;
import org.jooq.example.chart.db.tables.Language;
import org.jooq.example.chart.db.tables.Payment;
import org.jooq.example.chart.db.tables.PaymentP2007_01;
import org.jooq.example.chart.db.tables.PaymentP2007_02;
import org.jooq.example.chart.db.tables.PaymentP2007_03;
import org.jooq.example.chart.db.tables.PaymentP2007_04;
import org.jooq.example.chart.db.tables.PaymentP2007_05;
import org.jooq.example.chart.db.tables.PaymentP2007_06;
import org.jooq.example.chart.db.tables.Rental;
import org.jooq.example.chart.db.tables.SchemaVersion;
import org.jooq.example.chart.db.tables.Staff;
import org.jooq.example.chart.db.tables.Store;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0",
        "schema version:public_2"
    },
    date = "2018-04-03T12:47:15.287Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACTOR_PKEY = Indexes0.ACTOR_PKEY;
    public static final Index IDX_ACTOR_LAST_NAME = Indexes0.IDX_ACTOR_LAST_NAME;
    public static final Index ADDRESS_PKEY = Indexes0.ADDRESS_PKEY;
    public static final Index IDX_FK_CITY_ID = Indexes0.IDX_FK_CITY_ID;
    public static final Index CATEGORY_PKEY = Indexes0.CATEGORY_PKEY;
    public static final Index CITY_PKEY = Indexes0.CITY_PKEY;
    public static final Index IDX_FK_COUNTRY_ID = Indexes0.IDX_FK_COUNTRY_ID;
    public static final Index COUNTRY_PKEY = Indexes0.COUNTRY_PKEY;
    public static final Index CUSTOMER_PKEY = Indexes0.CUSTOMER_PKEY;
    public static final Index IDX_FK_ADDRESS_ID = Indexes0.IDX_FK_ADDRESS_ID;
    public static final Index IDX_FK_STORE_ID = Indexes0.IDX_FK_STORE_ID;
    public static final Index IDX_LAST_NAME = Indexes0.IDX_LAST_NAME;
    public static final Index FILM_FULLTEXT_IDX = Indexes0.FILM_FULLTEXT_IDX;
    public static final Index FILM_PKEY = Indexes0.FILM_PKEY;
    public static final Index IDX_FK_LANGUAGE_ID = Indexes0.IDX_FK_LANGUAGE_ID;
    public static final Index IDX_FK_ORIGINAL_LANGUAGE_ID = Indexes0.IDX_FK_ORIGINAL_LANGUAGE_ID;
    public static final Index IDX_TITLE = Indexes0.IDX_TITLE;
    public static final Index FILM_ACTOR_PKEY = Indexes0.FILM_ACTOR_PKEY;
    public static final Index IDX_FK_FILM_ID = Indexes0.IDX_FK_FILM_ID;
    public static final Index FILM_CATEGORY_PKEY = Indexes0.FILM_CATEGORY_PKEY;
    public static final Index IDX_STORE_ID_FILM_ID = Indexes0.IDX_STORE_ID_FILM_ID;
    public static final Index INVENTORY_PKEY = Indexes0.INVENTORY_PKEY;
    public static final Index LANGUAGE_PKEY = Indexes0.LANGUAGE_PKEY;
    public static final Index IDX_FK_CUSTOMER_ID = Indexes0.IDX_FK_CUSTOMER_ID;
    public static final Index IDX_FK_STAFF_ID = Indexes0.IDX_FK_STAFF_ID;
    public static final Index PAYMENT_PKEY = Indexes0.PAYMENT_PKEY;
    public static final Index IDX_FK_PAYMENT_P2007_01_CUSTOMER_ID = Indexes0.IDX_FK_PAYMENT_P2007_01_CUSTOMER_ID;
    public static final Index IDX_FK_PAYMENT_P2007_01_STAFF_ID = Indexes0.IDX_FK_PAYMENT_P2007_01_STAFF_ID;
    public static final Index IDX_FK_PAYMENT_P2007_02_CUSTOMER_ID = Indexes0.IDX_FK_PAYMENT_P2007_02_CUSTOMER_ID;
    public static final Index IDX_FK_PAYMENT_P2007_02_STAFF_ID = Indexes0.IDX_FK_PAYMENT_P2007_02_STAFF_ID;
    public static final Index IDX_FK_PAYMENT_P2007_03_CUSTOMER_ID = Indexes0.IDX_FK_PAYMENT_P2007_03_CUSTOMER_ID;
    public static final Index IDX_FK_PAYMENT_P2007_03_STAFF_ID = Indexes0.IDX_FK_PAYMENT_P2007_03_STAFF_ID;
    public static final Index IDX_FK_PAYMENT_P2007_04_CUSTOMER_ID = Indexes0.IDX_FK_PAYMENT_P2007_04_CUSTOMER_ID;
    public static final Index IDX_FK_PAYMENT_P2007_04_STAFF_ID = Indexes0.IDX_FK_PAYMENT_P2007_04_STAFF_ID;
    public static final Index IDX_FK_PAYMENT_P2007_05_CUSTOMER_ID = Indexes0.IDX_FK_PAYMENT_P2007_05_CUSTOMER_ID;
    public static final Index IDX_FK_PAYMENT_P2007_05_STAFF_ID = Indexes0.IDX_FK_PAYMENT_P2007_05_STAFF_ID;
    public static final Index IDX_FK_PAYMENT_P2007_06_CUSTOMER_ID = Indexes0.IDX_FK_PAYMENT_P2007_06_CUSTOMER_ID;
    public static final Index IDX_FK_PAYMENT_P2007_06_STAFF_ID = Indexes0.IDX_FK_PAYMENT_P2007_06_STAFF_ID;
    public static final Index IDX_FK_INVENTORY_ID = Indexes0.IDX_FK_INVENTORY_ID;
    public static final Index IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID = Indexes0.IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID;
    public static final Index RENTAL_PKEY = Indexes0.RENTAL_PKEY;
    public static final Index SCHEMA_VERSION_IR_IDX = Indexes0.SCHEMA_VERSION_IR_IDX;
    public static final Index SCHEMA_VERSION_PK = Indexes0.SCHEMA_VERSION_PK;
    public static final Index SCHEMA_VERSION_S_IDX = Indexes0.SCHEMA_VERSION_S_IDX;
    public static final Index SCHEMA_VERSION_VR_IDX = Indexes0.SCHEMA_VERSION_VR_IDX;
    public static final Index STAFF_PKEY = Indexes0.STAFF_PKEY;
    public static final Index IDX_UNQ_MANAGER_STAFF_ID = Indexes0.IDX_UNQ_MANAGER_STAFF_ID;
    public static final Index STORE_PKEY = Indexes0.STORE_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACTOR_PKEY = Internal.createIndex("actor_pkey", Actor.ACTOR, new OrderField[] { Actor.ACTOR.ACTOR_ID }, true);
        public static Index IDX_ACTOR_LAST_NAME = Internal.createIndex("idx_actor_last_name", Actor.ACTOR, new OrderField[] { Actor.ACTOR.LAST_NAME }, false);
        public static Index ADDRESS_PKEY = Internal.createIndex("address_pkey", Address.ADDRESS, new OrderField[] { Address.ADDRESS.ADDRESS_ID }, true);
        public static Index IDX_FK_CITY_ID = Internal.createIndex("idx_fk_city_id", Address.ADDRESS, new OrderField[] { Address.ADDRESS.CITY_ID }, false);
        public static Index CATEGORY_PKEY = Internal.createIndex("category_pkey", Category.CATEGORY, new OrderField[] { Category.CATEGORY.CATEGORY_ID }, true);
        public static Index CITY_PKEY = Internal.createIndex("city_pkey", City.CITY, new OrderField[] { City.CITY.CITY_ID }, true);
        public static Index IDX_FK_COUNTRY_ID = Internal.createIndex("idx_fk_country_id", City.CITY, new OrderField[] { City.CITY.COUNTRY_ID }, false);
        public static Index COUNTRY_PKEY = Internal.createIndex("country_pkey", Country.COUNTRY, new OrderField[] { Country.COUNTRY.COUNTRY_ID }, true);
        public static Index CUSTOMER_PKEY = Internal.createIndex("customer_pkey", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
        public static Index IDX_FK_ADDRESS_ID = Internal.createIndex("idx_fk_address_id", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.ADDRESS_ID }, false);
        public static Index IDX_FK_STORE_ID = Internal.createIndex("idx_fk_store_id", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.STORE_ID }, false);
        public static Index IDX_LAST_NAME = Internal.createIndex("idx_last_name", Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.LAST_NAME }, false);
        public static Index FILM_FULLTEXT_IDX = Internal.createIndex("film_fulltext_idx", Film.FILM, new OrderField[] { Film.FILM.FULLTEXT }, false);
        public static Index FILM_PKEY = Internal.createIndex("film_pkey", Film.FILM, new OrderField[] { Film.FILM.FILM_ID }, true);
        public static Index IDX_FK_LANGUAGE_ID = Internal.createIndex("idx_fk_language_id", Film.FILM, new OrderField[] { Film.FILM.LANGUAGE_ID }, false);
        public static Index IDX_FK_ORIGINAL_LANGUAGE_ID = Internal.createIndex("idx_fk_original_language_id", Film.FILM, new OrderField[] { Film.FILM.ORIGINAL_LANGUAGE_ID }, false);
        public static Index IDX_TITLE = Internal.createIndex("idx_title", Film.FILM, new OrderField[] { Film.FILM.TITLE }, false);
        public static Index FILM_ACTOR_PKEY = Internal.createIndex("film_actor_pkey", FilmActor.FILM_ACTOR, new OrderField[] { FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID }, true);
        public static Index IDX_FK_FILM_ID = Internal.createIndex("idx_fk_film_id", FilmActor.FILM_ACTOR, new OrderField[] { FilmActor.FILM_ACTOR.FILM_ID }, false);
        public static Index FILM_CATEGORY_PKEY = Internal.createIndex("film_category_pkey", FilmCategory.FILM_CATEGORY, new OrderField[] { FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID }, true);
        public static Index IDX_STORE_ID_FILM_ID = Internal.createIndex("idx_store_id_film_id", Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.STORE_ID, Inventory.INVENTORY.FILM_ID }, false);
        public static Index INVENTORY_PKEY = Internal.createIndex("inventory_pkey", Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
        public static Index LANGUAGE_PKEY = Internal.createIndex("language_pkey", Language.LANGUAGE, new OrderField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
        public static Index IDX_FK_CUSTOMER_ID = Internal.createIndex("idx_fk_customer_id", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.CUSTOMER_ID }, false);
        public static Index IDX_FK_STAFF_ID = Internal.createIndex("idx_fk_staff_id", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.STAFF_ID }, false);
        public static Index PAYMENT_PKEY = Internal.createIndex("payment_pkey", Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.PAYMENT_ID }, true);
        public static Index IDX_FK_PAYMENT_P2007_01_CUSTOMER_ID = Internal.createIndex("idx_fk_payment_p2007_01_customer_id", PaymentP2007_01.PAYMENT_P2007_01, new OrderField[] { PaymentP2007_01.PAYMENT_P2007_01.CUSTOMER_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_01_STAFF_ID = Internal.createIndex("idx_fk_payment_p2007_01_staff_id", PaymentP2007_01.PAYMENT_P2007_01, new OrderField[] { PaymentP2007_01.PAYMENT_P2007_01.STAFF_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_02_CUSTOMER_ID = Internal.createIndex("idx_fk_payment_p2007_02_customer_id", PaymentP2007_02.PAYMENT_P2007_02, new OrderField[] { PaymentP2007_02.PAYMENT_P2007_02.CUSTOMER_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_02_STAFF_ID = Internal.createIndex("idx_fk_payment_p2007_02_staff_id", PaymentP2007_02.PAYMENT_P2007_02, new OrderField[] { PaymentP2007_02.PAYMENT_P2007_02.STAFF_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_03_CUSTOMER_ID = Internal.createIndex("idx_fk_payment_p2007_03_customer_id", PaymentP2007_03.PAYMENT_P2007_03, new OrderField[] { PaymentP2007_03.PAYMENT_P2007_03.CUSTOMER_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_03_STAFF_ID = Internal.createIndex("idx_fk_payment_p2007_03_staff_id", PaymentP2007_03.PAYMENT_P2007_03, new OrderField[] { PaymentP2007_03.PAYMENT_P2007_03.STAFF_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_04_CUSTOMER_ID = Internal.createIndex("idx_fk_payment_p2007_04_customer_id", PaymentP2007_04.PAYMENT_P2007_04, new OrderField[] { PaymentP2007_04.PAYMENT_P2007_04.CUSTOMER_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_04_STAFF_ID = Internal.createIndex("idx_fk_payment_p2007_04_staff_id", PaymentP2007_04.PAYMENT_P2007_04, new OrderField[] { PaymentP2007_04.PAYMENT_P2007_04.STAFF_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_05_CUSTOMER_ID = Internal.createIndex("idx_fk_payment_p2007_05_customer_id", PaymentP2007_05.PAYMENT_P2007_05, new OrderField[] { PaymentP2007_05.PAYMENT_P2007_05.CUSTOMER_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_05_STAFF_ID = Internal.createIndex("idx_fk_payment_p2007_05_staff_id", PaymentP2007_05.PAYMENT_P2007_05, new OrderField[] { PaymentP2007_05.PAYMENT_P2007_05.STAFF_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_06_CUSTOMER_ID = Internal.createIndex("idx_fk_payment_p2007_06_customer_id", PaymentP2007_06.PAYMENT_P2007_06, new OrderField[] { PaymentP2007_06.PAYMENT_P2007_06.CUSTOMER_ID }, false);
        public static Index IDX_FK_PAYMENT_P2007_06_STAFF_ID = Internal.createIndex("idx_fk_payment_p2007_06_staff_id", PaymentP2007_06.PAYMENT_P2007_06, new OrderField[] { PaymentP2007_06.PAYMENT_P2007_06.STAFF_ID }, false);
        public static Index IDX_FK_INVENTORY_ID = Internal.createIndex("idx_fk_inventory_id", Rental.RENTAL, new OrderField[] { Rental.RENTAL.INVENTORY_ID }, false);
        public static Index IDX_UNQ_RENTAL_RENTAL_DATE_INVENTORY_ID_CUSTOMER_ID = Internal.createIndex("idx_unq_rental_rental_date_inventory_id_customer_id", Rental.RENTAL, new OrderField[] { Rental.RENTAL.RENTAL_DATE, Rental.RENTAL.INVENTORY_ID, Rental.RENTAL.CUSTOMER_ID }, true);
        public static Index RENTAL_PKEY = Internal.createIndex("rental_pkey", Rental.RENTAL, new OrderField[] { Rental.RENTAL.RENTAL_ID }, true);
        public static Index SCHEMA_VERSION_IR_IDX = Internal.createIndex("schema_version_ir_idx", SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK }, false);
        public static Index SCHEMA_VERSION_PK = Internal.createIndex("schema_version_pk", SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.VERSION }, true);
        public static Index SCHEMA_VERSION_S_IDX = Internal.createIndex("schema_version_s_idx", SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.SUCCESS }, false);
        public static Index SCHEMA_VERSION_VR_IDX = Internal.createIndex("schema_version_vr_idx", SchemaVersion.SCHEMA_VERSION, new OrderField[] { SchemaVersion.SCHEMA_VERSION.VERSION_RANK }, false);
        public static Index STAFF_PKEY = Internal.createIndex("staff_pkey", Staff.STAFF, new OrderField[] { Staff.STAFF.STAFF_ID }, true);
        public static Index IDX_UNQ_MANAGER_STAFF_ID = Internal.createIndex("idx_unq_manager_staff_id", Store.STORE, new OrderField[] { Store.STORE.MANAGER_STAFF_ID }, true);
        public static Index STORE_PKEY = Internal.createIndex("store_pkey", Store.STORE, new OrderField[] { Store.STORE.STORE_ID }, true);
    }
}
