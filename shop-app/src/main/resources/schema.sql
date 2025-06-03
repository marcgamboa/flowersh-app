CREATE TABLE IF NOT EXISTS ACCOUNTS (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    contact_no VARCHAR(50),
    email VARCHAR(50),
    address VARCHAR(50),
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(80) NOT NULL,
    role VARCHAR(50),
    enabled BOOLEAN DEFAULT TRUE
);