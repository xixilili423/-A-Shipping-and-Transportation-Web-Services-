create table address
(
    city        varchar(20) null,
    country     varchar(20) null,
    email       varchar(20) not null,
    state       varchar(20) null,
    street      varchar(20) null,
    type        varchar(20) null,
    latitude    varchar(20) null,
    longitude   varchar(20) null,
    postalcode  varchar(20) null,
    contactname varchar(20) not null,
    companyname varchar(20) null,
    id          int auto_increment
        primary key
);

create table courier
(
    boxname     varchar(20) null,
    servicename varchar(20) null,
    name        varchar(20) null,
    shipfrom    varchar(20) null,
    shipto      varchar(20) null,
    slug        varchar(20) not null
        primary key
);

create table courierboxtype
(
    boxname varchar(20) not null
        primary key,
    boxtype varchar(20) null
);

create table courierservicetype
(
    isdomestic      varchar(20) null,
    servicename     varchar(20) not null
        primary key,
    servicetype     varchar(20) null,
    shipfromcountry varchar(20) null
);

create table item
(
    description   varchar(20) null,
    descriptioncn varchar(20) null,
    hscode        varchar(20) null,
    itemid        varchar(20) not null
        primary key,
    origincountry varchar(20) null,
    price         varchar(20) null,
    quantity      mediumtext  null,
    sku           varchar(20) null,
    weight        varchar(20) null
);

create table parcel
(
    boxtype     varchar(20) null,
    description varchar(20) null,
    dimension   varchar(20) null,
    itemsid     varchar(20) null,
    weight      varchar(20) null
);

create table shipment
(
    deliveryinstructions varchar(20) null,
    returnto             varchar(20) null,
    shipfrom             varchar(20) null,
    shipto               varchar(20) null,
    type                 varchar(20) null,
    parcels              varchar(20) null
);

create table shipperaccount
(
    contactname varchar(20)  null,
    createdat   varchar(240) null,
    description varchar(20)  null,
    id          varchar(20)  not null
        primary key,
    settings    varchar(20)  null,
    slug        varchar(20)  null,
    timezone    varchar(20)  null,
    type        varchar(20)  null,
    updatedat   varchar(240) null,
    password    varchar(20)  not null
);

create table billing
(
    accountnumber varchar(20) null,
    country       varchar(20) null,
    postalcode    varchar(20) null,
    type          varchar(20) null,
    paidby        varchar(20) null,
    constraint billing_shipperaccount_id_fk
        foreign key (paidby) references shipperaccount (id)
);

create table user
(
    username varchar(20) null,
    password varchar(20) null
);


