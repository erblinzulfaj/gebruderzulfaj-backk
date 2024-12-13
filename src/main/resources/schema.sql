-- Table for Discount Model
CREATE TABLE IF NOT EXISTS Discount_History
(
    id
                  SERIAL
        PRIMARY
            KEY,
    code
                  VARCHAR(100)     NOT NULL,
    original_name VARCHAR(100)     NOT NULL,
    common_name   VARCHAR(100),
    discount      DOUBLE PRECISION NOT NULL,
    date          TIMESTAMP        NOT NULL
);

-- Table for Increment Model
CREATE TABLE IF NOT EXISTS Increment_History
(
    id
                  SERIAL
        PRIMARY
            KEY,
    code
                  VARCHAR(100)     NOT NULL,
    original_name VARCHAR(100)     NOT NULL,
    common_name   VARCHAR(100),
    increment     DOUBLE PRECISION NOT NULL,
    date          TIMESTAMP        NOT NULL
);

-- Table for Login Model
CREATE TABLE IF NOT EXISTS admin_user
(
    id
             SERIAL
        PRIMARY
            KEY,
    username
             VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);

-- Table for Product Model
CREATE TABLE IF NOT EXISTS Products
(
    id
                    SERIAL
        PRIMARY
            KEY,
    type
                    VARCHAR(50) NOT NULL,
    origin          VARCHAR(100),
    original_name   VARCHAR(100),
    code            VARCHAR(100),
    common_name     VARCHAR(100),
    quantity        DOUBLE PRECISION,
    quantity_type   VARCHAR(50),
    local_date_time TIMESTAMP
);

-- Table for User Model
CREATE TABLE IF NOT EXISTS users
(
    id
             SERIAL
        PRIMARY
            KEY,
    user_name
             VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    role     VARCHAR(50)  NOT NULL
);
